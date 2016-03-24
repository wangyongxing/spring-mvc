package com.yaowang.dao;

import java.util.List;
import java.util.Map;

import com.yaowang.common.dao.PageDto;
import com.yaowang.entity.SysModel;

/**
 * 后台模块 
 * @author 
 * 
 */
public interface SysModelDao{
	/**
	 * 新增后台模块
	 * @param sysModel
	 * @return
	 */
	public SysModel save(SysModel sysModel);
	
	/**
	 * 根据ids数组删除后台模块
	 * @param ids
	 * @return
	 */
	public Integer delete(String[] ids);
	
	/**
	 * 更新后台模块
	 * @param sysModel
	 * @return
	 */
	public Integer update(SysModel sysModel);
	
	/**
	 * 根据id获取后台模块
	 * @param id
	 * @return
	 */
	public SysModel getSysModelById(String id);
		
	/**
	 * 根据ids数组查询后台模块map
	 * @param ids
	 * @return
	 */
//	public Map<String, SysModel> getSysModelMapByIds(String[] ids);
	
	/**
	 * 获取后台模块列表
	 * @return
	 */
	public List<SysModel> getSysModelList(List<String> ids);
		
	/**
	 * 分页获取后台模块列表
	 * @param page
	 * @return
	 */
	public List<SysModel> getSysModelPage(PageDto page);

	/**
	 * 根据ids数组查询模块map
	 * @param ids
	 * @return
	 */
	public Map<String, SysModel> getSysModelMapByIds(String[] ids);
	
}
