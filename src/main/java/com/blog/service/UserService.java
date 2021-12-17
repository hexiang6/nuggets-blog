package com.blog.service;

import com.blog.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
	public Integer addUser(Map<String,Object > map);
	public User getUser(Integer userId);
	public Integer updateUser(User user);
	public User getUserByUsername(String userName);
	public User getUserByUserInfo(Map<String,Object >map);
	List<User> getAllUser();
	List<User> getAllUserByLike(Map<String,Object >map);
	Integer delete(Map<String,Object >map);
}
