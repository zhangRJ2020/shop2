package com.test.service;

import com.github.pagehelper.Page;
import com.test.po.ItemCategory;
import com.test.utils.Pager;

/**
 * 商品类目服务接口
 */

public interface ItemCategoryService {


    Pager<ItemCategory> findBySqlRerturnEntity(String sql);
}
