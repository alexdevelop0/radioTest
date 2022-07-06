package com.bassem.lastfm.ui.toptrackslisting;

import com.bassem.lastfm.models.TopTracksResponse;

import io.reactivex.Single;



public interface TopTracksInteractor {
    Single<TopTracksResponse> getTopTracks(String userName, int limit, String apiKey);

}
