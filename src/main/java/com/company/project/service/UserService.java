package com.company.project.service;
import com.company.project.model.User;
import com.company.project.core.Service;


/**
 * Created by Stone on 2021/04/26.
 */
public interface UserService extends Service<User> {

    User find(String userName, String passWord);
}
