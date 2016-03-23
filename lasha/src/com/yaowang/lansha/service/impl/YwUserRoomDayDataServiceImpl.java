package com.yaowang.lansha.service.impl;import java.util.*;import javax.annotation.Resource;import com.yaowang.common.dao.PageDto;import com.yaowang.lansha.dao.YwUserRoomDayDataDao;import com.yaowang.lansha.entity.YwUser;import com.yaowang.lansha.entity.YwUserRoomDayData;import com.yaowang.lansha.service.YwUserRoomDayDataService;import com.yaowang.lansha.service.YwUserService;import org.apache.commons.collections.CollectionUtils;import org.springframework.stereotype.Service;/** * 房间日数据  * @author  *  */@Service("ywUserRoomDayDataService")public class YwUserRoomDayDataServiceImpl implements YwUserRoomDayDataService{	@Resource	private YwUserRoomDayDataDao ywUserRoomDayDataDao;    @Resource    private YwUserService ywUserService;		@Override	public YwUserRoomDayData save(YwUserRoomDayData entity){		return ywUserRoomDayDataDao.save(entity);	}		@Override	public Integer delete(String[] roomIds){		return ywUserRoomDayDataDao.delete(roomIds);	}		@Override	public Integer update(YwUserRoomDayData entity){		return ywUserRoomDayDataDao.update(entity);	}		@Override	public YwUserRoomDayData getYwUserRoomDayDataById(String rankingId){		return ywUserRoomDayDataDao.getYwUserRoomDayDataById(rankingId);	}		@Override	public Map<String, YwUserRoomDayData> getYwUserRoomDayDataMapByIds(String[] rankingIds){		return ywUserRoomDayDataDao.getYwUserRoomDayDataMapByIds(rankingIds);	}		@Override	public List<YwUserRoomDayData> getYwUserRoomDayDataList(YwUserRoomDayData entity,Date startTime,Date endTime){        List<YwUserRoomDayData> list=ywUserRoomDayDataDao.getYwUserRoomDayDataList(entity,startTime,endTime);        setMobile(list);		return list;	}		@Override	public List<YwUserRoomDayData> getYwUserRoomDayDataPage(YwUserRoomDayData entity, PageDto page){		return ywUserRoomDayDataDao.getYwUserRoomDayDataPage(entity, page);	}    @Override    public List<YwUserRoomDayData> getYwUserRoomDayDataSort(YwUserRoomDayData entity) {        return ywUserRoomDayDataDao.getYwUserRoomDayDataSort(entity);    }    @Override    public YwUserRoomDayData getYwUserRoomDayData(YwUserRoomDayData entity) {        return ywUserRoomDayDataDao.getYwUserRoomDayData(entity);    }    @Override    public List<YwUserRoomDayData> getYwUserRoomDayDataTotalList(YwUserRoomDayData entity, Date startTime, Date endTime, PageDto page) {        List<YwUserRoomDayData> list= ywUserRoomDayDataDao.getYwUserRoomDayDataTotalList(entity,startTime,endTime, page);        setMobile(list);        return list;    }    @Override    public void setMobile(List<YwUserRoomDayData> list) {        if (CollectionUtils.isNotEmpty(list)) {            Set<String> ids = new HashSet<String>();            for (YwUserRoomDayData ywUserRoomDayData : list) {                ids.add(ywUserRoomDayData.getUserId());            }            Map<String, YwUser> map = ywUserService.getYwUserMapByIds(ids.toArray(new String[]{}));            for (YwUserRoomDayData dayData : list) {                if (map.containsKey(dayData.getUserId())) {                    YwUser users = map.get(dayData.getUserId());                    dayData.setMobile(users.getMobile());                }            }        }    }    public Integer deleteByDay(Date date){        return ywUserRoomDayDataDao.deleteByDay(date);    }    @Override    public Integer updateInfo(YwUserRoomDayData ywUserRoomDayData) {        return ywUserRoomDayDataDao.updateInfo(ywUserRoomDayData.getForfeit(),ywUserRoomDayData.getBonus(),ywUserRoomDayData.getRemark(),ywUserRoomDayData.getRankingId());    }    @Override    public YwUserRoomDayData getYwUserRoomDataSum(YwUserRoomDayData entity, Date startTime, Date endTime) {        return ywUserRoomDayDataDao.getYwUserRoomDataSum(entity,startTime,endTime);    }}