package com.aguacate.send2cuba.restful.model.user;

import com.google.common.collect.Lists;

public class Provider extends User {

	private static final long serialVersionUID = 3878905111122795683L;

	// Denormalized here to not to iterate over the reviews to retrieve the
	// overall rating
	// TODO: find a way to dynamically update it when a new review get
	// introduced
	private float rating;

	private Iterable<Review> reviews;

	public Provider() {
		super();
		reviews = Lists.newArrayList();
	}

	public Provider(Iterable<Review> reviews) {
		super();
		this.reviews = reviews;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public Iterable<Review> getReviews() {
		return reviews;
	}

	public void setReviews(Iterable<Review> reviews) {
		this.reviews = reviews;
	}
}
