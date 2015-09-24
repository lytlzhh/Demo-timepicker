package com.example.llw.demo_timepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private TimePicker timePicker;
    private TextView textView;
    private Calendar calendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text);
        timePicker = (TimePicker) findViewById(R.id.time);

        calendar = Calendar.getInstance();

        textView.setText("当前时间"+calendar.get(Calendar.HOUR)+"时"+calendar.get(Calendar.MINUTE)+"分"+calendar.get(Calendar.SECOND));

        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                textView.setText(hourOfDay+"时"+minute+"分");
            }
        });
    }


}
