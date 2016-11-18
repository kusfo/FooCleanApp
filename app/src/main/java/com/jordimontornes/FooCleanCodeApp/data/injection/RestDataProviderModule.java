package com.jordimontornes.FooCleanCodeApp.data.injection;

import com.jordimontornes.FooCleanCodeApp.data.provider.DataProvider;
import com.jordimontornes.FooCleanCodeApp.data.rest.ApiRestClient;

import dagger.Module;
import dagger.Provides;

@Module
public class RestDataProviderModule {

    @Provides
    DataProvider provideRestDataProvider(ApiRestClient apiRestClient) {
        return new DataProvider(apiRestClient);
    }
}
