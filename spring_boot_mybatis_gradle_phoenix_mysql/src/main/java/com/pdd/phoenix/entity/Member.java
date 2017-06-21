package com.pdd.phoenix.entity;

/**
 * Created by Arathi on 2016-03-25.
 */
public class Member {
    private int id;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    private String loginName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
