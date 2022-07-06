package com.bassem.lastfm.ui.topartistslisting;

import com.bassem.lastfm.models.TopArtistsResponse;

import io.reactivex.Single;



public interface TopArtistsInteractor {
    Single<TopArtistsResponse> getTopArtists(String userName, int limit, String apiKey);
}
