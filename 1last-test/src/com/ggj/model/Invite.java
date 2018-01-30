package com.ggj.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/1/30.
 */
public class Invite implements Serializable {
    private int i_id;
    private int i_jid;
    private int i_did;

    public Invite() {
    }

    public Invite(int i_id, int i_jid, int i_did) {
        this.i_id = i_id;
        this.i_jid = i_jid;
        this.i_did = i_did;
    }

    public int getI_id() {
        return i_id;
    }

    public void setI_id(int i_id) {
        this.i_id = i_id;
    }

    public int getI_jid() {
        return i_jid;
    }

    public void setI_jid(int i_jid) {
        this.i_jid = i_jid;
    }

    public int getI_did() {
        return i_did;
    }

    public void setI_did(int i_did) {
        this.i_did = i_did;
    }

    @Override
    public String toString() {
        return "Invite{" +
                "i_id=" + i_id +
                ", i_jid=" + i_jid +
                ", i_did=" + i_did +
                '}';
    }
}
