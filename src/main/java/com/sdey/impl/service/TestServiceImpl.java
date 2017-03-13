package com.sdey.impl.service;

import com.sdey.api.po.WxSucai;
import com.sdey.api.service.TestService;
import com.sdey.impl.mapper.WxSucaiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liudo on 2017/3/13 0013.
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private WxSucaiMapper wxscDao;

    @Override
    public List<WxSucai> getAll() {
        return wxscDao.selectAll();
    }
}
