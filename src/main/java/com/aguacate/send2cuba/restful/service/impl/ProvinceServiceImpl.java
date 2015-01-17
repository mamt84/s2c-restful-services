package com.aguacate.send2cuba.restful.service.impl;

import com.aguacate.send2cuba.restful.dto.backend.TypeDto;
import com.aguacate.send2cuba.restful.repository.ProvinceRepository;
import com.aguacate.send2cuba.restful.service.ProvinceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by maikel on 11/6/2014.
 */
@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    ProvinceRepository provinceRepository;

    @Override
    public List<TypeDto> findAll() {
        return null;
        //return getProvinceMapper().mapCollectionToDto(provinceRepository.findAll());
    }

    @Override
    public List<TypeDto> findProvinceByName(String name) {
        return null;
        //return getProvinceMapper().mapCollectionToDto(provinceRepository.findByValue(name));
    }

    @Override
    public void save(TypeDto typeDto) {

    }


}
