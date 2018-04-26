package com.example.ioni.miusali;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ScrollView;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TrainingSessionArrayAdapter adapter = new TrainingSessionArrayAdapter(MainActivity.this, R.layout.list_item_training_session, sessions());
        ListView sessionsListView = (ListView) findViewById(R.id.session_list_view);
        sessionsListView.setAdapter(adapter);

        Button addSessionButton = findViewById(R.id.add_session_button);
        addSessionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToAddSession();
            }
        });
    }

    private List<TrainingSession> sessions(){
        int hInMillis = (int)(1000 * 3600);
        Date date1 = new Date();
        Date date2 = new Date(date1.getTime() - hInMillis);
        Date date3 = new Date(date1.getTime() - hInMillis*24);


        TrainingSession session1 = new TrainingSession(date1);
        TrainingSession session2 = new TrainingSession(date2);
        TrainingSession session3 = new TrainingSession(date3);
        List<TrainingSession> sessions = new ArrayList<TrainingSession>();

        sessions.add(session1);
        sessions.add(session2);
        sessions.add(session3);
        return sessions;
    }

    private void moveToAddSession(){
        Intent addSessionIntent = new Intent(this, AddTrainingSessionActivity.class);
        this.startActivity(addSessionIntent);
    }
}
