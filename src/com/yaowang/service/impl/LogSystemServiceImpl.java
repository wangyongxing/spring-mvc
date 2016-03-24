package com.yaowang.service.impl;import java.util.Date;import java.util.List;import javax.annotation.Resource;import org.springframework.stereotype.Service;import com.yaowang.common.dao.PageDto;import com.yaowang.dao.LogSystemDao;import com.yaowang.entity.LogSystem;import com.yaowang.service.LogSystemService;/** * log_system  * @author  *  */@Service("logSystemService")public class LogSystemServiceImpl implements LogSystemService{	@Resource	private LogSystemDao logSystemDao;		@Override	public LogSystem save(LogSystem logSystem){		return logSystemDao.save(logSystem);	}		@Override	public Integer delete(String[] ids){		return logSystemDao.delete(ids);	}		@Override	public Integer update(LogSystem logSystem){		return logSystemDao.update(logSystem);	}		@Override	public LogSystem getLogSystemById(String id){		return logSystemDao.getLogSystemById(id);	}	//	@Override//	public Map<String, LogSystem> getLogSystemMapByIds(String[] ids){//		return logSystemDao.getLogSystemMapByIds(ids);//	}		@Override	public List<LogSystem> getLogSystemList(){		return logSystemDao.getLogSystemList();	}		@Override	public List<LogSystem> getLogSystemPage(LogSystem entity, Date startTime, Date endTime, PageDto page){		if (entity == null) {			entity = new LogSystem();		}		if (page != null) {			page.setCount(false);			int count = logSystemDao.getLogSystemNumb(entity, startTime, endTime);			page.setTotalNum(count);		}		return logSystemDao.getLogSystemPage(entity, startTime, endTime, page);	}	}