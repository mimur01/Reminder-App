package com.example.remindapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

public class ReminderView extends FirestoreRecyclerAdapter<Reminders, ReminderView.ReminderViewer> {

    Context context;

    /**
     * Create a new RecyclerView adapter that listens to a Firestore Query.  See {@link
     * FirestoreRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public ReminderView(@NonNull FirestoreRecyclerOptions<Reminders> options) {
        super(options);
    }
    //TODO pull info from DB here and store into variables to act on

    @NonNull
    @Override
    public ReminderViewer onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.reminder_view,parent,false);
        return new ReminderViewer(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull ReminderViewer holder, int position, @NonNull Reminders model) {

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
