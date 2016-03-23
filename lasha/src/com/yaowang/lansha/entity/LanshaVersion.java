package com.yaowang.lansha.entity;import java.io.Serializable;import java.util.Date;/** * app版本表  * @author  *  */public class LanshaVersion implements Serializable{	private static final long serialVersionUID = 1L;		/**	 * id	 */	private String id;	/**	 * 版本号	 */	private String version;	/**	 * 包名	 */	private String name;	/**	 * 大小	 */	private String size;	/**	 * 更新日志	 */	private String updateLog;	/**	 * 是否强制更新 0否1是	 */	private String isForce;	/**	 * 上线时间	 */	private Date onlineTime;	/**	 * 状态 0删除1正常	 */	private String status;	/**	 * 地址	 */	private String address;		/**	 * 平台	 */	private String osType;//1:android,2:ios	/**	 * 客户端类型(0:普通，1:蓝鲨录)	 */	private String appType;		/**	 * 设置id	 */	 public void setId(String id){	 	this.id = id;	 }	 	 /**	  * 获取id	  */	 public String getId(){	 	return this.id;	 }	/**	 * 设置版本号	 */	 public void setVersion(String version){	 	this.version = version;	 }	 	 /**	  * 获取版本号	  */	 public String getVersion(){	 	return this.version;	 }	/**	 * 设置包名	 */	 public void setName(String name){	 	this.name = name;	 }	 	 /**	  * 获取包名	  */	 public String getName(){	 	return this.name;	 }	/**	 * 设置大小	 */	 public void setSize(String size){	 	this.size = size;	 }	 	 /**	  * 获取大小	  */	 public String getSize(){	 	return this.size;	 }	/**	 * 设置更新日志	 */	 public void setUpdateLog(String updateLog){	 	this.updateLog = updateLog;	 }	 	 /**	  * 获取更新日志	  */	 public String getUpdateLog(){	 	return this.updateLog;	 }	/**	 * 设置是否强制更新 0否1是	 */	 public void setIsForce(String isForce){	 	this.isForce = isForce;	 }	 	 /**	  * 获取是否强制更新 0否1是	  */	 public String getIsForce(){	 	return this.isForce;	 }	/**	 * 设置上线时间	 */	 public void setOnlineTime(Date onlineTime){	 	this.onlineTime = onlineTime;	 }	 	 /**	  * 获取上线时间	  */	 public Date getOnlineTime(){	 	return this.onlineTime;	 }	/**	 * 设置状态 0删除1正常	 */	 public void setStatus(String status){	 	this.status = status;	 }	 	 /**	  * 获取状态 0删除1正常	  */	 public String getStatus(){	 	return this.status;	 }	/**	 * 设置地址	 */	 public void setAddress(String address){	 	this.address = address;	 }	 	 /**	  * 获取地址	  */	 public String getAddress(){	 	return this.address;	 }	public String getOsType() {		return osType;	}	public void setOsType(String osType) {		this.osType = osType;	}	public String getAppType() {		return appType;	}	public void setAppType(String appType) {		this.appType = appType;	}}