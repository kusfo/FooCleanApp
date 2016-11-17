package com.jordimontornes.FooCleanCodeApp.view.injection;

import com.jordimontornes.FooCleanCodeApp.view.ui.MainActivity;

import dagger.Component;

@Component(modules = {PresenterModule.class})
public interface PresenterComponent {
    void inject(MainActivity activity);
}
