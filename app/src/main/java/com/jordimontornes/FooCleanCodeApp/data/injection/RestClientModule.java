package com.jordimontornes.FooCleanCodeApp.data.injection;

import com.jordimontornes.FooCleanCodeApp.data.rest.ApiRestClient;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RestClientModule {

    @Provides
    @Singleton
    ApiRestClient provideApiRestClient() {
        return new ApiRestClient();
    }
}
