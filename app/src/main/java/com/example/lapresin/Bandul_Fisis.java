package com.example.lapresin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class Bandul_Fisis extends AppCompatActivity {

    EditText panjang1, panjang2, periode1, periode2;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bandul_fisis);

        panjang1 = findViewById(R.id.panjang1);
        panjang2 = findViewById(R.id.panjang2);
        periode1 = findViewById(R.id.periode1);
        periode1 = findViewById(R.id.periode2);
        hasil = findViewById(R.id.hasil);
    }

    private double hitung(double a1, double a2, double T1, double T2) {
        return 3.14*3.14/((T1*T1+T2*T2/(8*(a1+a2)))+(T1*T1-T2*T2/(8*(a1-a2))));
    }

    public void gravitasi(View v) {
        double a1 = Double.parseDouble(panjang1.getText().toString());
        double a2 = Double.parseDouble(panjang2.getText().toString());
        double T1 = Double.parseDouble(periode1.getText().toString());
        double T2 = Double.parseDouble(periode2.getText().toString());
        double hasil = hitung(a1, a2, T1, T2);
        this.hasil.setText(String.valueOf(hasil));
    }

    public void i (View v){
        Intent i = new Intent(this,Bandul_Matematis.class);
        startActivity(i);
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

    public void n (View v){
        Intent n = new Intent(this,Momen_Inersia.class);
        startActivity(n);
    }

}