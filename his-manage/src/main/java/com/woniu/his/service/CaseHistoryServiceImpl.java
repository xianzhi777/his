package com.woniu.his.service;

import com.woniu.his.mapper.CaseHistoryMapper;
import com.woniu.his.pojo.CaseHistoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author EDZ
 * @create 2019/11/21
 * @since 1.0.0
 */
@Service
public class CaseHistoryServiceImpl implements CaseHistoryService{
    @Autowired
    CaseHistoryMapper caseHistoryMapper;
    @Override
    public List<CaseHistoryVo> findAll() {
        return caseHistoryMapper.selectAll();
    }
}
