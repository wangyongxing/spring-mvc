package com.yaowang.lansha.entity;import java.io.Serializable;import java.util.Date;import org.apache.commons.lang3.StringUtils;import org.apache.commons.lang3.time.DateUtils;/** * 房间禁言用户  * @author  *  */public class LanshaRoomBlacklist implements Serializable{	private static final long serialVersionUID = 1L;		/**	 * id	 */	private String id;	/**	 * 房间id	 */	private String roomId;	/**	 * 被禁言用户id	 */	private String userId;	/**	 * im房间名称	 */	private String imRoom;	/**	 * 房管用户id	 */	private String adminId;	/**	 * 类型(1:禁言1小时,2:禁言1天,3:禁言)	 */	private String type;	/**	 * 有效时间	 */	private Date validTime;	/**	 * 创建时间	 */	private Date createTime;	/**	 * 昵称	 */	private String userNickname;	/**	 * 头像地址	 */	private String userHeadpic;		/**	 * 设置id	 */	 public void setId(String id){	 	this.id = id;	 }	 	 /**	  * 获取id	  */	 public String getId(){	 	return this.id;	 }	/**	 * 设置房间id	 */	 public void setRoomId(String roomId){	 	this.roomId = roomId;	 }	 	 /**	  * 获取房间id	  */	 public String getRoomId(){	 	return this.roomId;	 }	/**	 * 设置被禁言用户id	 */	 public void setUserId(String userId){	 	this.userId = userId;	 }	 	 /**	  * 获取被禁言用户id	  */	 public String getUserId(){	 	return this.userId;	 }	/**	 * 设置im房间名称	 */	 public void setImRoom(String imRoom){	 	this.imRoom = imRoom;	 }	 	 /**	  * 获取im房间名称	  */	 public String getImRoom(){	 	return this.imRoom;	 }	/**	 * 设置房管用户id	 */	 public void setAdminId(String adminId){	 	this.adminId = adminId;	 }	 	 /**	  * 获取房管用户id	  */	 public String getAdminId(){	 	return this.adminId;	 }	/**	 * 设置类型(1:禁言1小时,2:禁言1天,3:禁言)	 */	 public void setType(String type){	 	this.type = type;	 }	 	 /**	  * 获取类型(1:禁言1小时,2:禁言1天,3:禁言)	  */	 public String getType(){	 	return this.type;	 }	/**	 * 设置有效时间	 */	 public void setValidTime(Date validTime){	 	this.validTime = validTime;	 }	 	 /**	  * 获取有效时间	  */	 public Date getValidTime(){		 if(null == this.validTime){			 if(StringUtils.isBlank(type)){				 return new Date();			 }			 if("1".equals(type)){				 return DateUtils.addHours(new Date(), 1);			 }			 if("2".equals(type)){				 return DateUtils.addDays(new Date(), 1);			 }			 if("3".equals(type)){				 return DateUtils.addYears(new Date(), 10);			 }		 }	 	return this.validTime;	 }	/**	 * 设置创建时间	 */	 public void setCreateTime(Date createTime){	 	this.createTime = createTime;	 }	 	 /**	  * 获取创建时间	  */	 public Date getCreateTime(){	 	return this.createTime;	 }	public String getUserNickname() {		return userNickname;	}	public void setUserNickname(String userNickname) {		this.userNickname = userNickname;	}	public String getUserHeadpic() {		return userHeadpic;	}	public void setUserHeadpic(String userHeadpic) {		this.userHeadpic = userHeadpic;	}}