package com.woniu.his.controller;

import com.woniu.his.pojo.Level;
import com.woniu.his.service.ILevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/level")
public class LevelController {
    @Autowired
    ILevelService levelService;
    @RequestMapping("/all")
    public List<Level> selectAll(){
        return levelService.selectAll();
    }
}
