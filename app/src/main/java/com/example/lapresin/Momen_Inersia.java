package com.example.lapresin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Momen_Inersia extends AppCompatActivity {

    EditText massa, jari2, percepatan;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.momen__inersia);

        massa = findViewById(R.id.massa);
        jari2 = findViewById(R.id.jari2);
        percepatan = findViewById(R.id.percepatan);
        hasil = findViewById(R.id.hasil);
    }

    private double hitung(double m, double r, double a) {
        return m*r*r*(9.8/a - 1);
    }

    public void inersia(View v) {
        double m = Double.parseDouble(massa.getText().toString());
        double r = Double.parseDouble(jari2.getText().toString());
        double a = Double.parseDouble(percepatan.getText().toString());
        double hasil = hitung(m, r, a);
        this.hasil.setText(String.valueOf(hasil));
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

    public void m (View v){
        Intent m = new Intent(this,Koefisien_Gesekan.class);
        startActivity(m);
    }

}