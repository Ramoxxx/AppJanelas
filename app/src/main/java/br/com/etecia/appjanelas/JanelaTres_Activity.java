package br.com.etecia.appjanelas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JanelaTres_Activity extends AppCompatActivity {
    Button AbrirJanela01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.janela__tres_layout);

        AbrirJanela01=(Button)findViewById(R.id.btnAbrirJanela01);
        AbrirJanela01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        });
    }
}
