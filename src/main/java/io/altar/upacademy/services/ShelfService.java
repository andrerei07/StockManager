package io.altar.upacademy.services;

import java.util.Collection;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import io.altar.upacademy.Shelf;
import io.altar.upacademy.repositories.ShelfRepository;

@Named("shelfService")
@RequestScoped
public class ShelfService {

	private ShelfRepository shelfRepository = ShelfRepository.getInstance();
	
	
	public Shelf createShelf(Shelf shelf){
		
		shelfRepository.criar(shelf);
		return shelf;
	}
	
	public Shelf updateShelf(Shelf shelf){
		
		shelfRepository.editar(shelf);
		return shelf;
	}
	
	public Collection<Shelf> consultShelf(Shelf shelf){
		
		return shelfRepository.consultar();
		
	}
	
	public Shelf  consulteOneShelf(long ID){
		
		return shelfRepository.consultar(ID);
	}
	
	public String removeShelf(List<Shelf> list){
		
		int numShelfSelecionados = list.size();
		for(int i=0 ;i<numShelfSelecionados;i++){
			Shelf shelf =list.get(i);
			shelfRepository.remover(shelf);
		}
		return "shelf";
	}
}
