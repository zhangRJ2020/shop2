package com.test.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.test.mapper.ItemCategoryMapper;
import com.test.po.ItemCategory;
import com.test.service.ItemCategoryService;
import com.test.utils.Pager;
import com.test.utils.SystemContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemCategoryServiceImpl implements ItemCategoryService {

    @Autowired
    private ItemCategoryMapper mapper;

    /**
     * 查询分页
     * @param sql
     * @return
     */
    @Override
    public Pager<ItemCategory> findBySqlRerturnEntity(String sql) {
        /**
         * 执行分页
         */
        Integer pageSize = SystemContext.getPageSize();
        Integer pageOffset = SystemContext.getPageOffset();
        if(pageOffset==null||pageOffset<0) {pageOffset = 0;}
        if(pageSize==null||pageSize<0) {pageSize = 15;}
        String order = SystemContext.getOrder();
        String sort = SystemContext.getSort();
        Integer pageNum = null;
        if(pageOffset == 0){
            pageNum = 1;
        }else{
            pageNum = pageOffset/pageSize+1;
        }
        PageHelper.startPage(pageNum, pageSize);
        Pager<ItemCategory> pages = new Pager<ItemCategory>(mapper.findBySqlRerturnEntity(sql));
        return pages;
    }
}
