package com.aguacate.send2cuba.restful.model.mapper;

import com.aguacate.send2cuba.restful.dto.BaseDto;
import com.aguacate.send2cuba.restful.model.base.PersistentEntity;

import java.util.Iterator;

public interface Mapper<E extends PersistentEntity, D extends BaseDto> {

    public Iterable<D> mapCollectionToDto(Iterable<E> collection);

    public Iterable<E> mapCollectionToEntity(Iterable<D> collection);

	public D mapToDto(E entity);

	public D mapToDto(E entity, D dto);

	public E mapToEntity(D dto);

	public E mapToEntity(D dto, E entity);
}
