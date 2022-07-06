package com.bassem.lastfm.ui.topartistslisting;


public interface TopArtistsPresenter {
    void onDestroy();

    void getUserTopArtists(String userName, int limit, String apiKey);
}
