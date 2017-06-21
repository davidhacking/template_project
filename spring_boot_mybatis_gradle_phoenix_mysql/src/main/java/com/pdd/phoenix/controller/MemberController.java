package com.pdd.phoenix.controller;

import com.google.gson.Gson;
import com.pdd.phoenix.entity.Member;
import com.pdd.phoenix.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Arathi on 2016-03-25.
 */
@RestController
@RequestMapping(value="/member")
public class MemberController {
    @Autowired
    private MemberMapper memberMapper;

    @RequestMapping(value="/test", method=RequestMethod.GET)
    public String get_member_info() {
        Gson gson = new Gson();
        Member member = memberMapper.getMemberById("1");
        String json = gson.toJson(member);
        return json;
    }
}
