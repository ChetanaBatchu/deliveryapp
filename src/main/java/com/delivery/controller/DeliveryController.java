package com.delivery.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.entity.Delivery;
import com.delivery.exceptions.DeliveryAlreadyExistsException;
import com.delivery.service.DeliveryService;
	


	@RestController
	public class DeliveryController {
        @Autowired
		private DeliveryService deliveryService;
		
		@GetMapping("/delivery")
		public List<Delivery> getAllDeliverys() {
			return this.deliveryService.getAllDeliveries();
		}
		@GetMapping("/delivery/{deliveryId}")
		public ResponseEntity<Delivery> getDeliveryById(@PathVariable Integer deliveryId) {
			return new ResponseEntity<> (HttpStatus.OK);
		}
		
		@PostMapping("/delivery")
		public Delivery addDelivery(@RequestBody Delivery delivery) throws DeliveryAlreadyExistsException{
			return this.deliveryService.addDelivery(delivery);
	}
		
		@PutMapping("/delivery")
		public Delivery updateDelivery(@RequestBody Delivery delivery) {
			return this.deliveryService.updateDelivery(delivery);
		
		}
	@DeleteMapping("/delivery/{id}")
	public void deleteDeliveryById(@PathVariable("id") Integer deliveryId) {
		this.deliveryService.deleteDeliveryById(deliveryId);
	}


}


