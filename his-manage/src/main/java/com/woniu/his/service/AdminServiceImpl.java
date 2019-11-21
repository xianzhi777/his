package com.woniu.his.service;

import com.woniu.his.mapper.AdminMapper;
import com.woniu.his.pojo.Admin;
import com.woniu.his.pojo.AdminVo;
import com.woniu.his.vo.AdminQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminServiceImpl implements IAdminService{
    @Resource
    AdminMapper adminMapper;
    @Override
    public List<AdminVo> selectAdminByAccountAndPassword(AdminQueryVo adminQueryVo) {
        return adminMapper.selectByAdminQueryVo(adminQueryVo);
    }

    @Override
    public List<AdminVo> selectAllAdmin3() {
        AdminQueryVo adminQueryVo=new AdminQueryVo();
        adminQueryVo.setStatus(3);
        return adminMapper.selectByAdminQueryVo(adminQueryVo);
    }

    @Override
    public int insertAdmin3(Admin admin) {
        admin.setStatus(3);
        admin.setFlag(1);
        adminMapper.insert(admin);
        return 1;
    }

    @Override
    public int updateAdmin3(Admin admin) {
        admin.setStatus(3);
        admin.setFlag(1);
        return adminMapper.updateByPrimaryKey(admin);
    }
}
