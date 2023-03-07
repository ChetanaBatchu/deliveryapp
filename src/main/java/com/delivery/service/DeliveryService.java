package com.delivery.service;
 
import java.util.List;

import com.delivery.entity.Delivery;
import com.delivery.exceptions.DeliveryAlreadyExistsException;
import com.delivery.exceptions.DeliveryNotFoundException;

public interface DeliveryService {
	public List<Delivery> getAllDeliveries();
	public void getDeliveryById(Integer deliveryId) throws DeliveryNotFoundException;
	public Delivery addDelivery(Delivery delivery) throws DeliveryAlreadyExistsException;
	public Delivery updateDelivery(Delivery delivery);
	public void deleteDeliveryById(Integer deliveryId);
}
