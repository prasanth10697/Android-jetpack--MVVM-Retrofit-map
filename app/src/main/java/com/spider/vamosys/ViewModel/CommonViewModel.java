package com.spider.vamosys.ViewModel;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.spider.vamosys.Interface.CommonInterface;
import com.spider.vamosys.Model.CommomModel;
import com.spider.vamosys.Model.ProfileListModel;
import com.spider.vamosys.Model.ReportModel;
import com.spider.vamosys.Model.ProfileModel;
import com.spider.vamosys.Model.ReportModelList;
import com.spider.vamosys.Network.RetrofitClient;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CommonViewModel extends ViewModel {

    MutableLiveData<List<ProfileListModel>> mutableLiveProfileData = new MutableLiveData<>();
    MutableLiveData<ReportModel> mutableLivereportData = new MutableLiveData<>();
    MutableLiveData<List<ReportModelList>> mutableLiveReportData = new MutableLiveData<>();

    public MutableLiveData<List<ProfileListModel>> getProfileList() {
        if (mutableLiveProfileData == null) {
            mutableLiveProfileData = new MutableLiveData<>();
        }
        return mutableLiveProfileData;
    }
    public MutableLiveData<List<ReportModelList>> getReportList() {
        if (mutableLiveReportData == null) {
            mutableLiveReportData = new MutableLiveData<>();
        }
        return mutableLiveReportData;
    }

    public void getProfile(){
        CommonInterface profileApiService = RetrofitClient.getRetrofitProfile().create(CommonInterface.class);

        Call<ProfileModel> call = profileApiService.getProfileData();
        call.enqueue(new Callback<ProfileModel>() {
            @Override
            public void onResponse(@NonNull Call<ProfileModel> call, @NonNull Response<ProfileModel> response) {
                if (response.body() != null) {
                    mutableLiveProfileData.setValue(response.body().getData());
                }
            }

            @Override
            public void onFailure(@NonNull Call<ProfileModel> call, Throwable t) {

            }
        });
    }

    public void getReport() {

        CommonInterface reportApiService = RetrofitClient.getRetrofitReport().create(CommonInterface.class);
        HashMap<String, String> showRenewalReport = new HashMap<>();
        showRenewalReport.put("fromDate", "2021-06-08");
        showRenewalReport.put("vehicleId", "TN21BZ0897-");
        showRenewalReport.put("toDate", "2021-06-15");
        showRenewalReport.put("userId", "OTTO");

        Call<CommomModel> call = reportApiService.getReportData(showRenewalReport);
        call.enqueue(new Callback<CommomModel>() {
            @Override
            public void onResponse(@NonNull Call<CommomModel> call, @NonNull Response<CommomModel> response) {
                if (response.body() != null) {
                    mutableLivereportData.setValue(response.body().getData());
                    mutableLiveReportData.setValue(Objects.requireNonNull(mutableLivereportData.getValue()).getExcutiveData());
                }
            }

            @Override
            public void onFailure(@NonNull Call<CommomModel> call, Throwable t) {
                Log.d("hit", "onFailure: "+t.getMessage());
            }
        });
    }
}
