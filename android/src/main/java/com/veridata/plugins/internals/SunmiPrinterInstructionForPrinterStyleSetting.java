package com.veridata.plugins.internals;

import android.os.RemoteException;

import com.sunmi.peripheral.printer.SunmiPrinterService;

import com.veridata.plugins.SunmiCallbackHelper;
import com.veridata.plugins.SunmiPrintServiceConnector;

public class SunmiPrinterInstructionForPrinterStyleSetting {
    private final SunmiPrintServiceConnector connector;
    private final SunmiCallbackHelper callbackHelper;

    public SunmiPrinterInstructionForPrinterStyleSetting(SunmiPrintServiceConnector connector, SunmiCallbackHelper callbackHelper) {
        this.connector = connector;
        this.callbackHelper = callbackHelper;
    }

    public void setPrinterStyle(int key, int value) throws RuntimeException {
        SunmiPrinterService service = connector.getService();
        if(service == null) {
            throw new RuntimeException("Printer service is not initialized");
        }

        try {
            service.setPrinterStyle(key, value);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
