package com.jordimontornes.FooCleanCodeApp.data.injection;

import com.jordimontornes.FooCleanCodeApp.view.ui.MainActivityPresenter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {RestDataProviderModule.class, RestClientModule.class})
public interface RestDataProviderComponent {
    void inject(MainActivityPresenter mainActivityPresenter);
}
