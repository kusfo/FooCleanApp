package com.jordimontornes.FooCleanCodeApp.Aplication.injection;

import android.app.Application;

import com.jordimontornes.FooCleanCodeApp.data.injection.DaggerRestDataProviderComponent;
import com.jordimontornes.FooCleanCodeApp.data.injection.RestDataProviderComponent;
import com.jordimontornes.FooCleanCodeApp.data.injection.RestDataProviderModule;
import com.jordimontornes.FooCleanCodeApp.view.injection.DaggerPresenterComponent;
import com.jordimontornes.FooCleanCodeApp.view.injection.PresenterComponent;
import com.jordimontornes.FooCleanCodeApp.view.injection.PresenterModule;
import com.jordimontornes.FooCleanCodeApp.data.injection.DaggerRestClientComponent;
import com.jordimontornes.FooCleanCodeApp.data.injection.RestClientComponent;
import com.jordimontornes.FooCleanCodeApp.data.injection.RestClientModule;

public class FooCleanCodeApplication extends Application {

    private PresenterComponent presenterComponent;
    private RestClientComponent restClientComponent;
    private RestDataProviderComponent restDataProviderComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        presenterComponent = DaggerPresenterComponent.builder()
                .presenterModule(new PresenterModule())
                .build();
        restClientComponent = DaggerRestClientComponent.builder()
                .restClientModule(new RestClientModule())
                .build();
        restDataProviderComponent = DaggerRestDataProviderComponent.builder()
                .restDataProviderModule(new RestDataProviderModule())
                .restClientModule(new RestClientModule())
                .build();

    }

    public PresenterComponent getPresenterComponent() {
        return presenterComponent;
    }

    public RestClientComponent getRestClientComponent() {
        return restClientComponent;
    }

    public RestDataProviderComponent getRestDataProviderComponent() {
        return restDataProviderComponent;
    }
}
