package com.yaowang.lansha.dao;

import java.util.List;
import java.util.Map;

import com.yaowang.common.dao.PageDto;
import com.yaowang.lansha.entity.YwUserRoomGirl;

/**
 * 热门美女房间 
 * @author 
 * 
 */
public interface YwUserRoomGirlDao{
	/**
	 * 新增热门美女房间
	 * @param ywUserRoomGirl
	 * @return
	 */
	public YwUserRoomGirl save(YwUserRoomGirl entity);
	
	/**
	 * 根据ids数组删除热门美女房间
	 * @param ids
	 * @return
	 */
	public Integer delete(String[] ids);
	
	/**
	 * 更新热门美女房间
	 * @param ywUserRoomGirl
	 * @return
	 */
	public Integer update(YwUserRoomGirl entity);
	
	/**
	 * 根据id获取热门美女房间
	 * @param id
	 * @return
	 */
	public YwUserRoomGirl getYwUserRoomGirlById(String id);
		
	/**
	 * 根据ids数组查询热门美女房间map
	 * @param ids
	 * @return
	 */
	public Map<String, YwUserRoomGirl> getYwUserRoomGirlMapByIds(String[] ids);
	
	/**
	 * 获取热门美女房间列表
	 * @return
	 */
	public List<YwUserRoomGirl> getYwUserRoomGirlList(YwUserRoomGirl entity);
		
	/**
	 * 分页获取热门美女房间列表
	 * @param page
	 * @return
	 */
	public List<YwUserRoomGirl> getYwUserRoomGirlPage(YwUserRoomGirl entity, PageDto page);
	
}
