package com.bassem.lastfm.ui.topalbumslisting;

import com.bassem.lastfm.models.TopAlbumsResponse;

import io.reactivex.Single;



public interface TopAlbumsInteractor {
    Single<TopAlbumsResponse> getTopAlbums(String userName, int limit, String apiKey);
}
