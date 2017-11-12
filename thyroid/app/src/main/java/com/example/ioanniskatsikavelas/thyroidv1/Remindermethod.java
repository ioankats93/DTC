package com.example.ioanniskatsikavelas.thyroidv1;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.provider.CalendarContract;
import android.view.View;

import java.util.Calendar;

public class Remindermethod extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remindermethod);
    }

    public void onAddEventClicked(View view) {

        switch (view.getId()) {
            case R.id.addPillsButton:

                Intent intent = new Intent(Intent.ACTION_INSERT);
                intent.setType("vnd.android.cursor.item/event");

                Calendar cal = Calendar.getInstance();
                long startTime = cal.getTimeInMillis();
                long endTime = cal.getTimeInMillis() + 60 * 60 * 1000;

                intent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, startTime);
                intent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endTime);
                intent.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, false);

                intent.putExtra(CalendarContract.Events.TITLE, "Dont forget your pills please ");
                intent.putExtra(CalendarContract.Events.DESCRIPTION, "Pills reminder");
                intent.putExtra(CalendarContract.Events.EVENT_LOCATION, "My House");


                startActivity(intent);
                break;


            case R.id.addAppointButton:

                Intent intent1 = new Intent(Intent.ACTION_INSERT);
                intent1.setType("vnd.android.cursor.item/event");

                Calendar cale = Calendar.getInstance();
                long startTime1 = cale.getTimeInMillis();
                long endTime1 = cale.getTimeInMillis() + 60 * 60 * 1000;

                intent1.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, startTime1);
                intent1.putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endTime1);
                intent1.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, false);

                intent1.putExtra(CalendarContract.Events.TITLE, "You have an Appointment With Your Doctor");
                intent1.putExtra(CalendarContract.Events.DESCRIPTION, "Appointment reminder");
                intent1.putExtra(CalendarContract.Events.EVENT_LOCATION, "Hospital");



                startActivity(intent1);
                break;


        }
    }
}

