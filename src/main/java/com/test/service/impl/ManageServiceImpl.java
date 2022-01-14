package com.test.service.impl;

import com.test.mapper.ManageMapper;
import com.test.po.Manage;
import com.test.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManageServiceImpl implements ManageService {

    @Autowired
    private ManageMapper mapper;


    @Override
    public Manage getByEntity(Manage manage) {

        return mapper.getByEntity(manage);
    }
}
