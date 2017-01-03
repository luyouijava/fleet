package com.ly.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ly.bean.User;
import com.ly.util.MyConnection;
import com.ly.util.MySqlUtil;

public class UserDao {
	public User getUserByUsername(String username){
		String sql = "select * from user where username=?";
		String[] parameters = {username};
		ResultSet rs = MySqlUtil.executeQuery(sql, parameters);
		User user = new User();
		try {
			if(rs.next()){//��ѯ����¼��ȡ����
				do{
					user.setUid(rs.getString("uid"));
					user.setUsername(rs.getString("username"));
					user.setPassword(rs.getString("password"));
					user.setLevel(rs.getString("level"));
				}while(rs.next());
			}else{
				//û�в鵽���ݷ��ؿ�
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			MySqlUtil.close(MySqlUtil.getRs(), MySqlUtil.getPs(), MySqlUtil.getCt());
		}
		return user;
	}
}
