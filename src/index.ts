import { registerPlugin } from '@capacitor/core';

import type { SunmiPrinterPluginPlugin } from './definitions';

const SunmiPrinterPlugin = registerPlugin<SunmiPrinterPluginPlugin>(
  'SunmiPrinterPlugin',
  {
    web: () => import('./web').then(m => new m.SunmiPrinterPluginWeb()),
  },
);

export * from './definitions';
export { SunmiPrinterPlugin };
