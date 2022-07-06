package com.bassem.lastfm.ui.topartistslisting;

import com.bassem.lastfm.models.Artist;

import java.util.List;

public interface TopArtistsView {
    void showProgress();

    void hideProgress();

    void updateData(List<Artist> topArtists);

    void showError();
    void showEmpty();
    void hidEmpty();

}
