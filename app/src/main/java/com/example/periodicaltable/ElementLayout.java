package com.example.periodicaltable;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
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
        elementName = findViewById(R.id.nom);
        elementName.setText(dadesElement.getString("nom"));
        elementName = findViewById(R.id.numero);
        elementName.setText(String.valueOf(dadesElement.getInt("numero")));
        elementName = findViewById(R.id.massaatomica);
        elementName.setText(String.valueOf(dadesElement.getInt("massa_atomica")));
        elementName = findViewById(R.id.seriequimica);
        elementName.setText(dadesElement.getString("serie_quimica"));
        elementName = findViewById(R.id.configuracio);
        elementName.setText(dadesElement.getString("configuracio"));
        elementName = findViewById(R.id.estat);
        elementName.setText(dadesElement.getString("estat"));

        final Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ca.wikipedia.org/wiki/"+dadesElement.getString("nom")));
        Button link = findViewById(R.id.link);

        link.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(browser);
            }
        });


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