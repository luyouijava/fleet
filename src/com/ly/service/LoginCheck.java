package com.ly.service;

import com.ly.bean.User;
import com.ly.dao.UserDao;

public class LoginCheck {
	public User loginCheck(String username,String password){
		UserDao userDao = new UserDao();
		User loginUser = userDao.getUserByUsername(username);
		if(loginUser!=null){
			if(password.equals(loginUser.getPassword())){
				//������ͬ�����ص�¼�û���Ϣ
				return loginUser;
			}else{
				//���벻��ͬ������null
				return null;
			}		
		}
		return null;
	}
	
}
