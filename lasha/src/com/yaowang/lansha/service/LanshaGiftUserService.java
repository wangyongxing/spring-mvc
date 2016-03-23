package com.yaowang.lansha.service;import java.util.List;import java.util.Map;import com.yaowang.common.dao.PageDto;import com.yaowang.lansha.entity.LanshaGiftUser;/** * 礼物记录  * @author  *  */public interface LanshaGiftUserService {	/**	 * 新增礼物记录	 * @param lanshaGiftUser	 * @return	 */	public LanshaGiftUser save(LanshaGiftUser entity);		/**	 * 根据ids数组删除礼物记录数据	 * @param ids	 * @return	 */	public Integer delete(String[] ids);		/**	 * 更新礼物记录	 * @param lanshaGiftUser	 * @return	 */	public Integer update(LanshaGiftUser entity);		/**	 * 根据id获取礼物记录	 * @param id	 * @return	 */	public LanshaGiftUser getLanshaGiftUserById(String id);		/**	 * 根据ids数组查询礼物记录map	 * @param ids	 * @return	 */	public Map<String, LanshaGiftUser> getLanshaGiftUserMapByIds(String[] ids);		/**	 * 获取礼物记录列表	 * @return	 */	public List<LanshaGiftUser> getLanshaGiftUserList(LanshaGiftUser entity);		/**	 * 分页获取礼物记录列表	 * @param page	 * @return	 */	public List<LanshaGiftUser> getLanshaGiftUserPage(LanshaGiftUser entity, PageDto page);	/**	 * @Title: saveGiveGift	 * @Description: 赠送礼物	 * 1、修改用户礼物库存	 * 2、如果需要蓝鲨币兑换礼物，修改用户蓝鲨币	 * 3、添加赠送记录	 * @param entity	 * @param giftStockId	 */	public void saveGiveGift(LanshaGiftUser entity, String giftStockId);	}