package edu.gatech.gtorg.gitmad.servicesnotificationexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                 * TODO 5: Create an intent that points to the NotificationService class and use
                 * that intent to start the service. We call finish() to force the app to close,
                 * meaning that the only way back into the app is to start it from the app drawer or
                 * through your handy dandy notification!
                 */
                
                finish();
            }
        });
    }
}
