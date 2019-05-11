package com.carolinaumb.myrepositorie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Datos extends AppCompatActivity {

    private TextView tv1, tv2, tv3, tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);
        tv4 = (TextView)findViewById(R.id.tv4);

        String dato= getIntent().getStringExtra("dato");
        String dato2 = getIntent().getStringExtra("dato2");
        String dato3 = getIntent().getStringExtra("dato3");
        String dato4 = getIntent().getStringExtra("dato4");
        tv1.setText("Bienvenido " + dato);
        tv2.setText(dato2);
        tv3.setText(dato3);
        tv4.setText(dato4);
    }
    public void Regresar (View view){
        Intent i= new Intent(this, MainActivity.class);
        startActivity(i);
    }

}
