package com.yaowang.lansha.dao;

import java.util.List;
import java.util.Map;

import com.yaowang.common.dao.PageDto;
import com.yaowang.lansha.entity.WechatAccessToken;

/**
 * 微信接口访问的Token 
 * @author 
 * 
 */
public interface WechatAccessTokenDao{
	/**
	 * 新增微信接口访问的Token
	 * @param wechatAccessToken
	 * @return
	 */
	public WechatAccessToken save(WechatAccessToken entity);
	
	/**
	 * 根据ids数组删除微信接口访问的Token
	 * @param ids
	 * @return
	 */
	public Integer delete(String[] ids);
	
	/**
	 * 更新微信接口访问的Token
	 * @param wechatAccessToken
	 * @return
	 */
	public Integer update(WechatAccessToken entity);
	
	/**
	 * 根据id获取微信接口访问的Token
	 * @param id
	 * @return
	 */
	public WechatAccessToken getWechatAccessTokenById(String id);
		
	/**
	 * 根据应用id获取微信接口访问的Token
	 * @param id
	 * @return
	 */
	public WechatAccessToken getWechatAccessTokenByAppId(String appId);
	
	/**
	 * 根据ids数组查询微信接口访问的Tokenmap
	 * @param ids
	 * @return
	 */
	public Map<String, WechatAccessToken> getWechatAccessTokenMapByIds(String[] ids);
	
	/**
	 * 获取微信接口访问的Token列表
	 * @return
	 */
	public List<WechatAccessToken> getWechatAccessTokenList(WechatAccessToken entity);
		
	/**
	 * 分页获取微信接口访问的Token列表
	 * @param page
	 * @return
	 */
	public List<WechatAccessToken> getWechatAccessTokenPage(WechatAccessToken entity, PageDto page);
	
}