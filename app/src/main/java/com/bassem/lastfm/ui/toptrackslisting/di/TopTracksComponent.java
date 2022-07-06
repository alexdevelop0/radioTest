package com.bassem.lastfm.ui.toptrackslisting.di;

import com.bassem.lastfm.ui.toptrackslisting.TopTracksFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {TopTracksModule.class})
public interface TopTracksComponent {
    void inject(TopTracksFragment target);
}
