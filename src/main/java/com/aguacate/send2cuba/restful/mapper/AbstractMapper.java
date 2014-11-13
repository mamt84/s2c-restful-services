package com.aguacate.send2cuba.restful.mapper;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.dozer.DozerBeanMapperSingletonWrapper;
import org.springframework.beans.BeanUtils;

import com.aguacate.send2cuba.restful.dto.BaseDto;
import com.aguacate.send2cuba.restful.exception.AguacateRuntimeException;
import com.aguacate.send2cuba.restful.model.base.PersistentEntity;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

/**
 * Created by maikel on 11/6/2014.
 */
// TODO: Incomplete work, has to be finished
public class AbstractMapper<E extends PersistentEntity, D extends BaseDto> implements
		Mapper<E, D> {

	@Override
	public List<D> mapCollectionToDto(Iterable<E> collection) {
		List<D> list = new ArrayList<D>();
		for (E e : collection) {
			list.add(this.mapToDto(e));
		}
		return list;
	}

	@Override
	public List<E> mapCollectionToEntity(Iterable<D> collection) {
		List<E> list = new ArrayList<E>();
		for (D d : collection) {
			list.add(this.mapToEntity(d));
		}
		return list;
	}

	@Override
	public D mapToDto(E entity) {

		return null;
	}

	@Override
	public D mapToDto(E entity, D dto) {
		org.dozer.Mapper mapper = DozerBeanMapperSingletonWrapper.getInstance();
		mapper.map(entity, dto);
		return dto;
		// return (D) mapSourceToTarget(entity, dto);
	}

	@Override
	public E mapToEntity(D dto) {
		// return DozerBeanMapperSingletonWrapper.getInstance().map(dto, )
		return null;
	}

	@Override
	public E mapToEntity(D dto, E entity) {
		DozerBeanMapperSingletonWrapper.getInstance().map(dto, entity);
		return entity;
		// return (E) mapSourceToTarget(dto, entity);
	}

	private Object mapSourceToTarget(Object source, Object target) {

		if (target == null) {
			throw new AguacateRuntimeException("Dto cannot be null");
		}

		Class<?> entityClass = source.getClass();

		Collection<String> entityFieldNames = Collections2.transform(Collections2.filter(
				Lists.newArrayList(entityClass.getFields()), new Predicate<Field>() {
					@Override
					public boolean apply(Field input) {
						return input.isAnnotationPresent(DoNotMap.class);
					}
				}), new Function<Field, String>() {
			@Override
			public String apply(Field input) {
				return input.getName();
			}
		});

		/*
		 * Using introspection to copy all the beans fields to another bean
		 * excluding all fields annotated with @DoNotMap. Only requirement as
		 * per JabaBeans specification is that the fields have accesor methods
		 * and have the same name in source as in target objects
		 */
		BeanUtils.copyProperties(source, target,
				entityFieldNames.toArray(new String[entityFieldNames.size()]));
		// org.apache.commons.beanutils.BeanUtils.

		// Iterating thru getters

		return target;

	}

}
