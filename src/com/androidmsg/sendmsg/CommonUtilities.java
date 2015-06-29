package com.androidmsg.sendmsg;

import android.content.Context;
import android.content.Intent;

public final class CommonUtilities {
	

    static final String SERVER_URL = "http://127.0.0.1/gcm_server_php/register.php"; 

    // Google project id
    static final String SENDER_ID = "553064578719"; 

    
    static final String TAG = "AndroidMsg GCM";

    static final String DISPLAY_MESSAGE_ACTION =
            "com.androidhive.pushnotifications.DISPLAY_MESSAGE";

    static final String EXTRA_MESSAGE = "message";

    //Notifies UI to display a message.
     
    static void displayMessage(Context context, String message) {
        Intent intent = new Intent(DISPLAY_MESSAGE_ACTION);
        intent.putExtra(EXTRA_MESSAGE, message);
        context.sendBroadcast(intent);
    }
}
