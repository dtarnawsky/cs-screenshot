import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(ScreenshotsPlugin)
public class ScreenshotsPlugin: CAPPlugin {

    @objc func disableScreenshots(_ call: CAPPluginCall) {
        DispatchQueue.main.async {
            self.bridge?.webView?.disableScreenshots()
        }
        call.resolve()
    }

    @objc func enableScreenshots(_ call: CAPPluginCall) {
        DispatchQueue.main.async {
            self.bridge?.webView?.enableScreenshots()
        }
        call.resolve()
    }
}
