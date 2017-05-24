package io.altar.upacademy.repositories;

import io.altar.upacademy.Shelf;

public class ShelfRepository extends EntityRepository<Shelf> {
	
	private static final ShelfRepository instance = new ShelfRepository();
	
	public static ShelfRepository getInstance(){
		return instance;
	}
	
	private ShelfRepository(){
				
	}
} 
