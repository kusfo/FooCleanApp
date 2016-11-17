package com.jordimontornes.FooCleanCodeApp.Aplication.injection;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    FooCleanCodeApplication mApplication;

    public AppModule(FooCleanCodeApplication application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    FooCleanCodeApplication providesApplication() {
        return mApplication;
    }
}
