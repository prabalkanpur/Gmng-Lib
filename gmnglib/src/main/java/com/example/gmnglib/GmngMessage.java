package com.example.gmnglib;

import android.content.Context;
import android.widget.Toast;

public class GmngMessage {

    public static void showMessage(Context context, String msg)
    {
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }
}
