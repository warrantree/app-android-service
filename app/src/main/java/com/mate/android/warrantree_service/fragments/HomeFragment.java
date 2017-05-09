package com.mate.android.warrantree_service.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mate.android.warrantree_service.JobsActivity;
import com.mate.android.warrantree_service.R;


/**
 * Created by anujgupta on 23/04/17.
 */

public class HomeFragment extends Fragment {

    CardView cv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home,container,false);

        cv = (CardView) v.findViewById(R.id.cvJobs);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), JobsActivity.class));
            }
        });

        return v;
    }


}
