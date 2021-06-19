package com.spider.vamosys.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ReportModel {

    @SerializedName("excutiveData")
    @Expose
    private List<ReportModelList> excutiveData = null;
    @SerializedName("vehicleId")
    @Expose
    private String vehicleId;
    @SerializedName("fromDate")
    @Expose
    private String fromDate;
    @SerializedName("toDate")
    @Expose
    private String toDate;
    @SerializedName("kms")
    @Expose
    private String kms;
    @SerializedName("totalParkCount")
    @Expose
    private Integer totalParkCount;
    @SerializedName("overSpeedCount")
    @Expose
    private Integer overSpeedCount;
    @SerializedName("totalMoveTime")
    @Expose
    private Integer totalMoveTime;
    @SerializedName("totalParkTime")
    @Expose
    private Integer totalParkTime;
    @SerializedName("totalNoDataTime")
    @Expose
    private Integer totalNoDataTime;
    @SerializedName("totalIdleTime")
    @Expose
    private Integer totalIdleTime;
    @SerializedName("startLoc")
    @Expose
    private String startLoc;
    @SerializedName("endLoc")
    @Expose
    private String endLoc;
    @SerializedName("power")
    @Expose
    private String power;
    @SerializedName("error")
    @Expose
    private Object error;

    public List<ReportModelList> getExcutiveData() {
        return excutiveData;
    }

    public void setExcutiveData(List<ReportModelList> excutiveData) {
        this.excutiveData = excutiveData;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getKms() {
        return kms;
    }

    public void setKms(String kms) {
        this.kms = kms;
    }

    public Integer getTotalParkCount() {
        return totalParkCount;
    }

    public void setTotalParkCount(Integer totalParkCount) {
        this.totalParkCount = totalParkCount;
    }

    public Integer getOverSpeedCount() {
        return overSpeedCount;
    }

    public void setOverSpeedCount(Integer overSpeedCount) {
        this.overSpeedCount = overSpeedCount;
    }

    public Integer getTotalMoveTime() {
        return totalMoveTime;
    }

    public void setTotalMoveTime(Integer totalMoveTime) {
        this.totalMoveTime = totalMoveTime;
    }

    public Integer getTotalParkTime() {
        return totalParkTime;
    }

    public void setTotalParkTime(Integer totalParkTime) {
        this.totalParkTime = totalParkTime;
    }

    public Integer getTotalNoDataTime() {
        return totalNoDataTime;
    }

    public void setTotalNoDataTime(Integer totalNoDataTime) {
        this.totalNoDataTime = totalNoDataTime;
    }

    public Integer getTotalIdleTime() {
        return totalIdleTime;
    }

    public void setTotalIdleTime(Integer totalIdleTime) {
        this.totalIdleTime = totalIdleTime;
    }

    public String getStartLoc() {
        return startLoc;
    }

    public void setStartLoc(String startLoc) {
        this.startLoc = startLoc;
    }

    public String getEndLoc() {
        return endLoc;
    }

    public void setEndLoc(String endLoc) {
        this.endLoc = endLoc;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }
}
