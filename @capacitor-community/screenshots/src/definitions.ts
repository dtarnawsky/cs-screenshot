export interface ScreenshotsPlugin {
  /**
   * Disable screenshots
   * @since 4.0.0
   */
  disableScreenshots(): Promise<void>;

  /**
   * Enable screenshots
   * @since 4.0.0
   */
  enableScreenshots(): Promise<void>;
}
