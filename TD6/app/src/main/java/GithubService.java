package com.example.td6_les_appels_reseau;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GithubService {

    public static final String BASE_URL = "https://api.github.com";

    @GET("/users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String user);

    @GET("/search/repositories")
    List<Repo> searchRepos(@Query("q") String query);

}
