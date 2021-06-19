package com.spider.vamosys.Fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.spider.vamosys.Model.ReportModelList;
import com.spider.vamosys.ViewModel.CommonViewModel;
import com.spider.vamosys.databinding.FragmentReportBinding;
import com.spider.vamosys.databinding.ReportListTableviewBinding;

import org.jetbrains.annotations.NotNull;
import java.util.List;



public class ReportFragment extends Fragment {

    FragmentReportBinding reportBinding;
    ReportAdapter adapter;
    CommonViewModel postViewModel;

    public ReportFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        reportBinding = FragmentReportBinding.inflate(inflater, container, false);

        reportBinding.toolbar.setTitle("REPORT");
        adapter = new ReportAdapter(getActivity());
        reportBinding.recyclerPost.setLayoutManager(new GridLayoutManager(getContext(), 1));
        reportBinding.recyclerPost.setAdapter(adapter);
        postViewModel = ViewModelProviders.of(this).get(CommonViewModel.class);
        postViewModel.getReportList().observe(getViewLifecycleOwner(), adapter::setList);
        postViewModel.getReport();
        return reportBinding.getRoot();
    }


    public class ReportAdapter extends RecyclerView.Adapter<ReportAdapter.ReportViewHolder>{

        ReportListTableviewBinding itemBinding;
        private List<ReportModelList> listPost ;
        private final Activity activity;

        public ReportAdapter(FragmentActivity fragmentActivity) {
            this.activity = fragmentActivity;
        }

        @NotNull
        @Override
        public ReportAdapter.ReportViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            itemBinding = ReportListTableviewBinding.inflate(getLayoutInflater(), parent, false);
            return new ReportViewHolder(itemBinding.getRoot());
        }

        @SuppressLint("SetTextI18n")
        @Override
        public void onBindViewHolder(@NonNull ReportAdapter.ReportViewHolder holder, int position) {
            itemBinding.rowId.setText(String.valueOf(listPost.get(position).getRowId()));
            itemBinding.vehicleId.setText(listPost.get(position).getVehicleId());
            itemBinding.topSpeed.setText(String.valueOf(listPost.get(position).getTopSpeed()));
            itemBinding.totalParkedTime.setText(String.valueOf(listPost.get(position).getTotalParkedTime()));
            itemBinding.totalRunningTime.setText(String.valueOf(listPost.get(position).getTotalRunningTime()));
        }

        @Override
        public int getItemCount() {
            if(this.listPost != null) {
                return this.listPost.size();
            }
            return 0;
        }

        public void setList(List<ReportModelList> reportListModels) {
            this.listPost = reportListModels;
            notifyDataSetChanged();
        }

        public class ReportViewHolder extends RecyclerView.ViewHolder {
            public ReportViewHolder(@NonNull View itemView) {
                super(itemView);
            }
        }
    }

}