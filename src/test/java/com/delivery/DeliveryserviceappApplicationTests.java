package com.delivery;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.delivery.dao.DeliveryDAO;
import com.delivery.entity.Delivery;



@SpringBootTest
class DeliveryserviceappApplicationTests {

	@Autowired
	private DeliveryDAO deliveryDao;
	
	@SuppressWarnings({ "deprecation" })
	@Test
	 void addDelivery() throws Exception {
		new Delivery(1, 789765421, "Bangalore", "Delivering");
		Assert.notNull(deliveryDao);
		
	}

}
