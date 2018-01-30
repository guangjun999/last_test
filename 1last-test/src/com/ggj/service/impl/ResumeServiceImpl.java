package com.ggj.service.impl;

import com.ggj.dao.ResumeMapper;
import com.ggj.model.Resume;
import com.ggj.service.ResumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/1/29.
 */
@Service("resumeService")
public class ResumeServiceImpl implements ResumeService {
    @Resource
    private ResumeMapper resumeMapper;
    @Override
    public List<Resume> getAllResume() {
        return resumeMapper.getAllResume();
    }

    @Override
    public Resume getResumes(int r_uid) {
        return resumeMapper.getResumes(r_uid);
    }

    @Override
    public Resume getResume(int r_id) {
        return resumeMapper.getResume(r_id);
    }

    @Override
    public boolean saveResume(Resume resume) {
        return resumeMapper.saveResume(resume);
    }

    @Override
    public boolean updateResume(Resume resume) {
        return resumeMapper.updateResume(resume);
    }

    @Override
    public boolean deleteResume(int r_id) {
        return resumeMapper.deleteResume(r_id);
    }
}
