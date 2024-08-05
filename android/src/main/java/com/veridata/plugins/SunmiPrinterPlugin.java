package com.veridata.plugins;

import com.veridata.plugins.helpers.utils.BluetoothUtil;
import com.veridata.plugins.helpers.utils.ESCUtil;
import com.veridata.plugins.helpers.utils.SunmiPrintHelper;
import com.veridata.plugins.internals.SunmiPrinterBarcodePrinting;
import com.veridata.plugins.internals.SunmiPrinterCashDrawerRelated;
import com.veridata.plugins.internals.SunmiPrinterChangePrintMode;
import com.veridata.plugins.internals.SunmiPrinterCustomerDisplay;
import com.veridata.plugins.internals.SunmiPrinterCuttingRelated;
import com.veridata.plugins.internals.SunmiPrinterEscPosCommands;
import com.veridata.plugins.internals.SunmiPrinterGetDeviceAndPrinterInformation;
import com.veridata.plugins.internals.SunmiPrinterGetGlobalAttributes;
import com.veridata.plugins.internals.SunmiPrinterImagePrinting;
import com.veridata.plugins.internals.SunmiPrinterInitializationAndSettings;
import com.veridata.plugins.internals.SunmiPrinterInstructionForPrinterStyleSetting;
import com.veridata.plugins.internals.SunmiPrinterLabelPrintingInstructions;
import com.veridata.plugins.internals.SunmiPrinterPaperMovingRelated;
import com.veridata.plugins.internals.SunmiPrinterTablePrinting;
import com.veridata.plugins.internals.SunmiPrinterTextPrinting;
import com.veridata.plugins.internals.SunmiPrinterTransactionPrinting;

public class SunmiPrinterPlugin {
    public final SunmiPrintServiceConnector connector = new SunmiPrintServiceConnector();
    public final SunmiCallbackHelper callbackHelper = new SunmiCallbackHelper();

    // 1.2.1 Printer initialization and setting
    public final SunmiPrinterInitializationAndSettings initializationAndSettings = new SunmiPrinterInitializationAndSettings(connector, callbackHelper);

    // 1.2.2 Get device and printer information
    public final SunmiPrinterGetDeviceAndPrinterInformation getDeviceAndPrinterInformation = new SunmiPrinterGetDeviceAndPrinterInformation(connector, callbackHelper);

    // 1.2.3 ESC/POS commands
    public final SunmiPrinterEscPosCommands escPosCommands = new SunmiPrinterEscPosCommands(connector, callbackHelper);

    // 1.2.4 Instruction for printer style setting interface
    public final SunmiPrinterInstructionForPrinterStyleSetting instructionForPrinterStyleSetting = new SunmiPrinterInstructionForPrinterStyleSetting(connector, callbackHelper);

    // 1.2.5 Change print mode
    public final SunmiPrinterChangePrintMode changePrintMode = new SunmiPrinterChangePrintMode(connector, callbackHelper);

    // 1.2.6 Text printing
    public final SunmiPrinterTextPrinting textPrinting = new SunmiPrinterTextPrinting(connector, callbackHelper, escPosCommands);

    // 1.2.7 Print a table
    public final SunmiPrinterTablePrinting tablePrinting = new SunmiPrinterTablePrinting(connector, callbackHelper);

    // 1.2.8 Print an image
    public final SunmiPrinterImagePrinting imagePrinting = new SunmiPrinterImagePrinting(connector, callbackHelper);

    // 1.2.9 Print a 1D/2D barcode
    public final SunmiPrinterBarcodePrinting barcodePrinting = new SunmiPrinterBarcodePrinting(connector, callbackHelper);

    // 1.2.10 Transaction printing
    public final SunmiPrinterTransactionPrinting transactionPrinting = new SunmiPrinterTransactionPrinting(connector, callbackHelper);

    // 1.2.11 Paper moving related
    public final SunmiPrinterPaperMovingRelated paperMovingRelated = new SunmiPrinterPaperMovingRelated(connector, callbackHelper);

    // 1.2.12 Cutter (paper cutting) related
    public final SunmiPrinterCuttingRelated cuttingRelated = new SunmiPrinterCuttingRelated(connector, callbackHelper);

    // 1.2.13 Cash drawer related
    public final SunmiPrinterCashDrawerRelated cashDrawerRelated = new SunmiPrinterCashDrawerRelated(connector, callbackHelper);

    // 1.2.14 Get global attributes
    public final SunmiPrinterGetGlobalAttributes getGlobalAttributes = new SunmiPrinterGetGlobalAttributes(connector, callbackHelper);

    // 1.2.15 Customer display interface description
    public final SunmiPrinterCustomerDisplay customerDisplay = new SunmiPrinterCustomerDisplay(connector, callbackHelper);

    // 1.2.16 Label printing instructions
    public final SunmiPrinterLabelPrintingInstructions labelPrintingInstructions = new SunmiPrinterLabelPrintingInstructions(connector, callbackHelper);

    public void initPrinter() {
        if(BluetoothUtil.isBlueToothPrinter){
            BluetoothUtil.sendData(ESCUtil.init_printer());
        }else{
            SunmiPrintHelper.getInstance().initPrinter();
        }
    }
}