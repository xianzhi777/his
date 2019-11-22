package com.woniu.his.service;

import com.woniu.his.pojo.Disease;

import java.util.List;

public interface IDiseaseService {
    List<Disease> findAll();

    int insert(Disease disease);
}
