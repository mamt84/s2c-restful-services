package com.aguacate.send2cuba.restful.model.type;

import org.springframework.data.mongodb.core.mapping.Document;

import com.aguacate.send2cuba.restful.mapper.DoNotMap;

/**
 * Created by maikel on 11/6/2014.
 */
@Document
public class Province extends BaseType{

	@DoNotMap
	private static final long serialVersionUID = -1804748429059135017L;

	public Province() {
		super();
	}

	public Province(String value) {
		super(value);
	}
}
