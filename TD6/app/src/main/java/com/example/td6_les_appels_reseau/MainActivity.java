package com.example.td6_les_appels_reseau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        TextView Affichage = (TextView) findViewById(R.id.TextAffiche);

        com.example.td6_les_appels_reseau.GithubService service = new Retrofit.Builder()
                .baseUrl(com.example.td6_les_appels_reseau.GithubService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(com.example.td6_les_appels_reseau.GithubService.class);

        Call<List<Repo>> repos = service.listRepos("adrienbusin");

        repos.enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                List<Repo> allRepo = response.body();
                StringBuilder str = new StringBuilder();
                for(Repo element : allRepo) {
                    str.append(element.getId()).append(" ").append(element.getName()).append("\n");
                }
                Affichage.setText(str.toString());
            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {
                Toast.makeText(context,"ERREUR", Toast.LENGTH_SHORT).show();
            }

        });



    }

}