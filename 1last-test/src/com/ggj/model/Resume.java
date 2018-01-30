package com.ggj.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/1/29.
 */
public class Resume implements Serializable{
    private int r_id;
    private String r_birth;
    private String r_address;
    private String r_name;
    private String r_gender;
    private String r_school;
    private String r_education;
    private String r_phone;
    private String r_email;
    private String r_describe;
    private String r_case;
    private String r_appraise;
    private int r_uid;


    public Resume() {
    }

    public Resume(int r_id, String r_birth, String r_address, String r_name, String r_gender, String r_school, String r_education, String r_phone, String r_email, String r_describe, String r_case, String r_appraise, int r_uid) {
        this.r_id = r_id;
        this.r_birth = r_birth;
        this.r_address = r_address;
        this.r_name = r_name;
        this.r_gender = r_gender;
        this.r_school = r_school;
        this.r_education = r_education;
        this.r_phone = r_phone;
        this.r_email = r_email;
        this.r_describe = r_describe;
        this.r_case = r_case;
        this.r_appraise = r_appraise;
        this.r_uid = r_uid;
    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public String getR_birth() {
        return r_birth;
    }

    public void setR_birth(String r_birth) {
        this.r_birth = r_birth;
    }

    public String getR_address() {
        return r_address;
    }

    public void setR_address(String r_address) {
        this.r_address = r_address;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    public String getR_gender() {
        return r_gender;
    }

    public void setR_gender(String r_gender) {
        this.r_gender = r_gender;
    }

    public String getR_school() {
        return r_school;
    }

    public void setR_school(String r_school) {
        this.r_school = r_school;
    }

    public String getR_education() {
        return r_education;
    }

    public void setR_education(String r_education) {
        this.r_education = r_education;
    }

    public String getR_phone() {
        return r_phone;
    }

    public void setR_phone(String r_phone) {
        this.r_phone = r_phone;
    }

    public String getR_email() {
        return r_email;
    }

    public void setR_email(String r_email) {
        this.r_email = r_email;
    }

    public String getR_describe() {
        return r_describe;
    }

    public void setR_describe(String r_describe) {
        this.r_describe = r_describe;
    }

    public String getR_case() {
        return r_case;
    }

    public void setR_case(String r_case) {
        this.r_case = r_case;
    }

    public String getR_appraise() {
        return r_appraise;
    }

    public void setR_appraise(String r_appraise) {
        this.r_appraise = r_appraise;
    }

    public int getR_uid() {
        return r_uid;
    }

    public void setR_uid(int r_uid) {
        this.r_uid = r_uid;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "r_id=" + r_id +
                ", r_birth='" + r_birth + '\'' +
                ", r_address='" + r_address + '\'' +
                ", r_name='" + r_name + '\'' +
                ", r_gender='" + r_gender + '\'' +
                ", r_school='" + r_school + '\'' +
                ", r_education='" + r_education + '\'' +
                ", r_phone='" + r_phone + '\'' +
                ", r_email='" + r_email + '\'' +
                ", r_describe='" + r_describe + '\'' +
                ", r_case='" + r_case + '\'' +
                ", r_appraise='" + r_appraise + '\'' +
                ", r_uid=" + r_uid +
                '}';
    }
}
