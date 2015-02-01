package com.aguacate.send2cuba.restful.core.repository;

import com.aguacate.send2cuba.restful.core.model.SequenceStore;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by maikel on 11/6/2014.
 */
public interface SequenceStoreRepository extends MongoRepository<SequenceStore, String> {
}
