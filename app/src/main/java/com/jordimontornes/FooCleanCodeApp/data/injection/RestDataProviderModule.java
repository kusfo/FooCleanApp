package com.jordimontornes.FooCleanCodeApp.data.injection;

import com.jordimontornes.FooCleanCodeApp.data.provider.ApiRestDataProvider;
import com.jordimontornes.FooCleanCodeApp.data.rest.ApiRestClient;
import com.jordimontornes.FooCleanCodeApp.Aplication.injection.FooCleanCodeApplication;

import dagger.Module;
import dagger.Provides;

@Module
public class RestDataProviderModule {

    @Provides
    ApiRestDataProvider provideRestDataProvider(ApiRestClient apiRestClient) {
        return new ApiRestDataProvider(apiRestClient);
    }
}
