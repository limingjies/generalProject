package com.allinfinance.po.mchnt;

import java.io.Serializable;
import java.util.Objects;

public class TblServersWorkInfoHisPK implements Serializable {
    private int no;
    private int noNew;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getNoNew() {
        return noNew;
    }

    public void setNoNew(int noNew) {
        this.noNew = noNew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblServersWorkInfoHisPK that = (TblServersWorkInfoHisPK) o;
        return no == that.no &&
                noNew == that.noNew;
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, noNew);
    }
}
