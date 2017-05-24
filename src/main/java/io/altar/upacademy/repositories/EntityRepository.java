package io.altar.upacademy.repositories;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import io.altar.upacademy.Entity;



public abstract class EntityRepository <T extends Entity>{

	private Map<Long, T> mapa = new LinkedHashMap<>();

	private long maiorId = 0;

	// ++maiorId incrementa id e atualiza a variavel ao mesmo tempo e faz o return do mesmo  
	private long devolverId(){
		return ++maiorId;
	}


	// criar entidades
	public long criar(T entity){
		if(entity.getEntityId() != null) {
			throw new IllegalArgumentException("Entity shouhld not have ID on create");
		}
		long idCriado = devolverId();
		entity.setEntityId(idCriado);
		mapa.put(idCriado, entity);
		return idCriado;
	}
	
	// consultar entidades
	public Collection<T> consultar(){
		return mapa.values();
		
	}
	public T consultar(long ID){
		return mapa.get(ID);
	}
	
	// editar entidades
	
	public void editar(T editado){
		
	if(editado.getEntityId() == null){
		throw new IllegalArgumentException("Entity must have a ID");
	}
		long idEditado = editado.getEntityId();
		mapa.put(idEditado, editado);
		
	}
	
	// remover entidades

	public void remover(T entity){
		
		long ID=entity.getEntityId();
		mapa.remove(ID);
	}
}
	
