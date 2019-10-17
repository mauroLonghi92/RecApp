package com.example.recicladotandil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.recicladotandil.Entidades.TotalRecycleModel;
import com.example.recicladotandil.Entidades.Usuario;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SignUp extends AppCompatActivity {
    private Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        String ip = getString(R.string.ip_hosting);

        String base_url = "http://" + ip ;
        retrofit = new Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        agregarUsuario();
    }

    private void agregarUsuario() {
        ApiService service = retrofit.create(ApiService.class);
        Call<Usuario> agregarCall;
        agregarCall = service.addUser(20);

        agregarCall.enqueue(new Callback<Usuario>() {
            @Override
            public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                if (response.isSuccessful()) {

                    Usuario userRespuesta = response.body();

                } else {
                    Log.e("TAG", " onResponse: " + response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<Usuario> call, Throwable t) {
                Toast.makeText(getBaseContext(),"No se ha podido conectar", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
