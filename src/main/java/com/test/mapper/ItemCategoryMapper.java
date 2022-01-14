package com.test.mapper;

import com.github.pagehelper.Page;
import com.test.po.ItemCategory;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

/**
 * 商品类目mapper
 */

public interface ItemCategoryMapper {

    /**
     * 分页查询商品类目
     * @return
     */
    List<ItemCategory> findBySqlRerturnEntity(@Param("sql") String sql);


}
