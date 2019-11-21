package com.woniu.his.service;

import com.woniu.his.mapper.LevelMapper;
import com.woniu.his.pojo.Level;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class LevelServiceImpl implements ILevelService {
    @Resource
    LevelMapper levelMapper;

    @Override
    public List<Level> selectAll() {
        return levelMapper.selectAll();
    }
}
