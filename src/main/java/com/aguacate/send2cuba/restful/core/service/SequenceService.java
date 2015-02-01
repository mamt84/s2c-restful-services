package com.aguacate.send2cuba.restful.core.service;

import com.aguacate.send2cuba.restful.core.model.SequenceStore;
import com.aguacate.send2cuba.restful.core.repository.SequenceStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by maikel on 1/20/2015.
 */
@Component
public class SequenceService {

    @Autowired
    private SequenceStoreRepository sequenceStoreRepository;

    public int getNextNumber(String qualifiedClassName){

        String collectionName = getCollectionName(qualifiedClassName);
        SequenceStore sequenceStore = sequenceStoreRepository.findOne(collectionName);

        if(sequenceStore == null)
            sequenceStore = sequenceStoreRepository.save(new SequenceStore(collectionName,1));
        else{
            sequenceStore.setValue(sequenceStore.getValue() + 1);
            sequenceStore = sequenceStoreRepository.save(sequenceStore);
        }

        return sequenceStore.getValue();
    }

    private String getCollectionName( String qualifiedClassName){
        String[] pieces = qualifiedClassName.split("\\.");
        StringBuilder classNameBuilder = new StringBuilder(pieces.length == 0 ? "" :pieces[pieces.length-1]);
        if(0 != classNameBuilder.length()){
            classNameBuilder.setCharAt(0,Character.toLowerCase(classNameBuilder.charAt(0)));
            return classNameBuilder.toString();
        }
        return null;
    }
}
