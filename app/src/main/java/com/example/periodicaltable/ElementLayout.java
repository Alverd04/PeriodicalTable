package com.example.periodicaltable;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import org.w3c.dom.Text;

public class ElementLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_element_layout);

        Bundle dadesElement = getIntent().getExtras();

        TextView elementName;

        elementName = findViewById(R.id.simbolo);
        elementName.setText(dadesElement.getString("simbol"));
        elementName = findViewById(R.id.nombre);
        elementName.setText(dadesElement.getString("nom"));
        elementName = findViewById(R.id.numero);
        elementName.setText(String.valueOf(dadesElement.getInt("numero")));
        elementName = findViewById(R.id.serie_quimica);
        elementName.setText(dadesElement.getString(""));

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }
}