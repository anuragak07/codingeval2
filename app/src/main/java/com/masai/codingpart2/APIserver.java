package com.masai.codingpart2;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface APIserver {

    @GET("/api/users/{userID}")
    Call<ResponseModel> getUser(@Path("userID") int userId);
}
