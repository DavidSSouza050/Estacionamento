package br.senai.sp.estacionafacil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ImageButton btnEnviarCadastro;
    private ListView listaEstacionamento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //sincronizando valiaveis
        btnEnviarCadastro = findViewById(R.id.botao_cadastrar);
        listaEstacionamento = findViewById(R.id.lista_estacionamento_inicial);


        //Criando intenção para o cadastro
        btnEnviarCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irCadastro = new Intent(MainActivity.this, CadastroActivity.class);
                startActivity(irCadastro);
            }
        });



        //criando lista para exbição da lista
        String[] carros = {"AHD-4532", "SED-1652", "WOD-1358", "PDF-3549"};

        ArrayAdapter<String> carrosAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, carros);
        listaEstacionamento.setAdapter(carrosAdapter);



    }
}
