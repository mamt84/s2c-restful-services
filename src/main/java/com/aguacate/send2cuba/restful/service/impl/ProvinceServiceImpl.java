package com.aguacate.send2cuba.restful.service.impl;

import com.aguacate.send2cuba.restful.dto.TypeDto;
import com.aguacate.send2cuba.restful.mapper.ProvinceMapper;
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
        return getProvinceMapper().mapCollectionToDto(provinceRepository.findAll());
    }

    @Override
    public List<TypeDto> findProvinceByName(String name) {
        return getProvinceMapper().mapCollectionToDto(provinceRepository.findByValue(name));
    }

    @Override
    @Transactional
    public void save(TypeDto typeDto) {
        provinceRepository.save(getProvinceMapper().mapToEntity(typeDto));
    }

    ProvinceMapper getProvinceMapper(){
        return new ProvinceMapper();
    };

}
