package com.dao;

import com.entity.BanjichengyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BanjichengyuanVO;
import com.entity.view.BanjichengyuanView;


/**
 * 班级成员
 * 
 * @author 
 * @email 
 * @date 2021-04-13 21:49:08
 */
public interface BanjichengyuanDao extends BaseMapper<BanjichengyuanEntity> {
	
	List<BanjichengyuanVO> selectListVO(@Param("ew") Wrapper<BanjichengyuanEntity> wrapper);
	
	BanjichengyuanVO selectVO(@Param("ew") Wrapper<BanjichengyuanEntity> wrapper);
	
	List<BanjichengyuanView> selectListView(@Param("ew") Wrapper<BanjichengyuanEntity> wrapper);

	List<BanjichengyuanView> selectListView(Pagination page,@Param("ew") Wrapper<BanjichengyuanEntity> wrapper);
	
	BanjichengyuanView selectView(@Param("ew") Wrapper<BanjichengyuanEntity> wrapper);
	
}
