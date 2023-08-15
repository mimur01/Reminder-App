package com.example.remindapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.firebase.database.DatabaseReference;

public class AddReminderActivity extends AppCompatActivity {
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_reminder);

        EditText titleInput = findViewById(R.id.addremtitleinput);
        EditText descriptionInput = findViewById(R.id.addremdescinput);
        EditText dateInput = findViewById(R.id.addremdateinput);
        MaterialButton saveBtn = findViewById(R.id.saverembtn);

        databaseReference = DBHelper.getDatabaseReference(this  );

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = titleInput.getText().toString();
                String description = descriptionInput.getText().toString();
                String date = dateInput.getText().toString();

                Reminders newReminder = new Reminders();
                newReminder.setTitle(title);
                newReminder.setDescription(description);
                newReminder.setDate(date);
//TODO: this is where I left off when it comes to pushing a reminder to the db using Dbhelper but tbd if works
                String reminderKey = databaseReference.push().getKey();
                databaseReference.child(reminderKey).setValue(newReminder);

                Toast.makeText(AddReminderActivity.this, "Reminder Saved", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}