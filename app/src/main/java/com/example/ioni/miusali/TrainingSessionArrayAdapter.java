package com.example.ioni.miusali;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

public class TrainingSessionArrayAdapter extends ArrayAdapter<TrainingSession> {
    private List<TrainingSession> sessions;
    private int layoutResourceId;
    private Context context;

    public TrainingSessionArrayAdapter(Context context, int layoutResourceId, List<TrainingSession> sessions) {
        super(context, layoutResourceId, sessions);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.sessions = sessions;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        SessionHolder holder = null;

        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        row = inflater.inflate(layoutResourceId, parent, false);

        holder = new SessionHolder();
        holder.Session = sessions.get(position);

        holder.date = row.findViewById(R.id.txt_session_date);
        holder.time = row.findViewById(R.id.txt_session_time);
        row.setTag(holder);
        setupItem(holder);

        return row;
    }

    private void setupItem(SessionHolder holder) {
        holder.date.setText(holder.Session.getDate());
        holder.time.setText(String.valueOf(holder.Session.getTime()));
    }

    public static class SessionHolder {
        TrainingSession Session;
        TextView date;
        TextView time;
    }
}
