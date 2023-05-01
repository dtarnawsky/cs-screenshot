package com.dtarnawsky.capscreenshots;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.RestrictionsManager;
import android.os.Bundle;
import android.view.WindowManager;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.view.Window;
import android.view.WindowManager;

@CapacitorPlugin(name = "Screenshots")
public class ScreenshotsPlugin extends Plugin {

    @PluginMethod
    public void disableScreenshots(PluginCall call) {
        this.getBridge()
            .executeOnMainThread(
                new Runnable() {
                    @Override
                    public void run() {
                        addFlags();
                        call.resolve();
                    }
                }
            );
    }

    @PluginMethod
    public void enableScreenshots(PluginCall call) {
        this.getBridge()
            .executeOnMainThread(
                new Runnable() {
                    @Override
                    public void run() {
                        clearFlags();
                        call.resolve();
                    }
                }
            );
    }

    private void addFlags() {
        Window window = getActivity().getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_SECURE);
    }

    private void clearFlags() {
        Window window = getActivity().getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_SECURE);
    }
}
