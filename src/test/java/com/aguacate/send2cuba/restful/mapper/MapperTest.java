package com.aguacate.send2cuba.restful.mapper;

import org.junit.Assert;
import org.junit.Test;

import com.aguacate.send2cuba.restful.core.BaseIntegrationTest;
import com.aguacate.send2cuba.restful.dto.TypeDto;
import com.aguacate.send2cuba.restful.model.type.Province;

import java.math.BigInteger;

public class MapperTest extends BaseIntegrationTest {

	// TODO: Incomplete work AbstractMapper has to be given some shape, not good
	// as it is right now
	@Test
	public void testMapDtoToEntity() {
		/*
        Province actual = new Province();
		TypeDto dto = new TypeDto();
		dto.setId(new BigInteger("1"));
		dto.setValue("value");

		AbstractMapper<Province, TypeDto> mapper = new AbstractMapper<Province, TypeDto>();
		mapper.mapToEntity(dto, actual);

		Province expected = new Province("value");
		expected.setId(new BigInteger("1"));

		Assert.assertEquals(expected, actual);
		*/
	}

}
