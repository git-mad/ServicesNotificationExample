package edu.gatech.gtorg.gitmad.servicesnotificationexample;

import android.app.IntentService;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.Context;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.support.v4.app.NotificationCompat;

import java.util.concurrent.atomic.AtomicInteger;

public class NotificationService extends IntentService {

    private static final AtomicInteger atomicInteger = new AtomicInteger(0);
    public static int getNotificationID() {
        return atomicInteger.incrementAndGet();
    }

    public NotificationService() {
        super("NotificationService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /*
         * TODO 1: Create an intent that takes us from this service to the screen that displays the
         * Notification Result
         */


        /*
         * TODO 2: Create a PendingIntent that wraps the Intent from #1. Use the flags for updating
         * current PendingIntents and only using a PendingIntent once. For more information, see:
         *
         * https://developer.android.com/reference/android/app/PendingIntent.html
         */


        /*
         * TODO 3: Use the NotificationCompat Builder to build the notification. Be sure to set the
         * icon, content title, content text, and content intent (pending intent). You can also set
         * the sound, vibration, notification light color, and auto-cancel, but these technically
         * aren't needed to make the notification work.
         */


        /*
         * TODO 4: Set up the NotificationManager and use it to notify the system of the
         * notification. There is a method in this class that can help with the notification ID.
         */


    }
}
