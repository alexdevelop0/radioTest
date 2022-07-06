package com.bassem.lastfm.ui.topalbumslisting.di;

import com.bassem.lastfm.models.TopAlbums;
import com.bassem.lastfm.ui.topalbumslisting.TopAlbumsFragment;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;

@Singleton
@Component(modules = {TopAlbumsModule.class})
public interface TopAlbumsComponent {
    void inject(TopAlbumsFragment target);
}
