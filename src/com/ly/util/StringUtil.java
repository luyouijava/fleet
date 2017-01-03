package com.ly.util;

public class StringUtil {
  public static boolean isEmpty(String type){
	  if(!isNotEmpty(type)){
		  return true;
	  }else{
		  return false;
	  }
  }
  public static boolean isNotEmpty(String type){
	  //if(!type.equals("")&&type!=null){
	  if(type!=null&&!type.equals("")){
		  return true;
	  }else{
		  return false;
	  }
  }
}
