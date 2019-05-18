package com.example.vrushabh.toggle_button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Switch aSwitch = (Switch) findViewById(R.id.Switch);
        ToggleButton toggle = (ToggleButton) findViewById(R.id.ToggleButton);


        // Set a checked change listener for toggle Switch
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    // Make a toast to display toggle button status
                    Toast.makeText(getApplicationContext(), "Toggle Switch is on", Toast.LENGTH_SHORT).show();
                }
                else{
                    // Make a toast to display toggle button status
                    Toast.makeText(getApplicationContext(), "Toggle Switch is off", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Set a checked change listener for toggle button
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    // Make a toast to display toggle button status
                    Toast.makeText(getApplicationContext(),
                            "Toggle Button is on", Toast.LENGTH_SHORT).show();
                }
                else{
                    // Make a toast to display toggle button status
                    Toast.makeText(getApplicationContext(),
                            "Toggle Button is off", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}