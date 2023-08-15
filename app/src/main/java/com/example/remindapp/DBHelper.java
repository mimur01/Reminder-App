package com.example.remindapp;


import android.content.Context;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DBHelper {

    private static DatabaseReference databaseReference;

    public static DatabaseReference getDatabaseReference(Context context){
        if (databaseReference == null) {
            // Initialize Firebase and set up database reference
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setDatabaseUrl("https://www.googleapis.com/robot/v1/metadata/x509/firebase-adminsdk-9o2tc%40remindapp-b21fb.iam.gserviceaccount.com")
                    .setStorageBucket("\\Users\\mmurphy\\OneDrive - Prophet, Inc\\Desktop\\Work\\Personal\\Study\\AS Project")
                    .build();
            //TODO look here the first param not sure what should go here?
            FirebaseApp.initializeApp(context,options);
            databaseReference = FirebaseDatabase.getInstance().getReference("reminders");
        }
        return databaseReference;
    }
}
