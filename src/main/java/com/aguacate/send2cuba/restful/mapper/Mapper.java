package com.aguacate.send2cuba.restful.mapper;

import com.aguacate.send2cuba.restful.dto.BaseDto;
import com.aguacate.send2cuba.restful.model.base.PersistentEntity;

import java.lang.reflect.InvocationTargetException;

public interface Mapper<E extends PersistentEntity, D extends BaseDto> {

    public D mapToDto(E entity, D dto);

	public E mapToEntity(E entity, D dto);
}
