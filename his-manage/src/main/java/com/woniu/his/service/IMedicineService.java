package com.woniu.his.service;

import com.woniu.his.pojo.Medicine;

import java.util.List;

public interface IMedicineService {
     List<Medicine> findAll();

    int deleteById(Integer medicineId);

    int insert(Medicine record);

    Medicine selectByPrimaryKey(Integer medicineId);

    int updateByPrimaryKey(Medicine record);
}
