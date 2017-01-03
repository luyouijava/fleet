package com.ly.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

  private static String url = "jdbc:mysql://"+DBConfig.getIp()+":"+DBConfig.getPort()+"/fleet_manage1?characterEncoding=utf-8";
  private static String userName = DBConfig.getUsername();
  private static String password = DBConfig.getPassword();
  private static String jdbcName = "com.mysql.jdbc.Driver";

  public static Connection getConnection() throws Exception{
	  Class.forName(jdbcName);
	  Connection con = DriverManager.getConnection(url,userName,password);
	  return con;
  }
  public void closeCon(Connection con) throws Exception{
	  if(con!=null){
		  con.close();
	  }
  }
  public static void main(String[] args){
	  MyConnection myConnection = new MyConnection();
	  Connection con = null;
	  try {
		con = myConnection.getConnection();
		System.out.println("数据库连接成功！");
	  } catch (Exception e) {
		  e.printStackTrace();
	  }finally{
		  try {
			  myConnection.closeCon(con);
		  } catch (Exception e) {
			  e.printStackTrace();
		  }
	  }
  	}
}
