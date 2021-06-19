package com.spider.vamosys.Network;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static final String PROFILE_URL = "https://reqres.in/api/";
    private static final String PEPORT_URL = "http://209.97.163.4:9000/mobile/";
    private static Retrofit retrofitProfile,retrofitReport;

    public static Retrofit getRetrofitProfile(){
        if (retrofitProfile == null) {
            retrofitProfile = new Retrofit.Builder()
                    .baseUrl(PROFILE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofitProfile;
    }

    public static Retrofit getRetrofitReport(){

        final OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(chain -> {
            Request newRequest = chain.request()
                    .newBuilder()
                    .build();
            return chain.proceed(newRequest);
        }).build();

        if (retrofitReport == null) {
            retrofitReport = new Retrofit.Builder()
                    .baseUrl(PEPORT_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClient)
                    .build();
        }
        return retrofitReport;
    }

}
