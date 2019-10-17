package com.example.recicladotandil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputLayout;

public class CreateUser extends AppCompatActivity {

    private TextInputLayout tilNombre;
    private TextInputLayout tilLastName;
    private TextInputLayout tilCorreo;
    private TextInputLayout tilUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);

        Button refreshButton = findViewById(R.id.boton_cancelar);
        Button aceptButton = findViewById(R.id.boton_aceptar);
        tilNombre = findViewById(R.id.first_name_text_input);
        tilLastName = findViewById(R.id.last_name_text_input);
        tilUserName = findViewById(R.id.username_text_input);
        tilCorreo = findViewById(R.id.email_text_input);
        aceptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dategraphintent = new Intent(CreateUser.this, Main2Activity.class);
                startActivity(dategraphintent);
            }
        });
        refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tilNombre.getEditText().setText("");
                tilLastName.getEditText().setText("");
                tilUserName.getEditText().setText("");
                tilCorreo.getEditText().setText("");
            }
        });
    }
}
