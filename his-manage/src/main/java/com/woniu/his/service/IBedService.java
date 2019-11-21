package com.woniu.his.service;

import com.woniu.his.pojo.Bed;

import java.util.List;

public interface IBedService {
    List<Bed> findAll();

    Bed findById(Integer id);

    int delById( Integer id);

    int insert(Bed bed);

    int addBed(Bed bed);
}
