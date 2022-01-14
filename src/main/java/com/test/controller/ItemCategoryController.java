package com.test.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.test.po.ItemCategory;
import com.test.service.ItemCategoryService;
import com.test.utils.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 商品类目控制器
 */

@Controller
@RequestMapping("/itemCategory")
public class ItemCategoryController {

    @Autowired
    private ItemCategoryService service;

    /**
     * 分页查询类目列表
     */
    @RequestMapping("/findBySql")
    public String findBySql(Model model,ItemCategory itemCategory ){

        String sql = "select * from item_category where isDelete = 0 and pid is null order by id";

        Pager<ItemCategory> pages = service.findBySqlRerturnEntity(sql);

        model.addAttribute("pages",pages);
        model.addAttribute("obj",itemCategory);

        System.out.println(pages);

        return "";

    }


}
