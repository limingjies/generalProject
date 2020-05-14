package com.allinfinance.po.mchnt;

import java.util.Objects;

public class TblMchtBigpos88Ctl {
    private String mchtNo;
    private String status;

    public String getMchtNo() {
        return mchtNo;
    }

    public void setMchtNo(String mchtNo) {
        this.mchtNo = mchtNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblMchtBigpos88Ctl that = (TblMchtBigpos88Ctl) o;
        return Objects.equals(mchtNo, that.mchtNo) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mchtNo, status);
    }
}
