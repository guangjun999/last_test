package com.ggj.service;

import com.ggj.model.Dept;
import com.ggj.model.Job;

import java.util.List;

/**
 * Created by Administrator on 2018/1/30.
 */
public interface JobService {
    Job getJob(Job job);
    List<Job> getJobByDept(Dept dept);
    boolean saveJob(Job job);
    boolean updateJob(Job job);
    boolean deleteJob(Job job);
}
