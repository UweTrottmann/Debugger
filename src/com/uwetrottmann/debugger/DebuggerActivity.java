
package com.uwetrottmann.debugger;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;

public class DebuggerActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        TextView timezone = (TextView) findViewById(R.id.timezone);
        Calendar cal = Calendar.getInstance();
        timezone.setText(cal.getTimeZone().getID());

        TextView androidVersion = (TextView) findViewById(R.id.androidversion);
        androidVersion.setText(String.valueOf(Build.VERSION.SDK_INT));
    }
}
