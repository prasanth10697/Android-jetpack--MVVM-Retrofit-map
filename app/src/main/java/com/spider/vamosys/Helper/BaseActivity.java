package com.spider.vamosys.Helper;

import com.spider.vamosys.databinding.ProfileCountBinding;

public class BaseActivity {

    public BaseActivity(ProfileCountBinding userViewCount) {
        userViewCount.viewCount.setText(SharedHelper.getKey(userViewCount.getRoot().getContext(), "USER_COUNT"));
    }
}
