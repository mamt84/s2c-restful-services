package com.aguacate.send2cuba.restful.mapper;

import com.aguacate.send2cuba.restful.dto.BaseDto;
import com.aguacate.send2cuba.restful.model.base.PersistentEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maikel on 11/6/2014.
 */
public abstract class AbstractMapper<E extends PersistentEntity, D extends BaseDto> implements Mapper<E,D>{

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
}
