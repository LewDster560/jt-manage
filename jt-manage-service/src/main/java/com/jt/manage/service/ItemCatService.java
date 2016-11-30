package com.jt.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jt.manage.mapper.ItemCatMapper;
import com.jt.manage.pojo.ItemCat;

@Service
public class ItemCatService extends BaseService<ItemCat>{
	//注入接口
	@Autowired
	private ItemCatMapper itemCatMapper;
	
	//查询某个分类的列表
	public List<ItemCat> queryItemCatList(Integer parentId){
		return itemCatMapper.queryItemCatListByParentId(parentId);
	}
}
