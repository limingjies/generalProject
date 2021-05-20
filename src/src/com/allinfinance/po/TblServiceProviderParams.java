package com.allinfinance.po;

import java.util.Objects;

/**
 * @ClassName TblServiceProviderParams
 * @Author lmj
 * @Date 2021/5/20
 * @Version 1.0
 */
public class TblServiceProviderParams {
    private String createNewNo;
    private String channelId;
    private String channelType;
    private String serviceProvider;
    private String wxAppid;
    private String wxAppsecret;
    private String staticCode;
    private String status;
    private String recTs;
    private String updTs;
    private String recOpr;
    private String updOpr;

    public String getCreateNewNo() {
        return createNewNo;
    }

    public void setCreateNewNo(String createNewNo) {
        this.createNewNo = createNewNo;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public String getWxAppid() {
        return wxAppid;
    }

    public void setWxAppid(String wxAppid) {
        this.wxAppid = wxAppid;
    }

    public String getWxAppsecret() {
        return wxAppsecret;
    }

    public void setWxAppsecret(String wxAppsecret) {
        this.wxAppsecret = wxAppsecret;
    }

    public String getStaticCode() {
        return staticCode;
    }

    public void setStaticCode(String staticCode) {
        this.staticCode = staticCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRecTs() {
        return recTs;
    }

    public void setRecTs(String recTs) {
        this.recTs = recTs;
    }

    public String getUpdTs() {
        return updTs;
    }

    public void setUpdTs(String updTs) {
        this.updTs = updTs;
    }

    public String getRecOpr() {
        return recOpr;
    }

    public void setRecOpr(String recOpr) {
        this.recOpr = recOpr;
    }

    public String getUpdOpr() {
        return updOpr;
    }

    public void setUpdOpr(String updOpr) {
        this.updOpr = updOpr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblServiceProviderParams that = (TblServiceProviderParams) o;
        return Objects.equals(createNewNo, that.createNewNo) &&
                Objects.equals(channelId, that.channelId) &&
                Objects.equals(channelType, that.channelType) &&
                Objects.equals(serviceProvider, that.serviceProvider) &&
                Objects.equals(wxAppid, that.wxAppid) &&
                Objects.equals(wxAppsecret, that.wxAppsecret) &&
                Objects.equals(staticCode, that.staticCode) &&
                Objects.equals(status, that.status) &&
                Objects.equals(recTs, that.recTs) &&
                Objects.equals(updTs, that.updTs) &&
                Objects.equals(recOpr, that.recOpr) &&
                Objects.equals(updOpr, that.updOpr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createNewNo, channelId, channelType, serviceProvider, wxAppid, wxAppsecret, staticCode, status, recTs, updTs, recOpr, updOpr);
    }
}
