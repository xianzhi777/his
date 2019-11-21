package com.woniu.his.service;

import com.netflix.discovery.converters.Auto;
import com.woniu.his.mapper.DiseaseMapper;
import com.woniu.his.pojo.Disease;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DiseaseServiceImpl implements IDiseaseService{
    @Autowired
    DiseaseMapper diseaseMapper;

    @Override
    public List<Disease> findAll() {
        return diseaseMapper.selectAll();
    }

    @Override
    public int insert(Disease disease) {
        return diseaseMapper.insert(disease);
    }
}
