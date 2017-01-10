package com.example.johnny.a7_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String[] paises = { "Argentina", "Chile", "Paraguay", "Bolivia",
            "Peru", "Ecuador", "Brasil", "Colombia", "Venezuela", "Uruguay",
            "Mexico", "Panama" };

    private String[] habitantes = { "40000000", "17000000", "6500000",
            "10000000", "30000000", "14000000", "183000000", "44000000",
            "29000000", "3500000", "5500000", "500000" };

    private TextView lblPoblacion;
    private ListView lstPaises;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblPoblacion = (TextView) findViewById(R.id.lblPoblacion);
        lstPaises = (ListView) findViewById(R.id.lstPaises);

        configurarLista();
    }


    public void configurarLista() {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, paises);

        lstPaises.setAdapter(adapter);

        lstPaises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int posicion, long id) {
                lblPoblacion.setText("Población de "
                        + lstPaises.getItemAtPosition(posicion) + " es "
                        + habitantes[posicion]);

            }
        });

    }
}
