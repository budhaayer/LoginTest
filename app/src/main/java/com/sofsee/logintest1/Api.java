package com.sofsee.logintest1;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Api {

    @POST("auth/login")
    Call<LoginResponse> getLogin(@Body LoginRequest loginRequest);

}
