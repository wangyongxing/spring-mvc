package com.yaowang.lansha.dao;

import java.util.List;
import java.util.Map;

import com.yaowang.common.dao.PageDto;
import com.yaowang.lansha.entity.LanshaActivityPush;

/**
 * 精彩活动表 
 * @author 
 * 
 */
public interface LanshaActivityPushDao{
	/**
	 * 新增精彩活动表
	 * @param lanshaActivityPush
	 * @return
	 */
	public LanshaActivityPush save(LanshaActivityPush entity);
	
	/**
	 * 根据ids数组删除精彩活动表
	 * @param ids
	 * @return
	 */
	public Integer delete(String[] ids);
	
	/**
	 * 更新精彩活动表
	 * @param lanshaActivityPush
	 * @return
	 */
	public Integer update(LanshaActivityPush entity);
	
	/**
	 * 根据id获取精彩活动表
	 * @param id
	 * @return
	 */
	public LanshaActivityPush getLanshaActivityPushById(String id);
		
	/**
	 * 根据ids数组查询精彩活动表map
	 * @param ids
	 * @return
	 */
	public Map<String, LanshaActivityPush> getLanshaActivityPushMapByIds(String[] ids);
	
	/**
	 * 获取精彩活动表列表
	 * @return
	 */
	public List<LanshaActivityPush> getLanshaActivityPushList(LanshaActivityPush entity);
		
	/**
	 * 分页获取精彩活动表列表
	 * @param page
	 * @return
	 */
	public List<LanshaActivityPush> getLanshaActivityPushPage(LanshaActivityPush entity, PageDto page);
	
}
