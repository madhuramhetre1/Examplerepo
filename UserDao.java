package com.dao;

import com.model.User;

public interface UserDao {
 public void saveUser(User user);
 public User validateUser(User user);
}
