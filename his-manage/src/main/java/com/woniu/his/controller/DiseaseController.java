package com.woniu.his.controller;

import com.woniu.his.pojo.Disease;
import com.woniu.his.service.IDiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("disease")
public class DiseaseController {
    @Autowired
    IDiseaseService diseaseService;

    @RequestMapping("/findAll")
    public List<Disease> findAll(){
        return diseaseService.findAll();
    }

    @PutMapping("/insert")
    public int insert(@RequestBody Disease disease){
        return diseaseService.insert(disease);
    }


}
