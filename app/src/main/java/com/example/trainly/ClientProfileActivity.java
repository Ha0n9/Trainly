package com.example.trainly;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ClientProfileActivity extends AppCompatActivity {
    String userName;
    String userRole = "Trainee";
    int userID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_client_profile);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button trackMeals = findViewById(R.id.btnTrackMeal);
        Button logWorkout = findViewById(R.id.btnLogWorkout);
        Button viewWorkout = findViewById(R.id.btnViewWorkOut);
        Button progress = findViewById(R.id.btnProgress);
        Button editprofile = findViewById(R.id.btnEditProfile);

        trackMeals.setOnClickListener(v->{
            startActivity(new Intent(ClientProfileActivity.this, TrackMealsActivity.class));
        });

        logWorkout.setOnClickListener(v->{
            startActivity(new Intent(ClientProfileActivity.this, ClientWorkoutsActivity.class));
        });

        viewWorkout.setOnClickListener(v->{
            startActivity(new Intent(ClientProfileActivity.this, ClientWorkoutsActivity.class));

        });

        progress.setOnClickListener(v->{
            startActivity(new Intent(ClientProfileActivity.this, ClientProgressActivity.class));
        });

        editprofile.setOnClickListener(v->{
            startActivity(new Intent(ClientProfileActivity.this, EditClientProfileActivity.class));
        });
    }

}