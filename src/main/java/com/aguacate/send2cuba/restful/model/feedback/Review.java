package com.aguacate.send2cuba.restful.model.feedback;

import com.aguacate.send2cuba.restful.model.base.PersistentEntity;

public class Review extends PersistentEntity {

	private static final long serialVersionUID = 6773370763292869967L;

	private Float score;

	private String comment;

	public Float getScore() {
		return score;
	}

	public void setScore(Float score) {
		this.score = score;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
