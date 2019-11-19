package com.woniu.his.mapper;

import com.woniu.his.pojo.Medicine;
import com.woniu.his.vo.MedicineQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MedicineMapper {
    int deleteByPrimaryKey(Integer medicineId);

    int insert(Medicine record);

    Medicine selectByPrimaryKey(Integer medicineId);

    List<Medicine> selectAll();

    List<Medicine> selectByMedicineQueryVo(@Param("qv") MedicineQueryVo medicineQueryVo);

    int updateByPrimaryKey(Medicine record);
}
