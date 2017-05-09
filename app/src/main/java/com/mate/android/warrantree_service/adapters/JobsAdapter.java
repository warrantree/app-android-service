package com.mate.android.warrantree_service.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.mate.android.warrantree_service.R;

import java.util.ArrayList;

/**
 * Created by anujgupta on 23/04/17.
 */

public class JobsAdapter extends RecyclerView.Adapter<JobsAdapter.Jobs>{


    ArrayList<String> bill = new ArrayList<>();
    Context context;

    public JobsAdapter(ArrayList<String> bill, Context context) {
        this.bill = bill;
        this.context = context;
    }

    @Override
    public Jobs onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.card_jobs,parent,false);
        Jobs j = new Jobs(v);
        return j;
    }

    @Override
    public void onBindViewHolder(Jobs holder, int position) {

        holder.ivBillImage.setImageResource(R.drawable.bill);
    }

    @Override
    public int getItemCount() {
        return bill.size();
    }

    public class Jobs extends RecyclerView.ViewHolder{

        ImageView ivBillImage;
        TextView tvBillId;
        TextView tvProductName;
        TextView tvComplaint;
        View vStatus;

        public Jobs(View v) {
            super(v);

            ivBillImage = (ImageView) v.findViewById(R.id.ivBillImage);
            tvBillId = (TextView) v.findViewById(R.id.tvBillId);
            tvProductName = (TextView) v.findViewById(R.id.tvProductName);
            tvComplaint = (TextView) v.findViewById(R.id.tvCustomerNumber);
            vStatus = (View) v.findViewById(R.id.vStatus);

        }
    }
}
