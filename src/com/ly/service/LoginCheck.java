package com.ly.service;

import com.ly.bean.User;
import com.ly.dao.UserDao;

public class LoginCheck {
	public User loginCheck(String username,String password){
		UserDao userDao = new UserDao();
		User loginUser = userDao.getUserByUsername(username);
		if(loginUser!=null){
			if(password.equals(loginUser.getPassword())){
				//密码相同，返回登录用户信息
				return loginUser;
			}else{
				//密码不相同，返回null
				return null;
			}		
		}
		return null;
	}
	
}
