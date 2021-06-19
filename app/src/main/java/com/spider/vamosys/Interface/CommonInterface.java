package com.spider.vamosys.Interface;


import com.spider.vamosys.Model.CommomModel;
import com.spider.vamosys.Model.ProfileModel;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface CommonInterface {

    /*----PROFILE GET DATA----- */
    @GET("users?page=2")
    Call<ProfileModel> getProfileData();

    /*----REPORT GET DATA----- */
    @GET("getPerformanceReportVehicleBased?")
    Call<CommomModel> getReportData(@QueryMap HashMap<String, String> showRenewalReport);

}
