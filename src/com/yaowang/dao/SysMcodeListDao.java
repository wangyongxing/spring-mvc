package com.yaowang.dao;

import java.util.List;

import com.yaowang.common.dao.PageDto;
import com.yaowang.entity.SysMcodeList;

/**
 * sys_mcode_list 
 * @author 
 * 
 */
public interface SysMcodeListDao{
	/**
	 * 新增sys_mcode_list
	 * @param sysMcodeList
	 * @return
	 */
	public SysMcodeList save(SysMcodeList sysMcodeList);
	
	/**
	 * 根据ids数组删除sys_mcode_list
	 * @param ids
	 * @return
	 */
	public Integer delete(String[] ids);
	
	/**
	 * 更新sys_mcode_list
	 * @param sysMcodeList
	 * @return
	 */
	public Integer update(SysMcodeList sysMcodeList);
	
	/**
	 * 根据id获取sys_mcode_list
	 * @param id
	 * @return
	 */
	public SysMcodeList getSysMcodeListById(String id);
	
	/**
	 * 根据name获取sys_mcode_list
	 * @param name
	 * @return
	 */
	public SysMcodeList getSysMcodeListByName(String name);
		
	/**
	 * 根据ids数组查询sys_mcode_listmap
	 * @param ids
	 * @return
	 */
//	public Map<String, SysMcodeList> getSysMcodeListMapByIds(String[] ids);
	
	/**
	 * 获取sys_mcode_list列表
	 * @return
	 */
	public List<SysMcodeList> getSysMcodeListList();
		
	/**
	 * 分页获取sys_mcode_list列表
	 * @param page
	 * @return
	 */
	public List<SysMcodeList> getSysMcodeListPage(PageDto page);
	
}
