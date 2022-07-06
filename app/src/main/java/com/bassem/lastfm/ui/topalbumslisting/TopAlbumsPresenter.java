package com.bassem.lastfm.ui.topalbumslisting;


public interface TopAlbumsPresenter {
    void onDestroy();
    void getTopAlbums(String userName,int limit,String apiKey);
}
