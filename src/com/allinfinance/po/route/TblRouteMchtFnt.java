package com.allinfinance.po.route;

import java.util.Objects;

/**
 * @ClassName TblRouteMchtFnt
 * @Author lmj
 * @Date 2020/5/6
 * @Version 1.0
 */
public class TblRouteMchtFnt {

    private TblRouteMchtFntPK id;
    private String mchtIdFnt;
    private String termIdFnt;
    private String crtOpr;
    private String crtTime;
    private String updOpr;
    private String updTime;

    public TblRouteMchtFntPK getId() {
        return id;
    }

    public void setId(TblRouteMchtFntPK id) {
        this.id = id;
    }

    public String getMchtIdFnt() {
        return mchtIdFnt;
    }

    public void setMchtIdFnt(String mchtIdFnt) {
        this.mchtIdFnt = mchtIdFnt;
    }

    public String getTermIdFnt() {
        return termIdFnt;
    }

    public void setTermIdFnt(String termIdFnt) {
        this.termIdFnt = termIdFnt;
    }

    public String getCrtOpr() {
        return crtOpr;
    }

    public void setCrtOpr(String crtOpr) {
        this.crtOpr = crtOpr;
    }

    public String getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(String crtTime) {
        this.crtTime = crtTime;
    }

    public String getUpdOpr() {
        return updOpr;
    }

    public void setUpdOpr(String updOpr) {
        this.updOpr = updOpr;
    }

    public String getUpdTime() {
        return updTime;
    }

    public void setUpdTime(String updTime) {
        this.updTime = updTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblRouteMchtFnt that = (TblRouteMchtFnt) o;
        return
                Objects.equals(id, that.id) &&
                Objects.equals(mchtIdFnt, that.mchtIdFnt) &&
                Objects.equals(termIdFnt, that.termIdFnt) &&
                Objects.equals(crtOpr, that.crtOpr) &&
                Objects.equals(crtTime, that.crtTime) &&
                Objects.equals(updOpr, that.updOpr) &&
                Objects.equals(updTime, that.updTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,mchtIdFnt, termIdFnt, crtOpr, crtTime, updOpr, updTime);
    }
}
