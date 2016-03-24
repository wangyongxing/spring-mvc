package com.yaowang.lansha.dao;

import java.util.List;
import java.util.Map;

import com.yaowang.common.dao.PageDto;
import com.yaowang.lansha.entity.YwUserApply;

/**
 * 热门推荐房间 
 * @author 
 * 
 */
public interface YwUserApplyDao{
	/**
	 * 新增热门推荐房间
	 * @param ywUserApply
	 * @return
	 */
	public YwUserApply save(YwUserApply entity);
	
	/**
	 * 根据ids数组删除热门推荐房间
	 * @param ids
	 * @return
	 */
	public Integer delete(String[] ids);
	
	/**
	 * 更新热门推荐房间
	 * @param ywUserApply
	 * @return
	 */
	public Integer update(YwUserApply entity);
	
	/**
	 * 根据id获取热门推荐房间
	 * @param id
	 * @return
	 */
	public YwUserApply getYwUserApplyById(String id);
		
	/**
	 * 根据ids数组查询热门推荐房间map
	 * @param ids
	 * @return
	 */
	public Map<String, YwUserApply> getYwUserApplyMapByIds(String[] ids);
	
	/**
	 * 获取热门推荐房间列表
	 * @return
	 */
	public List<YwUserApply> getYwUserApplyList(YwUserApply entity);
		
	/**
	 * 分页获取热门推荐房间列表
	 * @param page
	 * @return
	 */
	public List<YwUserApply> getYwUserApplyPage(YwUserApply entity, PageDto page);
	
}