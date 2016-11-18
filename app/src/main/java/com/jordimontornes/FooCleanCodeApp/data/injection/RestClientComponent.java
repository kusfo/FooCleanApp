package com.jordimontornes.FooCleanCodeApp.data.injection;

import com.jordimontornes.FooCleanCodeApp.data.provider.DataProvider;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {RestClientModule.class})
public interface RestClientComponent {
    void inject(DataProvider dataProvider);
}
