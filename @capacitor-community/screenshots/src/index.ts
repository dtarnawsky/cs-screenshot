import { registerPlugin } from '@capacitor/core';

import type { ScreenshotsPlugin } from './definitions';

const Screenshots = registerPlugin<ScreenshotsPlugin>('Screenshots', {});

export * from './definitions';
export { Screenshots };
