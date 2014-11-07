package com.aguacate.send2cuba.restful.model.offer;

import com.aguacate.send2cuba.restful.model.base.PersistentEntity;

public abstract class Offer extends PersistentEntity {

	private static final long serialVersionUID = -2010632110634176528L;

	private String description;

	private boolean special;

	private boolean active;

	private Float price;
}
