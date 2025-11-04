package com.example.trainly;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Date;

public class TrackMealsActivity extends AppCompatActivity {
    int mealId;
    String mealName;
    int calories;
    String protein;
    String carbs;
    String fat;
    Date mealDate;
    int dailyTotalCalories;
    ArrayList<String> todayMeals;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_track_meals);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button showCaloriesCount = findViewById(R.id.btnShowCalorieCount);
        Button backToMain = findViewById(R.id.btnBackToMain);
        TextView result = findViewById(R.id.resultTxt);

        showCaloriesCount.setOnClickListener(v->{
            String resultStr = "Meal Name: " + mealName + "\n" + "Calories: " + calories + "gm" + "\n"+
                    "Protein: " + protein + "\n" + "Carbs: " + carbs + "\n" + "Fat: " + fat + "\n" +
                    "Meal Date: " + mealDate;
            result.setText(resultStr);
        });

        backToMain.setOnClickListener(v->{
            startActivity(new Intent(TrackMealsActivity.this, ClientProfileActivity.class));
        });

    }
}