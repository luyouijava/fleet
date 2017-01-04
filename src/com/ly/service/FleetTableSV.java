package com.ly.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.ly.bean.FleetTableBean;
import com.ly.bean.InputFleetTableBean;
import com.ly.dao.FleetTableDao;
import com.ly.util.StringUtil;

public class FleetTableSV {
	public static void main(String args[]){
		String regex="^(-|\\+)?\\d+$";
		System.out.println("a".matches(regex));
	}
	/*
	 * 检测输入的数据是否合法
	 */
	public List<String> checkInputFleetTableBean(InputFleetTableBean notCheckFleetTableBean){
		String regex="^(-|\\+)?\\d+$";//正则表达式：纯数字
		List<String> errList = new ArrayList<String>();
		
		if(!notCheckFleetTableBean.getCarincome().matches(regex)){
			errList.add("车费只能为数字");
		}
		if(!notCheckFleetTableBean.getNetpay().matches(regex)){
			errList.add("网付只能为数字");
		}
		if(!notCheckFleetTableBean.getIdealincome().matches(regex)){
			errList.add("现收只能为数字");
		}
		if(!notCheckFleetTableBean.getRealincome().matches(regex)){
			errList.add("实际现收只能为数字");
		}
		if(!notCheckFleetTableBean.getIdealguarantee().matches(regex)){
			errList.add("保底只能为数字");
		}
		if(!notCheckFleetTableBean.getRealguarantee().matches(regex)){
			errList.add("实收保底只能为数字");
		}
		if(!notCheckFleetTableBean.getPetrolcost().matches(regex)){
			errList.add("公司加油只能为数字");
		}
		if(!notCheckFleetTableBean.getDrivingcost().matches(regex)){
			errList.add("行车费用只能为数字");
		}
		if(!notCheckFleetTableBean.getRebate().matches(regex)){
			errList.add("返利只能为数字");
		}
		if(!notCheckFleetTableBean.getNetprofit().matches(regex)){
			errList.add("净利润只能为数字");
		}
		if(StringUtil.isEmpty(notCheckFleetTableBean.getCarid()) || "-1".equals(notCheckFleetTableBean.getCarid())||"0".equals(notCheckFleetTableBean.getCarid())){
			errList.add("车号不能为空");
		}
		return errList;
	}
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
	
	/*
	 * 查询待审核数据
	 */
	public List getCheckPendFleetTableBean(){
		FleetTableDao fleetTableDao = new FleetTableDao();
		return fleetTableDao.getCheckPendFleetTableBean();
	}
	/*
	 * 查询已审核数据
	 */
	public List getCheckPassFleetTableBean(){
		FleetTableDao fleetTableDao = new FleetTableDao();
		return fleetTableDao.getCheckPassFleetTableBean();
	}
	/*
	 * 审核通过
	 */
	public void checkPass(int id){
		FleetTableDao fleetTableDao = new FleetTableDao();
		fleetTableDao.checkPass(id);
	}
}
