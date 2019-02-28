package com.example.lapresin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Viskositas extends AppCompatActivity {

    EditText jarijari, massa3, jarak, waktu, massajenis;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viskositas);

        jarijari = findViewById(R.id.jarijari);
        massa3= findViewById(R.id.massa3);
        jarak= findViewById(R.id.jarak);
        waktu= findViewById(R.id.waktu);
        massajenis= findViewById(R.id.massajenis);
        hasil = findViewById(R.id.hasil);
    }

    private double hitung(double r, double m, double s, double t, double p) {
        return 2*r*r*9.8*t*((3*m/(4*3.14*r*r*r))-p)/(9*(1+1.36*r)*s);
    }

    public void viskositas(View v) {
        double r = Double.parseDouble(jarijari.getText().toString());
        double m = Double.parseDouble(massa3.getText().toString());
        double s = Double.parseDouble(jarak.getText().toString());
        double t = Double.parseDouble(waktu.getText().toString());
        double p = Double.parseDouble(massajenis.getText().toString());
        double hasil = hitung(r, m, s, t, p);
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

    public void m (View v){
        Intent m = new Intent(this,Koefisien_Gesekan.class);
        startActivity(m);
    }

    public void n (View v){
        Intent n = new Intent(this,Momen_Inersia.class);
        startActivity(n);
    }

}