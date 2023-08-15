package com.example.remindapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class reminderView extends RecyclerView.Adapter<reminderView.ReminderViewer>{

    Context context;
    //TODO pull info from DB here and store into variables to act on

    @NonNull
    @Override
    public ReminderViewer onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ReminderViewer holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ReminderViewer extends RecyclerView.ViewHolder{

        TextView titleOutput;
        TextView descOutput;
        TextView dateOutput;

        public ReminderViewer(@NonNull View itemView) {
            super(itemView);
            titleOutput = itemView.findViewById(R.id.titleoutput);
            descOutput = itemView.findViewById(R.id.descoutput);
            dateOutput = itemView.findViewById(R.id.dateoutput);
        }
    }

}
