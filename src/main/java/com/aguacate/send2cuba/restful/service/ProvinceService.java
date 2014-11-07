package com.aguacate.send2cuba.restful.service;

import com.aguacate.send2cuba.restful.dto.TypeDto;

import java.util.List;

/**
 * Created by maikel on 11/6/2014.
 */
public interface ProvinceService {
    public List<TypeDto> findAll();

    public List<TypeDto> findProvinceByName(String name);

    public void save(TypeDto typeDto);


}
