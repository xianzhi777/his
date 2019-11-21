package com.woniu.his.service;

import com.woniu.his.mapper.NationMapper;
import com.woniu.his.pojo.Nation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author EDZ
 * @create 2019/11/20
 * @since 1.0.0
 */
@Service
public class NationServiceImpl implements NationService{
    @Autowired
    NationMapper nationMapper;
    @Override
    public List<Nation> findAll() {
        return nationMapper.selectAll();
    }
}
