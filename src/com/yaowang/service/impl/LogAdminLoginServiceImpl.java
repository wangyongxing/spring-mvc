package com.yaowang.service.impl;import java.util.ArrayList;import java.util.Date;import java.util.HashSet;import java.util.List;import java.util.Map;import java.util.Set;import javax.annotation.Resource;import org.apache.commons.lang.StringUtils;import org.springframework.stereotype.Service;import com.yaowang.common.dao.PageDto;import com.yaowang.dao.AdminUserDao;import com.yaowang.dao.LogAdminLoginDao;import com.yaowang.entity.AdminUser;import com.yaowang.entity.LogAdminLogin;import com.yaowang.service.LogAdminLoginService;/** * 管理员登录日志表  * @author  *  */@Service("logAdminLoginService")public class LogAdminLoginServiceImpl implements LogAdminLoginService{	@Resource	private LogAdminLoginDao logAdminLoginDao;	@Resource	private AdminUserDao adminUserDao;		@Override	public LogAdminLogin save(LogAdminLogin logAdminLogin){		return logAdminLoginDao.save(logAdminLogin);	}		@Override	public Integer delete(String[] ids){		return logAdminLoginDao.delete(ids);	}		@Override	public Integer update(LogAdminLogin logAdminLogin){		return logAdminLoginDao.update(logAdminLogin);	}		@Override	public LogAdminLogin getLogAdminLoginById(String id){		return logAdminLoginDao.getLogAdminLoginById(id);	}	//	@Override//	public Map<String, LogAdminLogin> getLogAdminLoginMapByIds(String[] ids){//		return logAdminLoginDao.getLogAdminLoginMapByIds(ids);//	}		@Override	public List<LogAdminLogin> getLogAdminLoginList(){		return logAdminLoginDao.getLogAdminLoginList();	}		@Override	public List<LogAdminLogin> getLogAdminLoginPage(String userName, Date startTime, Date endTime, PageDto page){		String userId = null;		if (!StringUtils.isEmpty(userName)) {			AdminUser user = adminUserDao.getAdminUserByUserName(userName);			if (user == null) {				return new ArrayList<LogAdminLogin>(0);			}			userId = user.getId();		}		if (page != null) {			page.setCount(false);			int count = logAdminLoginDao.getLogAdminLoginNumb(userId, startTime, endTime);			page.setTotalNum(count);		}				List<LogAdminLogin> list = logAdminLoginDao.getLogAdminLoginPage(userId, startTime, endTime, page);		//设置真实姓名		setInfo(list);		return list;	}	/**	 * 设置真实姓名	 * @param list	 */	public void setInfo(List<LogAdminLogin> list){		if (list.isEmpty()) {			return;		}		Set<String> ids = new HashSet<String>();		for (LogAdminLogin entity : list) {			ids.add(entity.getUserId());		}		//用户名		Map<String, String> map = adminUserDao.getAdminUserNameMapByIds(ids.toArray(new String[]{}));		for (LogAdminLogin entity : list) {			String username = map.get(entity.getUserId());			entity.setUserName(username);		}	}}