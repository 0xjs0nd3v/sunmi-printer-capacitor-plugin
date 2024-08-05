import { SunmiPrinterPlugin } from 'sunmi-printer-capacitor-plugin';

window.testEcho = () => {
    const inputValue = document.getElementById("echoInput").value;
    SunmiPrinterPlugin.echo({ value: inputValue })
}
