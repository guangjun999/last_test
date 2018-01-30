package com.ggj.service;

import com.ggj.model.Dept;

import java.util.List;

/**
 * Created by Administrator on 2018/1/30.
 */
public interface DeptService {
    Dept getDept(Dept dept);
    List<Dept> getAllDepts();
    boolean saveDept(Dept dept);
    boolean updateDept(Dept dept);
    boolean deleteDept(Dept dept);
}
