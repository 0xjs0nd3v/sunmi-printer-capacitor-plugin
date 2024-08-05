export interface SunmiPrinterPluginPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
