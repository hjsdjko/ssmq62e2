package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BanjichengyuanDao;
import com.entity.BanjichengyuanEntity;
import com.service.BanjichengyuanService;
import com.entity.vo.BanjichengyuanVO;
import com.entity.view.BanjichengyuanView;

@Service("banjichengyuanService")
public class BanjichengyuanServiceImpl extends ServiceImpl<BanjichengyuanDao, BanjichengyuanEntity> implements BanjichengyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanjichengyuanEntity> page = this.selectPage(
                new Query<BanjichengyuanEntity>(params).getPage(),
                new EntityWrapper<BanjichengyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanjichengyuanEntity> wrapper) {
		  Page<BanjichengyuanView> page =new Query<BanjichengyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanjichengyuanVO> selectListVO(Wrapper<BanjichengyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanjichengyuanVO selectVO(Wrapper<BanjichengyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanjichengyuanView> selectListView(Wrapper<BanjichengyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanjichengyuanView selectView(Wrapper<BanjichengyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
