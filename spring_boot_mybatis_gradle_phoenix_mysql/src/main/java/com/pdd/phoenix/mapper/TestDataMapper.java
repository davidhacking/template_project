package com.pdd.phoenix.mapper;

import com.pdd.phoenix.entity.TestData;

/**
 * Created by Arathi on 2016-03-25.
 */
public interface TestDataMapper {
    TestData findByCity(String city);
}
