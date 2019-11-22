package com.woniu.his.controller;

import com.woniu.his.pojo.Bed;
import com.woniu.his.service.IBedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bed")
public class BedController {
    @Autowired
    IBedService bedService;

    @GetMapping("findAll")
    public List<Bed> findAll(){
        return bedService.findAll();
    }

    @GetMapping("findById")
    public Bed findById(Integer id){
        return bedService.findById(id);
    }

    @PutMapping("insert")
    public int insert(@RequestBody Bed bed){
        return bedService.insert(bed);
    }
    @DeleteMapping("/delById/{id}")
    public int delById(@PathVariable("id") Integer id){
        return bedService.delById(id);
    }
}
