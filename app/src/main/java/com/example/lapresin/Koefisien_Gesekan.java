package com.example.lapresin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Koefisien_Gesekan extends AppCompatActivity {

    EditText massa1, massa2, percepatan;
    TextView hasil1, hasil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.koefisien__gesekan);

        massa1 = findViewById(R.id.massa1);
        massa2 = findViewById(R.id.massa2);
        percepatan= findViewById(R.id.percepatan);
        hasil1 = findViewById(R.id.hasil1);
        hasil2 = findViewById(R.id.hasil2);
    }

    private double hitung1(double m1, double m2) {
        return m2/m1;
    }

    public void statis(View v) {
        double m1 = Double.parseDouble(massa1.getText().toString());
        double m2 = Double.parseDouble(massa2.getText().toString());
        double hasil1 = hitung1(m1, m2);
        this.hasil1.setText(String.valueOf(hasil1));
    }

    private double hitung2(double m1, double m2, double a) {
        return (m2/m1)-((m1+m2)/m1)*a/9.8;
    }

    public void kinetis(View v) {
        double m1 = Double.parseDouble(massa1.getText().toString());
        double m2 = Double.parseDouble(massa2.getText().toString());
        double a = Double.parseDouble(percepatan.getText().toString());
        double hasil2 = hitung2(m1, m2, a);
        this.hasil2.setText(String.valueOf(hasil2));
    }

    public void i (View v){
        Intent i = new Intent(this,Bandul_Matematis.class);
        startActivity(i);
    }

    public void j (View v){
        Intent j = new Intent(this,Bandul_Fisis.class);
        startActivity(j);
    }

    public void k (View v){
        Intent k = new Intent(this,Tetapan_Pegas.class);
        startActivity(k);
    }

    public void l (View v){
        Intent l = new Intent(this,Viskositas.class);
        startActivity(l);
    }

    public void n (View v){
        Intent n = new Intent(this,Momen_Inersia.class);
        startActivity(n);
    }

}