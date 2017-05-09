package com.mate.android.warrantree_service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.mate.android.warrantree_service.adapters.JobsAdapter;
import com.mate.android.warrantree_service.helpers.RecyclerItemClickListener;

import java.util.ArrayList;
import java.util.Arrays;

public class JobsActivity extends AppCompatActivity {

    RecyclerView rv;
    RecyclerView.Adapter adapter;
    LinearLayoutManager llm;
    ArrayList<String> bills = new ArrayList<>(Arrays.asList("bill1","bill1","bill1","bill1"));
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        rv = (RecyclerView) findViewById(R.id.rvPastOrders);
        llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        adapter = new JobsAdapter(bills,this);
        rv.setAdapter(adapter);
        rv.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

                startActivity(new Intent(JobsActivity.this,RequestDetailsActivity.class));

            }
        }));

    }
}
