package com.ly.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.ly.bean.FleetTableBean;
import com.ly.bean.User;
import com.ly.util.MySqlUtil;

public class FleetTableDao {
	/*
	 * 保存
	 */
	public void save(FleetTableBean fleetTableBean){
		String sql = "INSERT INTO `fleet_table` VALUES ('0', ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		String[] parameters = {fleetTableBean.getCarid(),fleetTableBean.getStartdate().toString(),fleetTableBean.getEnddate().toString(),
							  fleetTableBean.getDriver(),fleetTableBean.getTeamtype(),fleetTableBean.getCarincome()+"",
							  fleetTableBean.getNetpay()+"",fleetTableBean.getIdealincome()+"",fleetTableBean.getRealincome()+"",
							  fleetTableBean.getIdealguarantee()+"",fleetTableBean.getRealguarantee()+"",fleetTableBean.getPetrolcost()+"",
							  fleetTableBean.getDrivingcost()+"",fleetTableBean.getOther(),fleetTableBean.getRebate()+"",
							  fleetTableBean.getNetprofit()+"",fleetTableBean.getFlag()+"",fleetTableBean.getTrip()};
		try {
			MySqlUtil.executeUpdate(sql, parameters);
		} catch (Exception e) {	
			throw new RuntimeException(e.getMessage());
		}      
	}
	
	public List getFleetTableBeansByCarid(String carid){
		String sql = "SELECT * FROM fleet_table a WHERE a.carid like \'%"+carid+"%\'";
		String[] parameters = {};
		ResultSet rs;
		List<FleetTableBean> List = new ArrayList<FleetTableBean>();
		try {
			rs = MySqlUtil.executeQuery(sql, parameters);
			while(rs.next()){
				FleetTableBean fleetTableBean = new FleetTableBean();
				fleetTableBean.setId(rs.getInt("id"));
				fleetTableBean.setCarid(rs.getString("carid"));
				fleetTableBean.setCarincome(rs.getInt("carincome"));
				fleetTableBean.setDriver(rs.getString("driver"));
				fleetTableBean.setDrivingcost(rs.getInt("drivingcost"));
				fleetTableBean.setEnddate(rs.getString("enddate"));
				fleetTableBean.setFlag(rs.getInt("flag"));
				fleetTableBean.setIdealguarantee(rs.getInt("idealguarantee"));
				fleetTableBean.setIdealincome(rs.getInt("idealincome"));
				fleetTableBean.setNetpay(rs.getInt("netpay"));
				fleetTableBean.setNetprofit(rs.getInt("netprofit"));
				fleetTableBean.setOther(rs.getString("other"));
				fleetTableBean.setPetrolcost(rs.getInt("petrolcost"));
				fleetTableBean.setRealguarantee(rs.getInt("realguarantee"));
				fleetTableBean.setRealincome(rs.getInt("realincome"));
				fleetTableBean.setRebate(rs.getInt("rebate"));
				fleetTableBean.setStartdate(rs.getString("startdate"));
				fleetTableBean.setTeamtype(rs.getString("teamtype"));
				fleetTableBean.setTrip(rs.getString("trip"));
				List.add(fleetTableBean);
				fleetTableBean = null;//gc
			}
		} catch (Exception e) {	
			throw new RuntimeException(e.getMessage());
		}finally{
			MySqlUtil.close(MySqlUtil.getRs(), MySqlUtil.getPs(), MySqlUtil.getCt());
		}
		return List;
	}
	
	/*
	 * 更新
	 */
	public void update(FleetTableBean newFleetTableBean){
		int id = newFleetTableBean.getId();
		String sql = "UPDATE fleet_table t SET t.carid=?,t.carincome=?,t.driver=?,t.drivingcost=?,t.enddate=?,t.flag=?,t.idealguarantee=?,t.idealincome=?,t.netpay=?,t.netprofit=?,t.other=?,t.petrolcost=?,t.realguarantee=?,t.realincome=?,t.rebate=?,t.startdate=?,t.teamtype=?,t.trip=? WHERE t.id="+id;
		String[] parameters = {newFleetTableBean.getCarid(),newFleetTableBean.getCarincome()+"",newFleetTableBean.getDriver(),
				newFleetTableBean.getDrivingcost()+"",newFleetTableBean.getEnddate(),newFleetTableBean.getFlag()+"",newFleetTableBean.getIdealguarantee()+"",
				newFleetTableBean.getIdealincome()+"",newFleetTableBean.getNetpay()+"",newFleetTableBean.getNetprofit()+"",newFleetTableBean.getOther(),newFleetTableBean.getPetrolcost()+"",newFleetTableBean.getRealguarantee()+"",newFleetTableBean.getRealincome()+"",
				newFleetTableBean.getRebate()+"",newFleetTableBean.getStartdate(),newFleetTableBean.getTeamtype(),newFleetTableBean.getTrip()};
		try {
			MySqlUtil.executeUpdate(sql, parameters);
		} catch (Exception e) {	
			throw new RuntimeException(e.getMessage());
		}
	}
	
	/*
	 * 查询待审核数据
	 */
	public List getCheckPendFleetTableBean(){
		String sql = "SELECT * FROM fleet_table a WHERE a.flag = 0";
		String[] parameters = {};
		ResultSet rs;
		List<FleetTableBean> List = new ArrayList<FleetTableBean>();
		try {
			rs = MySqlUtil.executeQuery(sql, parameters);
			while(rs.next()){
				FleetTableBean fleetTableBean = new FleetTableBean();
				fleetTableBean.setId(rs.getInt("id"));
				fleetTableBean.setCarid(rs.getString("carid"));
				fleetTableBean.setCarincome(rs.getInt("carincome"));
				fleetTableBean.setDriver(rs.getString("driver"));
				fleetTableBean.setDrivingcost(rs.getInt("drivingcost"));
				fleetTableBean.setEnddate(rs.getString("enddate"));
				fleetTableBean.setFlag(rs.getInt("flag"));
				fleetTableBean.setIdealguarantee(rs.getInt("idealguarantee"));
				fleetTableBean.setIdealincome(rs.getInt("idealincome"));
				fleetTableBean.setNetpay(rs.getInt("netpay"));
				fleetTableBean.setNetprofit(rs.getInt("netprofit"));
				fleetTableBean.setOther(rs.getString("other"));
				fleetTableBean.setPetrolcost(rs.getInt("petrolcost"));
				fleetTableBean.setRealguarantee(rs.getInt("realguarantee"));
				fleetTableBean.setRealincome(rs.getInt("realincome"));
				fleetTableBean.setRebate(rs.getInt("rebate"));
				fleetTableBean.setStartdate(rs.getString("startdate"));
				fleetTableBean.setTeamtype(rs.getString("teamtype"));
				fleetTableBean.setTrip(rs.getString("trip"));
				List.add(fleetTableBean);
				fleetTableBean = null;//gc
			}
		} catch (Exception e) {	
			throw new RuntimeException(e.getMessage());
		}finally{
			MySqlUtil.close(MySqlUtil.getRs(), MySqlUtil.getPs(), MySqlUtil.getCt());
		}
		return List;
	}
	
	/*
	 * 查询待审核数据条数
	 */
	public int getCountOfCheckPendFleetTableBean(){
		String sql = "SELECT COUNT(*) FROM fleet_table a WHERE a.flag = 0";
		String[] parameters = {};
		ResultSet rs;
		int count = 0;
		try {
			rs = MySqlUtil.executeQuery(sql, parameters);
			if(rs.next()){
				count = rs.getInt(1);
			}
		} catch (Exception e) {	
			throw new RuntimeException(e.getMessage());
		}finally{
			MySqlUtil.close(MySqlUtil.getRs(), MySqlUtil.getPs(), MySqlUtil.getCt());
		}
		return count;
	}
	
	/*
	 * 查询已审核数据
	 */
	public List getCheckPassFleetTableBean(){
		String sql = "SELECT * FROM fleet_table a WHERE a.flag = 1";
		String[] parameters = {};
		ResultSet rs;
		List<FleetTableBean> List = new ArrayList<FleetTableBean>();
		try {
			rs = MySqlUtil.executeQuery(sql, parameters);
			while(rs.next()){
				FleetTableBean fleetTableBean = new FleetTableBean();
				fleetTableBean.setId(rs.getInt("id"));
				fleetTableBean.setCarid(rs.getString("carid"));
				fleetTableBean.setCarincome(rs.getInt("carincome"));
				fleetTableBean.setDriver(rs.getString("driver"));
				fleetTableBean.setDrivingcost(rs.getInt("drivingcost"));
				fleetTableBean.setEnddate(rs.getString("enddate"));
				fleetTableBean.setFlag(rs.getInt("flag"));
				fleetTableBean.setIdealguarantee(rs.getInt("idealguarantee"));
				fleetTableBean.setIdealincome(rs.getInt("idealincome"));
				fleetTableBean.setNetpay(rs.getInt("netpay"));
				fleetTableBean.setNetprofit(rs.getInt("netprofit"));
				fleetTableBean.setOther(rs.getString("other"));
				fleetTableBean.setPetrolcost(rs.getInt("petrolcost"));
				fleetTableBean.setRealguarantee(rs.getInt("realguarantee"));
				fleetTableBean.setRealincome(rs.getInt("realincome"));
				fleetTableBean.setRebate(rs.getInt("rebate"));
				fleetTableBean.setStartdate(rs.getString("startdate"));
				fleetTableBean.setTeamtype(rs.getString("teamtype"));
				fleetTableBean.setTrip(rs.getString("trip"));
				List.add(fleetTableBean);
				fleetTableBean = null;//gc
			}
		} catch (Exception e) {	
			throw new RuntimeException(e.getMessage());
		}finally{
			MySqlUtil.close(MySqlUtil.getRs(), MySqlUtil.getPs(), MySqlUtil.getCt());
		}
		return List;
	}
	/*
	 * 审核通过
	 */
	public void checkPass(int id){
		String sql = "UPDATE fleet_table t SET t.flag = 1 WHERE t.id="+id;
		String[] parameters = {};
		try {
			MySqlUtil.executeUpdate(sql, parameters);
		} catch (Exception e) {	
			throw new RuntimeException(e.getMessage());
		}
	}
	
	/*
	 * 查询待录入数据
	 */

	
	/*
	 * 查询待录入数据条数
	 */
}
