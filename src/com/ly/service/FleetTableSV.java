package com.ly.service;

import java.util.List;
import java.util.Vector;

import com.ly.bean.FleetTableBean;
import com.ly.dao.FleetTableDao;
import com.ly.util.StringUtil;

public class FleetTableSV {
	/*
	 * 保存
	 */
	public boolean save(FleetTableBean fleetTableBean){
		FleetTableDao fleetTableDao = new FleetTableDao();
		try{
			fleetTableDao.save(fleetTableBean);
		}catch(Exception e){//保存异常，返回false
			return false;
		}
		return true;//保存无异常，返回true
	}
	
	/*
	 * 检查传入的数据是否为 空，为空将其赋值为“-1”
	 */
	public String checkInputField(String input){
		if(StringUtil.isEmpty(input)){
			return "-1";
		}
		return input;
	}
	
	/*
	 * 显示数据，如果取出的字段为-1，则对显示为空
	 */
	public String show2User(String str){
		if("-1".equals(str)){
			return "";
		}
		return str;
	}
	/*
	 * 根据车号查询信息
	 */
	public List getFleetTableBeansByCarid(String carid){
		FleetTableDao fleetTableDao = new FleetTableDao();
		return fleetTableDao.getFleetTableBeansByCarid(carid);
	}
	
	/*
	 * 更新
	 */
	public void update(FleetTableBean newFleetTableBean){
		FleetTableDao fleetTableDao = new FleetTableDao();
		fleetTableDao.update(newFleetTableBean);
	}
	
	public int getCountOfCheckPendFleetTableBean(){
		FleetTableDao fleetTableDao = new FleetTableDao();
		return fleetTableDao.getCountOfCheckPendFleetTableBean();
	}
}
