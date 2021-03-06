package com.jubaka.sors.service;

import com.jubaka.sors.entities.User;
import com.jubaka.sors.serverSide.UserBase;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by root on 02.09.16.
 */

@Named
@ApplicationScoped
public class UserService {

    public User checkUser(String nickName, String pass) {

        UserBase ub = UserBase.getInstance();
        User uObj = ub.getUser(nickName);
        if (uObj.getPass().equals(pass)) {
           return uObj;
        }
        return null;
    }
}
