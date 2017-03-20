package com.progiants.bhamashahskilldevelopment.rest.services;

import com.progiants.bhamashahskilldevelopment.models.HeadOfFamilyResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Vishwajeet (vjs3)
 * on 21/3/17.
 */

public interface EducationalBackgroundService {
    @GET("hofAndMember/ForApp/{bhamashah_id}")
    Call<HeadOfFamilyResponse> getHofDetails(@Path("bhamashah_id") String bhamashahId, @Query("client_id") String clientId);
}

