package com.aguacate.send2cuba.restful.service;

import com.aguacate.send2cuba.restful.dto.MoneyOfferDto;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by maikel on 11/6/2014.
 */
public interface MoneyOfferService {

    public List<MoneyOfferDto> getAllByBusinessAndCompany(BigInteger businessId, BigInteger companyId);

    public BigInteger delete(BigInteger businessId, BigInteger companyId, BigInteger itemId);

    public BigInteger saveOrUpdate(BigInteger businessId, BigInteger companyId, MoneyOfferDto item);

}
