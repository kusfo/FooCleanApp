package com.jordimontornes.FooCleanCodeApp.view.injection;

import com.jordimontornes.FooCleanCodeApp.view.ui.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class PresenterModule {

    @Provides
    MainActivityPresenter providesMainActivityPresenter() {
        return new MainActivityPresenter();
    }
}
