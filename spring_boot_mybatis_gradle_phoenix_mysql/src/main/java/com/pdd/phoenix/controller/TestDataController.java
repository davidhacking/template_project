package com.pdd.phoenix.controller;

import com.google.gson.Gson;
import com.pdd.phoenix.entity.Member;
import com.pdd.phoenix.entity.TestData;
import com.pdd.phoenix.mapper.MemberMapper;
import com.pdd.phoenix.mapper.TestDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Arathi on 2016-03-25.
 */
@RestController
@RequestMapping(value="/test")
public class TestDataController {
    @Autowired
    private TestDataMapper testDataMapper;

    @RequestMapping(value="/data", method=RequestMethod.GET)
    public String data() {
        Gson gson = new Gson();
        TestData testData = testDataMapper.findByCity("Phoenix");
        String json = gson.toJson(testData);
        return json;
    }
}
