package com.aguacate.send2cuba.restful.rest.backend;

import com.aguacate.send2cuba.restful.dto.backend.TypeDto;
import com.aguacate.send2cuba.restful.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
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
