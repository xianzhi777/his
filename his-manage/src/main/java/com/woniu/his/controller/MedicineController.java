package com.woniu.his.controller;

import com.woniu.his.pojo.Medicine;
import com.woniu.his.service.IMedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicine")
public class MedicineController {
    @Autowired
    IMedicineService medicineService;

    @RequestMapping("/findAll")
    public List<Medicine> findAllMedicine(){
        return medicineService.findAll();
    }
    @RequestMapping("/delById/{medicineId}")
    public int delById(@PathVariable("medicineId") Integer medicineId){
        System.out.println(medicineId);
        return medicineService.deleteById(medicineId);
    }
    @RequestMapping("/insert")
    public int insert(@RequestBody Medicine medicine){
        System.out.println(medicine);
        return medicineService.insert(medicine);
    }
    @RequestMapping("/updateById")
    public int updateById(@RequestBody Medicine medicine){
        System.out.println(medicine);
        return medicineService.updateByPrimaryKey(medicine);
    }
    @RequestMapping("/findById/{id}")
    public Medicine findById(@PathVariable("id") Integer id){
        System.out.println(id);
        return medicineService.selectByPrimaryKey(id);
    }


}
