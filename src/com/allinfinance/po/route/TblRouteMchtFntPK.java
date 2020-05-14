package com.allinfinance.po.route;

import java.io.Serializable;
import java.util.Objects;

/**
 * @ClassName TblRouteMchtFntPK
 * @Author lmj
 * @Date 2020/5/6
 * @Version 1.0
 */
public class TblRouteMchtFntPK implements Serializable {
    private String mchtIdUp;
    private String termIdUp;

    public String getMchtIdUp() {
        return mchtIdUp;
    }

    public void setMchtIdUp(String mchtIdUp) {
        this.mchtIdUp = mchtIdUp;
    }

    public String getTermIdUp() {
        return termIdUp;
    }

    public void setTermIdUp(String termIdUp) {
        this.termIdUp = termIdUp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblRouteMchtFntPK that = (TblRouteMchtFntPK) o;
        return Objects.equals(mchtIdUp, that.mchtIdUp) &&
                Objects.equals(termIdUp, that.termIdUp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mchtIdUp, termIdUp);
    }
}
