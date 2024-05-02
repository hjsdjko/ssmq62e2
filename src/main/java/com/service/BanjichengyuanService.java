package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanjichengyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanjichengyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanjichengyuanView;


/**
 * 班级成员
 *
 * @author 
 * @email 
 * @date 2021-04-13 21:49:08
 */
public interface BanjichengyuanService extends IService<BanjichengyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanjichengyuanVO> selectListVO(Wrapper<BanjichengyuanEntity> wrapper);
   	
   	BanjichengyuanVO selectVO(@Param("ew") Wrapper<BanjichengyuanEntity> wrapper);
   	
   	List<BanjichengyuanView> selectListView(Wrapper<BanjichengyuanEntity> wrapper);
   	
   	BanjichengyuanView selectView(@Param("ew") Wrapper<BanjichengyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanjichengyuanEntity> wrapper);
   	
}

