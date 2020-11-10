package com.example.avaliacaon2;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.Edits;
import android.view.View;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    // Variáveis representando os componentes que utilizaremos
    private EditText ptUser;
    private EditText pasPassword;
    private Button btnEntrar;
    private TextView tvMessage;

    private static final String TEXT_CONTENTS = "TextContents"; // constante "chave"
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ptUser = findViewById(R.id.ptUser); // getElementById
        pasPassword = findViewById(R.id.pasPassword);
        btnEntrar = findViewById(R.id.btnEntrar);
        tvMessage = findViewById(R.id.tvMessage);



        // permite fazer um "scroll" no text view
        //textView.setMovementMethod(new ScrollingMovementMethod());


        //Listner = objeto
        View.OnClickListener ouvinte = new View.OnClickListener() {
            @Override
            public void onClick(View InformedView) {

                if (ptUser.getText().toString().equals("icarvalho") && pasPassword.getText().toString().equals("admin")) {
                    tvMessage.setText("Welcome to the TOP!!!.");
                    ptUser.onEditorAction(EditorInfo.IME_ACTION_DONE);
                } else {
                    tvMessage.setText("User or Password wrong.");
                }
                tvMessage.setVisibility(View.VISIBLE);
                ptUser.setText(""); // limpa o campo texto
                pasPassword.setText(""); // limpa o campo texto
            }
        };

        btnEntrar.setOnClickListener(ouvinte);

        View.OnClickListener ouvinte2 = new View.OnClickListener() {
            @Override
            public void onClick(View InformedView) {
                tvMessage.setText("");
            }
        };

        ptUser.setOnClickListener(ouvinte2);


        }

    };


