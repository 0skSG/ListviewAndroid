package com.example.oscar.exemplelistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSimple = (Button)findViewById(R.id.btnSimple);
        Button btnComplex = (Button)findViewById(R.id.btnComplex);



        btnSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencio = new Intent(MainActivity.this,activitatPrincipal.class);
                startActivity(intencio);
            }
        });

        btnComplex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencio = new Intent(MainActivity.this,SecundaryActivity.class);
                startActivity(intencio);
            }
        });
    }
}
