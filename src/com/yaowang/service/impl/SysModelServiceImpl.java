package com.yaowang.service.impl;import java.util.ArrayList;import java.util.LinkedHashMap;import java.util.List;import java.util.Map;import javax.annotation.Resource;import org.springframework.stereotype.Service;import com.yaowang.common.constant.BaseConstant;import com.yaowang.common.dao.PageDto;import com.yaowang.dao.SysModelDao;import com.yaowang.entity.SysModel;import com.yaowang.service.SysModelService;import com.yaowang.util.MD5;import com.yaowang.util.cache.CacheUtil;import com.yaowang.util.cache.DefaultCacheManager;/** * 后台模块  * @author  *  */@SuppressWarnings("unchecked")@Service("sysModelService")public class SysModelServiceImpl extends DefaultCacheManager implements SysModelService{	@Resource	private SysModelDao sysModelDao;		@Override	public SysModel save(SysModel sysModel){		return sysModelDao.save(sysModel);	}		@Override	public Integer delete(String[] ids){		return sysModelDao.delete(ids);	}		@Override	public Integer update(SysModel sysModel){		return sysModelDao.update(sysModel);	}		@Override	public SysModel getSysModelById(String id){		return sysModelDao.getSysModelById(id);	}		@Override	public Map<String, Object[]> getSysModelMap() {		List<SysModel> model = getSysModelList(null);		Map<String, Object[]> data = new LinkedHashMap<String, Object[]>();		//一级模块		for (SysModel entity : model) {			if (BaseConstant.ZERO_GUID.equals(entity.getParentId())) {				data.put(entity.getId(), new Object[]{entity, new ArrayList<SysModel>() });			}		}		//二级模块		for (SysModel entity : model) {			if (data.containsKey(entity.getParentId())) {				Object[] items = data.get(entity.getParentId());				List<SysModel> list = (List<SysModel>)items[1];				list.add(entity);			}		}		return data;	}		@Override	public List<SysModel> getSysModelList(final List<String> ids){		return (List<SysModel>)getFormCache(new CacheUtil<List<SysModel>>() {			@Override			public String key() {				return "getSysModelList." + MD5.encrypt(ids);			}						@Override			public List<SysModel> get() {				return sysModelDao.getSysModelList(ids);			}		});	}		@Override	public List<SysModel> getSysModelPage(PageDto page){		return sysModelDao.getSysModelPage(page);	}	@Override	public Map<String, SysModel> getSysModelMapByIds(String[] ids) {		return sysModelDao.getSysModelMapByIds(ids);	}	}