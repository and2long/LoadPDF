package com.and2long.loadpdf;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by and2long on 16-8-22.
 */
public class Utils {

    private static Toast mToast = null;

    public static void showToast(Context context, String text) {
        if (mToast == null) {
            mToast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(text);
        }
        mToast.show();
    }
}
