package com.woniu.his.service;

import com.woniu.his.mapper.BedMapper;
import com.woniu.his.pojo.Bed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BedServiceImpl implements IBedService {
    @Autowired
    BedMapper bedMapper;
    @Override
    public List<Bed> findAll() {
        return bedMapper.selectAll();
    }

    @Override
    public Bed findById(Integer id) {
        return bedMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delById(Integer id) {
        return bedMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Bed bed) {
        return bedMapper.insert(bed);
    }

    @Override
    public int addBed(Bed bed) {

        return 0;
    }
}
