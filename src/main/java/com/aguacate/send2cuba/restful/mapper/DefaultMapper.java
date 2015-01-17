package com.aguacate.send2cuba.restful.mapper;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.aguacate.send2cuba.restful.dto.BaseDto;
import com.aguacate.send2cuba.restful.exception.AguacateRuntimeException;
import com.aguacate.send2cuba.restful.model.base.PersistentEntity;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;

/**
 * Created by maikel on 11/6/2014.
 */
@Component
public class DefaultMapper<E extends PersistentEntity, D extends BaseDto> implements Mapper<E, D> {

	@Override
	public D mapToDto(E entity, D dto) {

        Class<?> dtoClass = dto.getClass();

        Collection<String> entityFieldNames = getFieldsToMap(dtoClass);

        BeanUtils.copyProperties(entity, dto,
                entityFieldNames.toArray(new String[entityFieldNames.size()]));

        return dto;
	}

	@Override
	public E mapToEntity(E entity, D dto) {

        Class<?> dtoClass = dto.getClass();

        Collection<String>  entityFieldNames = getFieldsToMap(dtoClass);

        BeanUtils.copyProperties(dto, entity,
                entityFieldNames.toArray(new String[entityFieldNames.size()]));

        return entity;
	}

    private Collection<String> getFieldsToMap(Class dtoClass){  // always mapping the Dto
        Collection<String> entityFieldNames = Collections2.transform(Collections2.filter(
                        Lists.newArrayList(dtoClass.getFields()),
                        input -> input.isAnnotationPresent(DoNotMap.class)
                                && !(Collection.class.isAssignableFrom(input.getType()))
                                && !(BaseDto.class.isAssignableFrom(input.getType())) ),
                input -> input.getName());
        return entityFieldNames;
    }
}
