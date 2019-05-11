package com.carolinaumb.myrepositorie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2,et3,et4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        et3 = (EditText)findViewById(R.id.et3);
        et4 = (EditText)findViewById(R.id.et4);
    }

    public void Enviar (View view){
        Intent i = new Intent(this, Datos.class);
               i.putExtra("dato", et1.getText().toString());
               i.putExtra("dato2", et2.getText().toString());
               i.putExtra("dato3", et3.getText().toString());
               i.putExtra("dato4", et4.getText().toString());
               startActivity(i);
    }
}
