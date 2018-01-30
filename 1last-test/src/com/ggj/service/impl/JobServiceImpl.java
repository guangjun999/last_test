package com.ggj.service.impl;

import com.ggj.dao.JobMapper;
import com.ggj.model.Dept;
import com.ggj.model.Job;
import com.ggj.service.JobService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/1/30.
 */
@Service("jobService")
public class JobServiceImpl implements JobService {
    @Resource
    private JobMapper jobMapper;
    @Override
    public Job getJob(Job job) {
        return jobMapper.getJob(job);
    }

    @Override
    public List<Job> getJobByDept(Dept dept) {
        return jobMapper.getJobByDept(dept);
    }

    @Override
    public boolean saveJob(Job job) {
        return jobMapper.saveJob(job);
    }

    @Override
    public boolean updateJob(Job job) {
        return jobMapper.updateJob(job);
    }

    @Override
    public boolean deleteJob(Job job) {
        return jobMapper.deleteJob(job);
    }
}
