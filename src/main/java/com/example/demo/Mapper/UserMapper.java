package com.example.demo.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.Entity.UserList;

@Mapper
public interface UserMapper {



	void editUser(UserList userList);

	List<UserList> findUser();
}