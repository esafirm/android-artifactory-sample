package com.esafirm.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by esafirm on 9/8/16.
 */
public class Something {

    public void call(Context context) {
        Toast.makeText(context, "This is something from library", Toast.LENGTH_SHORT).show();
    }
}
