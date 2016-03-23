package com.yaowang.lansha.service;import java.util.Date;import java.util.List;import java.util.Map;import com.yaowang.common.dao.PageDto;import com.yaowang.lansha.entity.LogUserLogin;import com.yaowang.lansha.entity.YwUser;/** * log_user_login  * @author  *  */public interface LogUserLoginService {	/**	 * 新增log_user_login	 * @param logUserLogin	 * @param ywUser	 * @param numb(标示是登录还是注册调用[regiest:注册；login:登录])	 * @return	 */	public LogUserLogin save(LogUserLogin entity, YwUser ywUser, String type);		/**	 * 根据ids数组删除log_user_login数据	 * @param ids	 * @return	 */	public Integer delete(String[] ids);		/**	 * 更新log_user_login	 * @param logUserLogin	 * @return	 */	public Integer update(LogUserLogin entity);		/**	 * 根据id获取log_user_login	 * @param id	 * @return	 */	public LogUserLogin getLogUserLoginById(String id);		/**	 * 根据ids数组查询log_user_loginmap	 * @param ids	 * @return	 */	public Map<String, LogUserLogin> getLogUserLoginMapByIds(String[] ids);		/**	 * 获取log_user_login列表	 * @return	 */	public List<LogUserLogin> getLogUserLoginList();		/**	 * 分页获取log_user_login列表	 * @param page	 * @return	 */	public List<LogUserLogin> getLogUserLoginPage(LogUserLogin entity, Date startTime, Date endTime, PageDto page);	/**	 * 根据用户id和起始时间查找登录日志	 * @param user_id	 * @param startTime	 * @param endTime	 * @return	 * @creationDate. 2016-1-11 下午2:35:44	 */	public List<LogUserLogin> getLogUserLoginByUserId(String user_id, Date startTime, Date endTime);	/**	 * 根据用户id和起始时间查找登录日志次数	 * @param user_id	 * @param startTime	 * @param endTime	 * @return	 * @creationDate. 2016-1-11 下午2:35:44	 */	public Integer getLogUserLoginCountByUserId(String user_id, Date startTime, Date endTime);	/**	 * 根据用户id和起始时间查找登录日志次数	 * @param user_id	 * @param startTime	 * @param endTime	 * @return	 * @creationDate. 2016-1-11 下午2:35:44	 * loginMethod. 登录方式	 */	public Integer getLogUserLoginCountByUserId(String user_id, Date startTime,			Date endTime,String loginMethod);}