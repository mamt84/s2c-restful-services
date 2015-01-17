package com.aguacate.send2cuba.restful.mapper;

import com.aguacate.send2cuba.restful.dto.backend.TypeDto;
import com.aguacate.send2cuba.restful.model.type.Province;
import org.junit.Assert;
import org.junit.Test;

import com.aguacate.send2cuba.restful.core.BaseIntegrationTest;

import java.math.BigInteger;

public class MapperTest extends BaseIntegrationTest {

	// TODO: Incomplete work AbstractMapper has to be given some shape, not good
	// as it is right now
	@Test
	public void testMapEntityToDto() {

        Province entity = new Province();
		TypeDto dto = new TypeDto();
		entity.setId(new BigInteger("1"));
		entity.setValue("value");

		DefaultMapper<Province, TypeDto> mapper = new DefaultMapper<>();

        mapper.mapToDto(entity, dto);

		Assert.assertEquals(entity.getId(), dto.getId());

	}

    @Test
	public void testMapDtoToEntity() {

        Province entity = new Province();
		TypeDto dto = new TypeDto();

        dto.setId(new BigInteger("1"));
		dto.setValue("value");

		DefaultMapper<Province, TypeDto> mapper = new DefaultMapper<>();

        mapper.mapToEntity(entity, dto);

		Assert.assertEquals(entity.getId(), dto.getId());
	}

}
