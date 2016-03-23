package com.yaowang.lansha.entity;import java.io.Serializable;import java.util.Date;/** * 热门推荐房间  * @author  *  */public class YwUserApply implements Serializable{	private static final long serialVersionUID = 1L;		/**	 * id	 */	private String id;	/**	 * user_id	 */	private String userId;	/**	 * 真实姓名	 */	private String realname;	/**	 * 身份证号码	 */	private String identitycard;	/**	 * 手持身份证正面	 */	private String pic1;	/**	 * 身份证正面	 */	private String pic2;	/**	 * 身份证反面	 */	private String pic3;	/**	 * 身份证到期时间	 */	private Date expirationTime;	/**	 * 状态(0:未审核,1:审核通过,2:审核不通过)	 */	private String status;	/**	 * 创建时间	 */	private Date createTime;	/**	 * 备注	 */	private String remark;	/**	 * 审核人	 */	private String aduitUid;	/**	 * 审核时间	 */	private Date aduitTime;		/**	 * 设置id	 */	 public void setId(String id){	 	this.id = id;	 }	 	 /**	  * 获取id	  */	 public String getId(){	 	return this.id;	 }	/**	 * 设置user_id	 */	 public void setUserId(String userId){	 	this.userId = userId;	 }	 	 /**	  * 获取user_id	  */	 public String getUserId(){	 	return this.userId;	 }	/**	 * 设置真实姓名	 */	 public void setRealname(String realname){	 	this.realname = realname;	 }	 	 /**	  * 获取真实姓名	  */	 public String getRealname(){	 	return this.realname;	 }	/**	 * 设置身份证号码	 */	 public void setIdentitycard(String identitycard){	 	this.identitycard = identitycard;	 }	 	 /**	  * 获取身份证号码	  */	 public String getIdentitycard(){	 	return this.identitycard;	 }	/**	 * 设置手持身份证正面	 */	 public void setPic1(String pic1){	 	this.pic1 = pic1;	 }	 	 /**	  * 获取手持身份证正面	  */	 public String getPic1(){	 	return this.pic1;	 }	/**	 * 设置身份证正面	 */	 public void setPic2(String pic2){	 	this.pic2 = pic2;	 }	 	 /**	  * 获取身份证正面	  */	 public String getPic2(){	 	return this.pic2;	 }	/**	 * 设置身份证反面	 */	 public void setPic3(String pic3){	 	this.pic3 = pic3;	 }	 	 /**	  * 获取身份证反面	  */	 public String getPic3(){	 	return this.pic3;	 }	/**	 * 设置身份证到期时间	 */	 public void setExpirationTime(Date expirationTime){	 	this.expirationTime = expirationTime;	 }	 	 /**	  * 获取身份证到期时间	  */	 public Date getExpirationTime(){	 	return this.expirationTime;	 }	/**	 * 设置状态(0:未审核,1:审核通过,2:审核不通过)	 */	 public void setStatus(String status){	 	this.status = status;	 }	 	 /**	  * 获取状态(0:未审核,1:审核通过,2:审核不通过)	  */	 public String getStatus(){	 	return this.status;	 }	/**	 * 设置创建时间	 */	 public void setCreateTime(Date createTime){	 	this.createTime = createTime;	 }	 	 /**	  * 获取创建时间	  */	 public Date getCreateTime(){	 	return this.createTime;	 }	/**	 * 设置备注	 */	 public void setRemark(String remark){	 	this.remark = remark;	 }	 	 /**	  * 获取备注	  */	 public String getRemark(){	 	return this.remark;	 }	/**	 * 设置审核人	 */	 public void setAduitUid(String aduitUid){	 	this.aduitUid = aduitUid;	 }	 	 /**	  * 获取审核人	  */	 public String getAduitUid(){	 	return this.aduitUid;	 }	/**	 * 设置审核时间	 */	 public void setAduitTime(Date aduitTime){	 	this.aduitTime = aduitTime;	 }	 	 /**	  * 获取审核时间	  */	 public Date getAduitTime(){	 	return this.aduitTime;	 }}