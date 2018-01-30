package com.ggj.service;

import com.ggj.model.Resume;

import java.util.List;

/**
 * Created by Administrator on 2018/1/29.
 */
public interface ResumeService {
    List<Resume> getAllResume();
    Resume getResumes(int r_uid);
    Resume getResume(int r_id);
    boolean saveResume(Resume resume);
    boolean updateResume(Resume resume);
    boolean deleteResume(int r_id);
}
