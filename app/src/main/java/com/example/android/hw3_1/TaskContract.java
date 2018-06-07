package com.example.android.hw3_1;

import android.net.Uri;
import android.provider.BaseColumns;

public class TaskContract {

    public static  final String AUTHORITY = "com.example.android.HW3";

    public static final Uri BASE_CONTENT_URI = Uri.parse("content://"+AUTHORITY);

    public static final String PATH_TASKS = "tasks";


    public static final class WaitlistEntry implements BaseColumns {

        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_TASKS).build();


        public static final String TABLE_NAME = "waitlist";
        public static final String COLUMN_GUEST_NAME = "guestName";
        public static final String COLUMN_PARTY_SIZE = "partySize";
        public static final String COLUMN_TIMESTAMP = "timestamp";
        public static final String COLUMN_PHONE = "phonenumber";
    }
}
