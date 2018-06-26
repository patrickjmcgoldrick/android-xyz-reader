package com.example.xyzreader.ui;

import android.app.Activity;
import android.graphics.Point;
import android.view.Display;

public class Utils {
    public static float getScreenHeight(Activity activity) {
        Display display = activity.getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        return size.y;
    }
}
