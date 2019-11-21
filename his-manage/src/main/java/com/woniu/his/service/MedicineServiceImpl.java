package com.woniu.his.service;

import com.woniu.his.mapper.MedicineMapper;
import com.woniu.his.pojo.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineServiceImpl implements IMedicineService{
    @Autowired
    MedicineMapper medicineMapper;

    @Override
    public List<Medicine> findAll() {
        return medicineMapper.selectAll();
    }

    @Override
    public int deleteById(Integer medicineId) {
        return medicineMapper.deleteByPrimaryKey(medicineId);
    }

    @Override
    public int insert(Medicine record) {
        return medicineMapper.insert(record);
    }

    @Override
    public Medicine selectByPrimaryKey(Integer medicineId) {
        return medicineMapper.selectByPrimaryKey(medicineId);
    }

    @Override
    public int updateByPrimaryKey(Medicine record) {
        return medicineMapper.updateByPrimaryKey(record);
    }
}
