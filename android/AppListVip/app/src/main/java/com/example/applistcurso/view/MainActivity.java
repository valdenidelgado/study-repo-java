package com.example.applistcurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.applistcurso.R;
import com.example.applistcurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    EditText editPrimeiroNome, editSobreNome, editCursoDesejado, editTelefoneContato;
    Button btnLimpar, btnSalvar, btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pessoa pessoa = new Pessoa();


        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobreNome = findViewById(R.id.editSobreNome);
        editCursoDesejado = findViewById(R.id.editNomeCurso);
        editTelefoneContato = findViewById(R.id.editTelefoneContato);

        // Para colocar um campo na tela de um EditText
        // Utilize o .setText("Valor")
        // editPrimeiroNome.setText("Fulano");
        // editSobreNome.setText("de Tal");

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        btnSalvar.setOnClickListener(v -> {
            pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
            pessoa.setSobreNome(editSobreNome.getText().toString());
            pessoa.setCursoDesejado(editCursoDesejado.getText().toString());
            pessoa.setTelefoneContato(editTelefoneContato.getText().toString());

            Toast.makeText(this, "Salvo" + pessoa, Toast.LENGTH_SHORT).show();
        });

        btnFinalizar.setOnClickListener(v -> {
            Toast.makeText(this, "Volte Sempre", Toast.LENGTH_SHORT).show();
            finish();
        });

        btnLimpar.setOnClickListener(v -> {
            editPrimeiroNome.setText("");
            editSobreNome.setText("");
            editCursoDesejado.setText("");
            editTelefoneContato.setText("");
        });

    }
}