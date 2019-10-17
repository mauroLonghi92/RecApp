package com.example.recicladotandil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.recicladotandil.Entidades.TotalRecycleModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AgregarProducto extends AppCompatActivity {

    private Retrofit retrofit;
    EditText campo_Tons,campo_Bottles,campo_Tetrabrik,campo_Glass,campo_paper, campo_Cans;
    Button botonRegistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_producto);

        campo_Tons= findViewById(R.id.campoTons);
        campo_Tetrabrik= findViewById(R.id.campoTetrabriks);
        campo_paper= findViewById(R.id.campoPapperBoard);
        campo_Bottles= findViewById(R.id.campoBottles);
        campo_Cans= findViewById(R.id.campoCans);
        campo_Glass= findViewById(R.id.campoGlass);
        botonRegistro= findViewById(R.id.BtnRegistrarReciclaje);

        String ip = getString(R.string.ip_hosting);

        String base_url = "http://" + ip ;
         retrofit = new Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        obtenerDatos();
    }

    private void obtenerDatos() {
        ApiService service = retrofit.create(ApiService.class);
        Call<TotalRecycleModel> pokemonRespuestaCall;
        pokemonRespuestaCall = service.obtenerListaPokemon(20, 11);

        pokemonRespuestaCall.enqueue(new Callback<TotalRecycleModel>() {
            @Override
            public void onResponse(Call<TotalRecycleModel> call, Response<TotalRecycleModel> response) {
                if (response.isSuccessful()) {

                    TotalRecycleModel pokemonRespuesta = response.body();

                } else {
                    Log.e("TAG", " onResponse: " + response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<TotalRecycleModel> call, Throwable t) {
                Toast.makeText(getBaseContext(),"No se ha podido conectar", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
