package com.workshop.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.webservice.entities.OrderItem;
import com.workshop.webservice.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
