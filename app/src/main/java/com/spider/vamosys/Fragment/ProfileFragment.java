package com.spider.vamosys.Fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.spider.vamosys.Helper.BaseActivity;
import com.spider.vamosys.Model.ProfileListModel;
import com.spider.vamosys.ViewModel.CommonViewModel;
import com.spider.vamosys.databinding.FragmentProfileBinding;
import com.spider.vamosys.databinding.ItemPostBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ProfileFragment extends Fragment {

    FragmentProfileBinding profileBinding;
    CommonViewModel postViewModel;
    PostAdapter adapter;
    BaseActivity baseActivity;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        profileBinding = FragmentProfileBinding.inflate(inflater, container, false);
        adapter = new PostAdapter(getActivity());
        profileBinding.toolbar.setTitle("PROFILE");
        profileBinding.recyclerPost.setLayoutManager(new GridLayoutManager(getContext(), 2));
        profileBinding.recyclerPost.setAdapter(adapter);
        postViewModel = ViewModelProviders.of(this).get(CommonViewModel.class);
        postViewModel.getProfileList().observe(getViewLifecycleOwner(), adapter::setList);
        postViewModel.getProfile();
        baseActivity = new BaseActivity(profileBinding.userViewCount);
        return profileBinding.getRoot();
    }


    public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

        ItemPostBinding itemBinding;
        private List<ProfileListModel> listPost = new ArrayList<>();
        private final Activity activity;

        public PostAdapter(Activity activity) {
            this.activity = activity;
        }

        @NonNull
        @Override
        public PostAdapter.PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            itemBinding = ItemPostBinding.inflate(getLayoutInflater(), parent, false);
            return new PostViewHolder(itemBinding.getRoot());
        }

        @SuppressLint("SetTextI18n")
        @Override
        public void onBindViewHolder(@NonNull PostAdapter.PostViewHolder holder, int position) {
            itemBinding.fristName.setText(listPost.get(position).getFirstName());
            itemBinding.lastName.setText(listPost.get(position).getLastName());
            itemBinding.email.setText(listPost.get(position).getEmail());
            Picasso.with(activity)
                    .load(listPost.get(position).getAvatar())
                    .fit()
                    .centerCrop()
                    .into(itemBinding.imageViewUpload);
            itemBinding.card.setOnClickListener(view -> Toast.makeText(activity, listPost.get(position).getId() + " is profile ID", Toast.LENGTH_SHORT).show());
        }

        @Override
        public int getItemCount() {
            return listPost.size();
        }

        public void setList(List<ProfileListModel> listPost) {
            this.listPost = listPost;
            notifyDataSetChanged();
        }

        public class PostViewHolder extends RecyclerView.ViewHolder {
            public PostViewHolder(@NonNull View itemView) {
                super(itemView);
            }
        }
    }
}