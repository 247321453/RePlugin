package com.qihoo360.replugin.sample.demo1.fragment;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qihoo360.replugin.RePlugin;
import com.qihoo360.replugin.sample.demo1.R;

public class MyDialogFragment extends DialogFragment {
    public MyDialogFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LayoutInflater pluginInflater = LayoutInflater.from(RePlugin.getPluginContext());
        return pluginInflater.inflate(R.layout.main_fragment2, container, false);
    }
}
