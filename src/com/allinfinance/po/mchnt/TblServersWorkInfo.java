package com.allinfinance.po.mchnt;

import java.util.Objects;

public class TblServersWorkInfo {
    private int no;
    private String operatorType;
    private String contentType;
    private String commNm;
    private String commTel;
    private String clientSrc;
    private String itemType;
    private String mchtBrhNo;
    private String isUrgent;
    private String status;
    private String lastDate;
    private String remark;
    private String identityPic;
    private String recCrtOpr;
    private String recCrtTs;
    private String recUpdOpr;
    private String recUpdTs;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(String operatorType) {
        this.operatorType = operatorType;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getCommNm() {
        return commNm;
    }

    public void setCommNm(String commNm) {
        this.commNm = commNm;
    }

    public String getCommTel() {
        return commTel;
    }

    public void setCommTel(String commTel) {
        this.commTel = commTel;
    }

    public String getClientSrc() {
        return clientSrc;
    }

    public void setClientSrc(String clientSrc) {
        this.clientSrc = clientSrc;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getMchtBrhNo() {
        return mchtBrhNo;
    }

    public void setMchtBrhNo(String mchtBrhNo) {
        this.mchtBrhNo = mchtBrhNo;
    }

    public String getIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(String isUrgent) {
        this.isUrgent = isUrgent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIdentityPic() {
        return identityPic;
    }

    public void setIdentityPic(String identityPic) {
        this.identityPic = identityPic;
    }

    public String getRecCrtOpr() {
        return recCrtOpr;
    }

    public void setRecCrtOpr(String recCrtOpr) {
        this.recCrtOpr = recCrtOpr;
    }

    public String getRecCrtTs() {
        return recCrtTs;
    }

    public void setRecCrtTs(String recCrtTs) {
        this.recCrtTs = recCrtTs;
    }

    public String getRecUpdOpr() {
        return recUpdOpr;
    }

    public void setRecUpdOpr(String recUpdOpr) {
        this.recUpdOpr = recUpdOpr;
    }

    public String getRecUpdTs() {
        return recUpdTs;
    }

    public void setRecUpdTs(String recUpdTs) {
        this.recUpdTs = recUpdTs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblServersWorkInfo that = (TblServersWorkInfo) o;
        return no == that.no &&
                Objects.equals(operatorType, that.operatorType) &&
                Objects.equals(contentType, that.contentType) &&
                Objects.equals(commNm, that.commNm) &&
                Objects.equals(commTel, that.commTel) &&
                Objects.equals(clientSrc, that.clientSrc) &&
                Objects.equals(itemType, that.itemType) &&
                Objects.equals(mchtBrhNo, that.mchtBrhNo) &&
                Objects.equals(isUrgent, that.isUrgent) &&
                Objects.equals(status, that.status) &&
                Objects.equals(lastDate, that.lastDate) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(identityPic, that.identityPic) &&
                Objects.equals(recCrtOpr, that.recCrtOpr) &&
                Objects.equals(recCrtTs, that.recCrtTs) &&
                Objects.equals(recUpdOpr, that.recUpdOpr) &&
                Objects.equals(recUpdTs, that.recUpdTs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, operatorType, contentType, commNm, commTel, clientSrc, itemType, mchtBrhNo, isUrgent, status, lastDate, remark, identityPic, recCrtOpr, recCrtTs, recUpdOpr, recUpdTs);
    }
}
