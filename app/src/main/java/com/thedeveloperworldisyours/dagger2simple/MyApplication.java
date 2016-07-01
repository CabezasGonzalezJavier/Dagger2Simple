package com.thedeveloperworldisyours.dagger2simple;

import android.app.Application;

/**
 * Created by javierg on 28/06/16.
 */
public class MyApplication extends Application {
    DiComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerDiComponent.builder().build();
    }

    public DiComponent getComponent() {
        return component;
    }
}
