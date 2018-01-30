package com.ggj.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/1/30.
 */
public class Emp implements Serializable {
    private int e_id;
    private int e_uid;
    private int e_jid;
    private int e_did;
    private String e_join;
    private double e_salary;
    private double e_conn;

    public Emp() {
    }

    public Emp(int e_id, int e_uid, int e_jid, int e_did, String e_join, double e_salary, double e_conn) {
        this.e_id = e_id;
        this.e_uid = e_uid;
        this.e_jid = e_jid;
        this.e_did = e_did;
        this.e_join = e_join;
        this.e_salary = e_salary;
        this.e_conn = e_conn;
    }

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public int getE_uid() {
        return e_uid;
    }

    public void setE_uid(int e_uid) {
        this.e_uid = e_uid;
    }

    public int getE_jid() {
        return e_jid;
    }

    public void setE_jid(int e_jid) {
        this.e_jid = e_jid;
    }

    public int getE_did() {
        return e_did;
    }

    public void setE_did(int e_did) {
        this.e_did = e_did;
    }

    public String getE_join() {
        return e_join;
    }

    public void setE_join(String e_join) {
        this.e_join = e_join;
    }

    public double getE_salary() {
        return e_salary;
    }

    public void setE_salary(double e_salary) {
        this.e_salary = e_salary;
    }

    public double getE_conn() {
        return e_conn;
    }

    public void setE_conn(double e_conn) {
        this.e_conn = e_conn;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "e_id=" + e_id +
                ", e_uid=" + e_uid +
                ", e_jid=" + e_jid +
                ", e_did=" + e_did +
                ", e_join='" + e_join + '\'' +
                ", e_salary=" + e_salary +
                ", e_conn=" + e_conn +
                '}';
    }
}
