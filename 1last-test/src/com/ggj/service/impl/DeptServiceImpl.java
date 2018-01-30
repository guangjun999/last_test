package com.ggj.service.impl;

import com.ggj.dao.DeptMapper;
import com.ggj.model.Dept;
import com.ggj.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/1/30.
 */
@Service("deptService")
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptMapper deptMapper;
    @Override
    public Dept getDept(Dept dept) {
        return deptMapper.getDept(dept);
    }

    @Override
    public List<Dept> getAllDepts() {
        return deptMapper.getAllDepts();
    }

    @Override
    public boolean saveDept(Dept dept) {
        return deptMapper.saveDept(dept);
    }

    @Override
    public boolean updateDept(Dept dept) {
        return deptMapper.updateDept(dept);
    }

    @Override
    public boolean deleteDept(Dept dept) {
        return deptMapper.deleteDept(dept);
    }
}
