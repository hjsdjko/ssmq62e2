package com.entity.view;

import com.entity.BanjichengyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 班级成员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-13 21:49:08
 */
@TableName("banjichengyuan")
public class BanjichengyuanView  extends BanjichengyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BanjichengyuanView(){
	}
 
 	public BanjichengyuanView(BanjichengyuanEntity banjichengyuanEntity){
 	try {
			BeanUtils.copyProperties(this, banjichengyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
