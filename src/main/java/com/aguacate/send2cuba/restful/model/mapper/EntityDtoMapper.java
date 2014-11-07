package com.aguacate.send2cuba.restful.model.mapper;

import com.aguacate.send2cuba.restful.dto.BaseDto;
import com.aguacate.send2cuba.restful.model.base.PersistentEntity;

public interface EntityDtoMapper<E extends PersistentEntity, D extends BaseDto> {

	public D mapEntityToDto(E entity);

	public D mapEntityToDto(E entity, D dto);

	public E mapDtoToEntity(D dto);

	public E mapDtoToEntity(D dto, E entity);
}
