package com.example.user.datepicker;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button displayDateButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayDateButton =findViewById(R.id.showDateButtonID);
        displayDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        Toast.makeText(MainActivity.this, dayOfMonth+"/"+(month+1)+"/"+year, Toast.LENGTH_SHORT).show();
                    }
                }, 2018, 3, 10);
               // Toast.makeText(MainActivity.this, "Date Picker", Toast.LENGTH_SHORT).show();
                datePickerDialog.show();
            }

        });
    }
}
