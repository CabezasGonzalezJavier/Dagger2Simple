package com.thedeveloperworldisyours.dagger2simple;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by javierg on 28/06/16.
 */
@Module
public class NetworkApiModule {
    @Provides
    @Singleton
    public NetworkApi getNetwork(){
        return new NetworkApi();
    }
}
