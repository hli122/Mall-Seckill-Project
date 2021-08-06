package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;

public interface UserService {
    // this method is used to get the user object through user id
    UserModel getUserId(Integer id);

    /**
     *
     * @param telphone: user register telephone
     * @param encryptPassword: user encrypted password
     * @throws BusinessException
     */
    UserModel validateLogin(String telphone, String encryptPassword) throws BusinessException;

    void register(UserModel userModel) throws BusinessException;
}
