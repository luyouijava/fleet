package com.lu.action;

import java.util.List;
import java.util.Vector;

import com.ly.bean.FleetTableBean;
import com.ly.service.FleetTableSV;

public class FleetTableAction {
	public List getFleetTableBeansByCarid(String carid){
		FleetTableSV fleetTableSV = new FleetTableSV();
		return fleetTableSV.getFleetTableBeansByCarid(carid);
	}	
	public void update(FleetTableBean newFleetTableBean){
		FleetTableSV fleetTableSV = new FleetTableSV();
		fleetTableSV.update(newFleetTableBean);
	}
}
