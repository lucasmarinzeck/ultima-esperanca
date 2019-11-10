package com.aps.repository;

import org.springframework.data.repository.CrudRepository;

import com.aps.model.Item;

public interface ItemRepository extends CrudRepository<Item, Long>{
	
}
