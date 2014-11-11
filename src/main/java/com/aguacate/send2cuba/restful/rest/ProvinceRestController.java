package com.aguacate.send2cuba.restful.rest;

import com.aguacate.send2cuba.restful.dto.TypeDto;
import com.aguacate.send2cuba.restful.repository.ProvinceRepository;
import com.aguacate.send2cuba.restful.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/backend")
public class ProvinceRestController {

    @Autowired
    ProvinceService provinceService;

	@RequestMapping("/province/all")
	public List<TypeDto> getAllProvinces() {
		return provinceService.findAll();
	}


}
