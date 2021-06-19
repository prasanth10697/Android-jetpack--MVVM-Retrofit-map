package com.spider.vamosys.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReportModelList {

    @SerializedName("rowId")
    @Expose
    private Integer rowId;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("vehicleId")
    @Expose
    private String vehicleId;
    @SerializedName("vehicleMode")
    @Expose
    private String vehicleMode;
    @SerializedName("shortName")
    @Expose
    private String shortName;
    @SerializedName("fcode")
    @Expose
    private String fcode;
    @SerializedName("topSpeed")
    @Expose
    private Integer topSpeed;
    @SerializedName("overSpeedInstances")
    @Expose
    private Integer overSpeedInstances;
    @SerializedName("distanceMonth")
    @Expose
    private Integer distanceMonth;
    @SerializedName("distanceYest")
    @Expose
    private Integer distanceYest;
    @SerializedName("distanceWeek")
    @Expose
    private Integer distanceWeek;
    @SerializedName("odoOpeningReading")
    @Expose
    private Integer odoOpeningReading;
    @SerializedName("odoClosingReading")
    @Expose
    private Integer odoClosingReading;
    @SerializedName("distanceToday")
    @Expose
    private Double distanceToday;
    @SerializedName("parkingCount")
    @Expose
    private Integer parkingCount;
    @SerializedName("topSpeedGeoLocation")
    @Expose
    private String topSpeedGeoLocation;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("topSpeedTime")
    @Expose
    private String topSpeedTime;
    @SerializedName("totalParkedTime")
    @Expose
    private Integer totalParkedTime;
    @SerializedName("totalRunningTime")
    @Expose
    private Integer totalRunningTime;
    @SerializedName("totalIdleTime")
    @Expose
    private Integer totalIdleTime;
    @SerializedName("totalNoDataTime")
    @Expose
    private Integer totalNoDataTime;
    @SerializedName("totalFuelFill")
    @Expose
    private Integer totalFuelFill;
    @SerializedName("totalFuelConsume")
    @Expose
    private Integer totalFuelConsume;
    @SerializedName("startLocation")
    @Expose
    private String startLocation;
    @SerializedName("endLocation")
    @Expose
    private String endLocation;
    @SerializedName("idleCount")
    @Expose
    private Integer idleCount;
    @SerializedName("avgSpeed")
    @Expose
    private Integer avgSpeed;
    @SerializedName("maxStoppage")
    @Expose
    private Integer maxStoppage;
    @SerializedName("totalPrimaryEngineTime")
    @Expose
    private Integer totalPrimaryEngineTime;
    @SerializedName("batteryPowerStatus")
    @Expose
    private String batteryPowerStatus;
    @SerializedName("totalSecondaryEngineTime")
    @Expose
    private Integer totalSecondaryEngineTime;
    @SerializedName("totalSecondaryEngineTimePersent")
    @Expose
    private Integer totalSecondaryEngineTimePersent;

    public Integer getRowId() {
        return rowId;
    }

    public void setRowId(Integer rowId) {
        this.rowId = rowId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleMode() {
        return vehicleMode;
    }

    public void setVehicleMode(String vehicleMode) {
        this.vehicleMode = vehicleMode;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getFcode() {
        return fcode;
    }

    public void setFcode(String fcode) {
        this.fcode = fcode;
    }

    public Integer getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(Integer topSpeed) {
        this.topSpeed = topSpeed;
    }

    public Integer getOverSpeedInstances() {
        return overSpeedInstances;
    }

    public void setOverSpeedInstances(Integer overSpeedInstances) {
        this.overSpeedInstances = overSpeedInstances;
    }

    public Integer getDistanceMonth() {
        return distanceMonth;
    }

    public void setDistanceMonth(Integer distanceMonth) {
        this.distanceMonth = distanceMonth;
    }

    public Integer getDistanceYest() {
        return distanceYest;
    }

    public void setDistanceYest(Integer distanceYest) {
        this.distanceYest = distanceYest;
    }

    public Integer getDistanceWeek() {
        return distanceWeek;
    }

    public void setDistanceWeek(Integer distanceWeek) {
        this.distanceWeek = distanceWeek;
    }

    public Integer getOdoOpeningReading() {
        return odoOpeningReading;
    }

    public void setOdoOpeningReading(Integer odoOpeningReading) {
        this.odoOpeningReading = odoOpeningReading;
    }

    public Integer getOdoClosingReading() {
        return odoClosingReading;
    }

    public void setOdoClosingReading(Integer odoClosingReading) {
        this.odoClosingReading = odoClosingReading;
    }

    public Double getDistanceToday() {
        return distanceToday;
    }

    public void setDistanceToday(Double distanceToday) {
        this.distanceToday = distanceToday;
    }

    public Integer getParkingCount() {
        return parkingCount;
    }

    public void setParkingCount(Integer parkingCount) {
        this.parkingCount = parkingCount;
    }

    public String getTopSpeedGeoLocation() {
        return topSpeedGeoLocation;
    }

    public void setTopSpeedGeoLocation(String topSpeedGeoLocation) {
        this.topSpeedGeoLocation = topSpeedGeoLocation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTopSpeedTime() {
        return topSpeedTime;
    }

    public void setTopSpeedTime(String topSpeedTime) {
        this.topSpeedTime = topSpeedTime;
    }

    public Integer getTotalParkedTime() {
        return totalParkedTime;
    }

    public void setTotalParkedTime(Integer totalParkedTime) {
        this.totalParkedTime = totalParkedTime;
    }

    public Integer getTotalRunningTime() {
        return totalRunningTime;
    }

    public void setTotalRunningTime(Integer totalRunningTime) {
        this.totalRunningTime = totalRunningTime;
    }

    public Integer getTotalIdleTime() {
        return totalIdleTime;
    }

    public void setTotalIdleTime(Integer totalIdleTime) {
        this.totalIdleTime = totalIdleTime;
    }

    public Integer getTotalNoDataTime() {
        return totalNoDataTime;
    }

    public void setTotalNoDataTime(Integer totalNoDataTime) {
        this.totalNoDataTime = totalNoDataTime;
    }

    public Integer getTotalFuelFill() {
        return totalFuelFill;
    }

    public void setTotalFuelFill(Integer totalFuelFill) {
        this.totalFuelFill = totalFuelFill;
    }

    public Integer getTotalFuelConsume() {
        return totalFuelConsume;
    }

    public void setTotalFuelConsume(Integer totalFuelConsume) {
        this.totalFuelConsume = totalFuelConsume;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public Integer getIdleCount() {
        return idleCount;
    }

    public void setIdleCount(Integer idleCount) {
        this.idleCount = idleCount;
    }

    public Integer getAvgSpeed() {
        return avgSpeed;
    }

    public void setAvgSpeed(Integer avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    public Integer getMaxStoppage() {
        return maxStoppage;
    }

    public void setMaxStoppage(Integer maxStoppage) {
        this.maxStoppage = maxStoppage;
    }

    public Integer getTotalPrimaryEngineTime() {
        return totalPrimaryEngineTime;
    }

    public void setTotalPrimaryEngineTime(Integer totalPrimaryEngineTime) {
        this.totalPrimaryEngineTime = totalPrimaryEngineTime;
    }

    public String getBatteryPowerStatus() {
        return batteryPowerStatus;
    }

    public void setBatteryPowerStatus(String batteryPowerStatus) {
        this.batteryPowerStatus = batteryPowerStatus;
    }

    public Integer getTotalSecondaryEngineTime() {
        return totalSecondaryEngineTime;
    }

    public void setTotalSecondaryEngineTime(Integer totalSecondaryEngineTime) {
        this.totalSecondaryEngineTime = totalSecondaryEngineTime;
    }

    public Integer getTotalSecondaryEngineTimePersent() {
        return totalSecondaryEngineTimePersent;
    }

    public void setTotalSecondaryEngineTimePersent(Integer totalSecondaryEngineTimePersent) {
        this.totalSecondaryEngineTimePersent = totalSecondaryEngineTimePersent;
    }
}
