package com.woniu.his.controller;

import com.woniu.his.pojo.Nation;
import com.woniu.his.service.NationService;
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
 * @create 2019/11/20
 * @since 1.0.0
 */
@RestController
@RequestMapping("nation")
public class NationController {
    @Autowired
    NationService nationService;
    @GetMapping("all")
    public List<Nation> getAll(){
        return nationService.findAll();
    }
}
