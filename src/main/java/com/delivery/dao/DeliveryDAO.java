package com.delivery.dao;

	import org.springframework.data.jpa.repository.JpaRepository;

import com.delivery.entity.Delivery;


	public interface DeliveryDAO extends JpaRepository<Delivery, Integer> {

	}

