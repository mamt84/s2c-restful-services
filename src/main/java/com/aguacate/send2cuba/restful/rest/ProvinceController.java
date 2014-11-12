package com.aguacate.send2cuba.restful.rest;

import com.aguacate.send2cuba.restful.dto.TypeDto;
import com.aguacate.send2cuba.restful.repository.ProvinceRepository;
import com.aguacate.send2cuba.restful.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProvinceController {

    @Autowired
    ProvinceService provinceService;

	@RequestMapping("/provinces")
	public List<TypeDto> getAllProvinces() {
		return provinceService.findAll();
	}


}
