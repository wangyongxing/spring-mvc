package com.yaowang.entity;import java.io.Serializable;import java.util.Date;/** * 后台模块  * @author  *  */public class SysModel implements Serializable{	private static final long serialVersionUID = 1L;		/**	 * id	 */	private String id;	/**	 * parent_id	 */	private String parentId;	/**	 * name	 */	private String name;	/**	 * img	 */	private String img;		private String url;	/**	 * is_use	 */	private Boolean isUse;	/**	 * order_id	 */	private String orderId;	/**	 * create_time	 */	private Date createTime;		/**	 * 设置id	 */	 public void setId(String id){	 	this.id = id;	 }	 	 /**	  * 获取id	  */	 public String getId(){	 	return this.id;	 }	/**	 * 设置parent_id	 */	 public void setParentId(String parentId){	 	this.parentId = parentId;	 }	 	 /**	  * 获取parent_id	  */	 public String getParentId(){	 	return this.parentId;	 }	/**	 * 设置name	 */	 public void setName(String name){	 	this.name = name;	 }	 	 /**	  * 获取name	  */	 public String getName(){	 	return this.name;	 }	/**	 * 设置img	 */	 public void setImg(String img){	 	this.img = img;	 }	 	 /**	  * 获取img	  */	 public String getImg(){	 	return this.img;	 }	/**	 * 设置is_use	 */	 public void setIsUse(Boolean isUse){	 	this.isUse = isUse;	 }	 	 /**	  * 获取is_use	  */	 public Boolean getIsUse(){	 	return this.isUse;	 }	/**	 * 设置order_id	 */	 public void setOrderId(String orderId){	 	this.orderId = orderId;	 }	 	 /**	  * 获取order_id	  */	 public String getOrderId(){	 	return this.orderId;	 }	/**	 * 设置create_time	 */	 public void setCreateTime(Date createTime){	 	this.createTime = createTime;	 }	 	 /**	  * 获取create_time	  */	 public Date getCreateTime(){	 	return this.createTime;	 }	public String getUrl() {		return url;	}	public void setUrl(String url) {		this.url = url;	}}