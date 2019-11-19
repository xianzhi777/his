package com.woniu.his.mapper;

import com.woniu.his.pojo.Appointment;
import com.woniu.his.pojo.AppointmentVo;
import com.woniu.his.vo.AppointmentQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppointmentMapper {
    int deleteByPrimaryKey(Integer appoId);

    int insert(Appointment record);

    AppointmentVo selectByPrimaryKey(Integer appoId);

    List<AppointmentVo> selectAll();

    List<AppointmentVo> selectByAppointmentQueryVo(@Param("qv") AppointmentQueryVo appointmentQueryVo);

    int updateByPrimaryKey(Appointment record);
}
