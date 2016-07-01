package com.thedeveloperworldisyours.dagger2simple;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by javierg on 28/06/16.
 */
@Singleton
@Component(modules = {NetworkApiModule.class})

public interface DiComponent {
    // to update the fields in your activities
    void inject(MainActivity activity);
}

