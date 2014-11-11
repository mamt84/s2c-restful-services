package com.aguacate.send2cuba.restful.mapper;

import com.aguacate.send2cuba.restful.dto.TypeDto;
import com.aguacate.send2cuba.restful.model.type.Province;

/**
 * Created by maikel on 11/6/2014.
 */
public class ProvinceMapper extends AbstractMapper<Province,TypeDto> implements Mapper<Province,TypeDto>{

    @Override
    public TypeDto mapToDto(Province entity) {
        TypeDto typeDto = new TypeDto();
        typeDto.setValue(entity.getValue());
        return typeDto;
    }

    @Override
    public TypeDto mapToDto(Province entity, TypeDto dto) {
        return null;
    }

    @Override
    public Province mapToEntity(TypeDto dto) {
        Province Province = new Province();
        Province.setValue(dto.getValue());
        return Province;
    }

    @Override
    public Province mapToEntity(TypeDto dto, Province entity) {
        return null;
    }
}
