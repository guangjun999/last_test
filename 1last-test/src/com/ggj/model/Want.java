package com.ggj.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/1/30.
 */
public class Want implements Serializable {
    private int w_id;
    private int w_uid;
    private int w_jid;
    private int w_did;
    private int w_state;

    public Want() {
    }

    public Want(int w_id, int w_uid, int w_jid, int w_did, int w_state) {
        this.w_id = w_id;
        this.w_uid = w_uid;
        this.w_jid = w_jid;
        this.w_did = w_did;
        this.w_state = w_state;
    }

    public int getW_id() {
        return w_id;
    }

    public void setW_id(int w_id) {
        this.w_id = w_id;
    }

    public int getW_uid() {
        return w_uid;
    }

    public void setW_uid(int w_uid) {
        this.w_uid = w_uid;
    }

    public int getW_jid() {
        return w_jid;
    }

    public void setW_jid(int w_jid) {
        this.w_jid = w_jid;
    }

    public int getW_did() {
        return w_did;
    }

    public void setW_did(int w_did) {
        this.w_did = w_did;
    }

    public int getW_state() {
        return w_state;
    }

    public void setW_state(int w_state) {
        this.w_state = w_state;
    }

    @Override
    public String toString() {
        return "Want{" +
                "w_id=" + w_id +
                ", w_uid=" + w_uid +
                ", w_jid=" + w_jid +
                ", w_did=" + w_did +
                ", w_state=" + w_state +
                '}';
    }
}
