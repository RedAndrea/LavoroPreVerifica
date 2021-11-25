package com.example.provaverifica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView Rossi;
    Button Drew;
    Button Ciambella;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ciambella = (Button)findViewById(R.id.Ciambella);
        Drew = (Button)findViewById(R.id.Drew);
        Rossi = (TextView)findViewById(R.id.Rossi);
}
        public void test(View v)
        {
         Toast t =Toast.makeText(getApplicationContext(),"DexterMorgan",Toast.LENGTH_LONG);// tre parametri(dove viene invocato,messaggio visualizzato,durata)
            // oggetto TOAST ha anche una gravity per posizionarlo
            t.show();

        }
    }
