package com.aguacate.send2cuba.restful.mapper;

import com.aguacate.send2cuba.restful.dto.BaseDto;
import com.aguacate.send2cuba.restful.model.base.PersistentEntity;

import java.lang.reflect.InvocationTargetException;

public interface Mapper<E extends PersistentEntity, D extends BaseDto> {

    public Iterable<D> mapCollectionToDto(Iterable<E> collection) throws IllegalAccessException, InstantiationException, InvocationTargetException;

    public Iterable<E> mapCollectionToEntity(Iterable<D> collection) throws IllegalAccessException, InstantiationException, InvocationTargetException;

    //public D mapToDto(E entity);

	public D mapToDto(E entity, D dto);

	//public E mapToEntity(D dto);

	public E mapToEntity(D dto, E entity);
}
