package com.aguacate.send2cuba.restful.model.feedback;

import com.aguacate.send2cuba.restful.model.base.PersistentEntity;
import com.aguacate.send2cuba.restful.model.feedback.Review;
import com.google.common.collect.Lists;

public class Feedback extends PersistentEntity{

	private static final long serialVersionUID = 3878905111122795683L;

	private float rating;

	private Iterable<Review> reviews;

	public Feedback() {
		super();
		reviews = Lists.newArrayList();
	}

	public Feedback(Iterable<Review> reviews) {
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
