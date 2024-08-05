package com.veridata.plugins;

import android.util.Log;

public class SunmiPrinterPlugin {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }
}
