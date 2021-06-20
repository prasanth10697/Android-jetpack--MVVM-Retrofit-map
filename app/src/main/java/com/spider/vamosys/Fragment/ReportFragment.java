package com.spider.vamosys.Fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.spider.vamosys.ViewModel.CommonViewModel;
import com.spider.vamosys.databinding.FragmentReportBinding;

public class ReportFragment extends Fragment {

    FragmentReportBinding reportBinding;
    CommonViewModel postViewModel;

    public ReportFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        reportBinding = FragmentReportBinding.inflate(inflater, container, false);

        reportBinding.toolbar.setTitle("REPORT");
        postViewModel = ViewModelProviders.of(this).get(CommonViewModel.class);
        postViewModel.getReportList().observe(getViewLifecycleOwner(), reportModelLists -> {
            if(reportModelLists !=null) {
                for (int i = 0; i < reportModelLists.size(); i++) {
                    Log.d("hit", "onCreateView: " + reportModelLists.get(i).getRowId());
                    reportBinding.rowid.append("\n"+"\n" + String.valueOf(reportModelLists.get(i).getRowId()) + "\n");
                    reportBinding.vehicleId.append("\n" +"\n" + String.valueOf(reportModelLists.get(i).getShortName()) + "\n");
                    reportBinding.topSpeed.append("\n" +"\n" + String.valueOf(reportModelLists.get(i).getTopSpeed()) + "\n");
                    reportBinding.topSpeedtime.append("\n" +"\n" + String.valueOf(reportModelLists.get(i).getTopSpeedTime()) + "\n");
                    reportBinding.totalParkedTime.append("\n" +"\n" + String.valueOf(reportModelLists.get(i).getTotalParkedTime()) + "\n");
                    reportBinding.totalRunningTime.append("\n" +"\n" + String.valueOf(reportModelLists.get(i).getTotalRunningTime()) + "\n");
                    reportBinding.address.append("\n" +"\n" + String.valueOf(reportModelLists.get(i).getAddress()) + "\n");
                }
            }
        });
        postViewModel.getReport();
        return reportBinding.getRoot();
    }

}