package com.aguacate.send2cuba.restful.mapper;

import com.aguacate.send2cuba.restful.dto.backend.TypeDto;
import com.aguacate.send2cuba.restful.model.type.Province;
import org.springframework.stereotype.Component;

/**
 * Created by maikel on 11/6/2014.
 */

@Component
public class ProvinceMapper extends AbstractMapper<Province,TypeDto> {

    @Override
    protected Province getNewEntity() {
        return new Province();
    }

    @Override
    protected TypeDto getNewDto() {
        return new TypeDto();
    }
}
