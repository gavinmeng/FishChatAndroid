package com.yuchuan.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import yuchuan.com.fishchat.R;

/**
 * Created by haroldmiao on 2015/2/15.
 */
public class MeMainTabFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.tab04, container, false);
    }

}