package com.test.mapper;

import com.test.po.Manage;
import org.apache.ibatis.annotations.Mapper;

/**
 * 管理员dao
 * @author Administrator
 */
@Mapper
public interface ManageMapper {

    Manage getByEntity(Manage manage);
}
