package com.ly.bean;
/*
 * 由于用户传入的数据字段全为String类型，因此此类为了方便检测传入的String是否合法
 */
public class InputFleetTableBean {
	private String carid;
	private String startdate;
	private String enddate;
	private String driver;
	private String teamtype;
	private String carincome;
	private String netpay;
	private String idealincome;
	private String realincome;
	private String idealguarantee;
	private String realguarantee;
	private String petrolcost;
	private String drivingcost;
	private String other;
	private String rebate;
	private String netprofit;
	private String flag;
	private String trip;
	public String getCarid() {
		return carid;
	}
	public void setCarid(String carid) {
		this.carid = carid;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getTeamtype() {
		return teamtype;
	}
	public void setTeamtype(String teamtype) {
		this.teamtype = teamtype;
	}
	public String getCarincome() {
		return carincome;
	}
	public void setCarincome(String carincome) {
		this.carincome = carincome;
	}
	public String getNetpay() {
		return netpay;
	}
	public void setNetpay(String netpay) {
		this.netpay = netpay;
	}
	public String getIdealincome() {
		return idealincome;
	}
	public void setIdealincome(String idealincome) {
		this.idealincome = idealincome;
	}
	public String getRealincome() {
		return realincome;
	}
	public void setRealincome(String realincome) {
		this.realincome = realincome;
	}
	public String getIdealguarantee() {
		return idealguarantee;
	}
	public void setIdealguarantee(String idealguarantee) {
		this.idealguarantee = idealguarantee;
	}
	public String getRealguarantee() {
		return realguarantee;
	}
	public void setRealguarantee(String realguarantee) {
		this.realguarantee = realguarantee;
	}
	public String getPetrolcost() {
		return petrolcost;
	}
	public void setPetrolcost(String petrolcost) {
		this.petrolcost = petrolcost;
	}
	public String getDrivingcost() {
		return drivingcost;
	}
	public void setDrivingcost(String drivingcost) {
		this.drivingcost = drivingcost;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
	public String getRebate() {
		return rebate;
	}
	public void setRebate(String rebate) {
		this.rebate = rebate;
	}
	public String getNetprofit() {
		return netprofit;
	}
	public void setNetprofit(String netprofit) {
		this.netprofit = netprofit;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getTrip() {
		return trip;
	}
	public void setTrip(String trip) {
		this.trip = trip;
	}
}
