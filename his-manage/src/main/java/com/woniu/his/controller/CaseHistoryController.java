package com.woniu.his.controller;

import com.woniu.his.pojo.CaseHistoryVo;
import com.woniu.his.service.CaseHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author EDZ
 * @create 2019/11/21
 * @since 1.0.0
 */
@RestController
@RequestMapping("ch")
public class CaseHistoryController {
    @Autowired
    CaseHistoryService caseHistoryService;

    @GetMapping("all")
    public List<CaseHistoryVo> getAll(){
        return caseHistoryService.findAll();
    }
}
