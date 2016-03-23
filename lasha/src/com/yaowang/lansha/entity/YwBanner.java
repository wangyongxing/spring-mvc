package com.yaowang.lansha.entity;import java.io.Serializable;import java.util.Date;/** * 广告  * @author  *  */public class YwBanner implements Serializable{	private static final long serialVersionUID = 1L;		/**	 * id	 */	private String id;	/**	 * 类别名称	 */	private String name;	/**	 * 广告内容	 */	private String content;	/**	 * 类型(0：房间，1：广告)	 */	private String type;	/**	 * 链接地址	 */	private String linkUrl;	/**	 * 小图地址	 */	private String img;	/**	 * 大图地址	 */	private String bigImg;	/**	 * 排序	 */	private Integer orderId;	/**	 * 创建时间	 */	private Date createTime;	/**	 * 房间id	 */	private String roomId;		/**	 * 房间	 */	private YwUserRoom room;	/**	 * 端类型(0:pc，1:app)	 */	private String clientType;		/**	 * 设置id	 */	 public void setId(String id){	 	this.id = id;	 }	 	 /**	  * 获取id	  */	 public String getId(){	 	return this.id;	 }	/**	 * 设置类别名称	 */	 public void setName(String name){	 	this.name = name;	 }	 	 /**	  * 获取类别名称	  */	 public String getName(){	 	return this.name;	 }	/**	 * 设置类型(0：房间，1：广告)	 */	 public void setType(String type){	 	this.type = type;	 }	 	 /**	  * 获取类型(0：房间，1：广告)	  */	 public String getType(){	 	return this.type;	 }	/**	 * 设置链接地址	 */	 public void setLinkUrl(String linkUrl){	 	this.linkUrl = linkUrl;	 }	 	 /**	  * 获取链接地址	  */	 public String getLinkUrl(){	 	return this.linkUrl;	 }	/**	 * 设置图片地址	 */	 public void setImg(String img){	 	this.img = img;	 }	 	 /**	  * 获取图片地址	  */	 public String getImg(){	 	return this.img;	 }	/**	 * 设置排序	 */	 public void setOrderId(Integer orderId){	 	this.orderId = orderId;	 }	 	 /**	  * 获取排序	  */	 public Integer getOrderId(){	 	return this.orderId;	 }	/**	 * 设置创建时间	 */	 public void setCreateTime(Date createTime){	 	this.createTime = createTime;	 }	 	 /**	  * 获取创建时间	  */	 public Date getCreateTime(){	 	return this.createTime;	 }	public String getContent() {		return content;	}	public void setContent(String content) {		this.content = content;	}	public String getRoomId() {		return roomId;	}	public void setRoomId(String roomId) {		this.roomId = roomId;	}	public YwUserRoom getRoom() {		return room;	}	public void setRoom(YwUserRoom room) {		this.room = room;	}	public String getBigImg() {		return bigImg;	}	public void setBigImg(String bigImg) {		this.bigImg = bigImg;	}	public String getClientType() {		return clientType;	}	public void setClientType(String clientType) {		this.clientType = clientType;	}}