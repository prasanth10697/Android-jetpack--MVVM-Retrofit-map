package com.spider.vamosys.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CommomModel {

    @SerializedName("error")
    @Expose
    private Object error;
    @SerializedName("response")
    @Expose
    private String response;
    @SerializedName("data")
    @Expose
    private ReportModel data;

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public ReportModel getData() {
        return data;
    }

    public void setData(ReportModel data) {
        this.data = data;
    }
}
