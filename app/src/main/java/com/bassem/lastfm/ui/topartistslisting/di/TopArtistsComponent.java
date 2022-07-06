package com.bassem.lastfm.ui.topartistslisting.di;

import com.bassem.lastfm.models.TopArtists;
import com.bassem.lastfm.ui.topartistslisting.TopArtistsFragment;

import javax.inject.Singleton;

import dagger.Component;



@Singleton
@Component(modules = {TopArtistsModule.class})
public interface TopArtistsComponent {
    void inject(TopArtistsFragment target);
}
