package com.ggj.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/1/30.
 */
public class Job implements Serializable {
    private int j_id;
    private String j_name;
    private int j_did;
    private String j_describe;

    public Job() {
    }

    public Job(int j_id, String j_name, int j_did, String j_describe) {
        this.j_id = j_id;
        this.j_name = j_name;
        this.j_did = j_did;
        this.j_describe = j_describe;
    }

    public int getJ_id() {
        return j_id;
    }

    public void setJ_id(int j_id) {
        this.j_id = j_id;
    }

    public String getJ_name() {
        return j_name;
    }

    public void setJ_name(String j_name) {
        this.j_name = j_name;
    }

    public int getJ_did() {
        return j_did;
    }

    public void setJ_did(int j_did) {
        this.j_did = j_did;
    }

    public String getJ_describe() {
        return j_describe;
    }

    public void setJ_describe(String j_describe) {
        this.j_describe = j_describe;
    }

    @Override
    public String toString() {
        return "Job{" +
                "j_id=" + j_id +
                ", j_name='" + j_name + '\'' +
                ", j_did=" + j_did +
                ", j_describe='" + j_describe + '\'' +
                '}';
    }
}
