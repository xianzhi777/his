package com.woniu.his.mapper;

import com.woniu.his.pojo.CaseHistory;
import com.woniu.his.pojo.CaseHistoryVo;
import com.woniu.his.vo.CaseHistoryQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CaseHistoryMapper {
    int deleteByPrimaryKey(Integer chId);

    int insert(CaseHistory record);

    CaseHistoryVo selectByPrimaryKey(Integer chId);

    List<CaseHistoryVo> selectAll();

    List<CaseHistoryVo> selectByCaseHistoryQueryVo(@Param("qv") CaseHistoryQueryVo caseHistoryQueryVo);

    int updateByPrimaryKey(CaseHistory record);
}
