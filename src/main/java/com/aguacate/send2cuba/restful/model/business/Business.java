package com.aguacate.send2cuba.restful.model.business;

import com.aguacate.send2cuba.restful.model.base.PersistentEntity;
import com.aguacate.send2cuba.restful.model.feedback.Feedback;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 * Created by maikel on 11/15/2014.
 */
public class Business extends PersistentEntity {

    private String fullLocation;

    private boolean discloseLocation;

    private Feedback feedback;

    public String getFullLocation() {
        return fullLocation;
    }

    public void setFullLocation(String fullLocation) {
        this.fullLocation = fullLocation;
    }

    public boolean isDiscloseLocation() {
        return discloseLocation;
    }

    public void setDiscloseLocation(boolean discloseLocation) {
        this.discloseLocation = discloseLocation;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }
}
