package com.ly.service;

import java.util.List;
import java.util.Vector;

import com.ly.bean.FleetTableBean;
import com.ly.dao.FleetTableDao;
import com.ly.util.StringUtil;

public class FleetTableSV {
	/*
	 * ����
	 */
	public boolean save(FleetTableBean fleetTableBean){
		FleetTableDao fleetTableDao = new FleetTableDao();
		try{
			fleetTableDao.save(fleetTableBean);
		}catch(Exception e){//�����쳣������false
			return false;
		}
		return true;//�������쳣������true
	}
	
	/*
	 * ��鴫��������Ƿ�Ϊ �գ�Ϊ�ս��丳ֵΪ��-1��
	 */
	public String checkInputField(String input){
		if(StringUtil.isEmpty(input)){
			return "-1";
		}
		return input;
	}
	
	/*
	 * ��ʾ���ݣ����ȡ�����ֶ�Ϊ-1�������ʾΪ��
	 */
	public String show2User(String str){
		if("-1".equals(str)){
			return "";
		}
		return str;
	}
	/*
	 * ���ݳ��Ų�ѯ��Ϣ
	 */
	public List getFleetTableBeansByCarid(String carid){
		FleetTableDao fleetTableDao = new FleetTableDao();
		return fleetTableDao.getFleetTableBeansByCarid(carid);
	}
	
	/*
	 * ����
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
