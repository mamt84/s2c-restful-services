package com.aguacate.send2cuba.restful.model.business;

import com.aguacate.send2cuba.restful.model.base.PersistentEntity;
import com.aguacate.send2cuba.restful.model.feedback.Feedback;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 * Created by maikel on 11/15/2014.
 */
public class Business extends PersistentEntity {
    // Represents the concept of a physical person or office that belongs to a larger company
    // (let's say Cubamax has offices in Kentucky and Miami,
    // This would represent one of those offices with its specific details, prices, location, everything,
    // however, it must be managed by a single system user [different people can share the same user,
    // or  we make it better in the future])

    private MapLocation mapLocation;

    @DBRef(lazy = true)
    private Feedback feedback;

}
