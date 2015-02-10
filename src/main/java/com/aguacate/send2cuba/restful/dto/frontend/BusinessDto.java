package com.aguacate.send2cuba.restful.dto.frontend;

import java.math.BigInteger;

/**
 * Created by maikel on 11/15/2014.
 */
public class BusinessDto{

    private BigInteger id;
    private FeedbackDto feedback;
    
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public FeedbackDto getFeedback() {
		return feedback;
	}
	public void setFeedback(FeedbackDto feedback) {
		this.feedback = feedback;
	}


}
