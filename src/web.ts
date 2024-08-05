import { WebPlugin } from '@capacitor/core';

import type { SunmiPrinterPluginPlugin } from './definitions';

export class SunmiPrinterPluginWeb
  extends WebPlugin
  implements SunmiPrinterPluginPlugin
{
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
