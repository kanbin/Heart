package com.sesame.heart;

import android.app.Application;
import android.content.Context;

import com.kb.heart.R;
import com.sesame.heart.client.ClientAPIHelper;

/**
 * Created by Administrator on 2016/10/31.
 */
public class MainApplication extends Application {

    public static String APP_NAME ;
    public static boolean isDebug;
    public static Context sContext;
    private static MainApplication instance;
    private Object thing;

    @Override
    public void onCreate() {
        super.onCreate();
        APP_NAME = getResources().getString(R.string.app_name);
        sContext = getApplicationContext();

        ClientAPIHelper.getInstance().setApplicationContext(this);
        initUtils();
    }

    private void initUtils() {
        isDebug = true;
    }

    public static Context getContext() {
        return sContext;
    }

    public static MainApplication getInstance() {
        return instance;
    }

    public Object getThing() {
        return thing;
    }

    public void setThing(Object thing) {
        this.thing = thing;
    }
}
