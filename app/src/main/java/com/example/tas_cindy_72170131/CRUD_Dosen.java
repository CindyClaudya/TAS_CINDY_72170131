package com.example.tas_cindy_72170131;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CRUD_Dosen extends AppCompatActivity {
    EditText nama, nidn, gelar, alamat, foto;
    Button simpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.CRUD_Dosen_layout);
       nama = (EditText) findViewById(R.id.editnama);
        nidn = (EditText) findViewById(R.id.editnidn);
        gelar = (EditText) findViewById(R.id.editgelar);
        alamat = (EditText) findViewById(R.id.editalamat);
        simpan = (Button)findViewById(R.id.buttonsavedosen);




        simpan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(nama.getText().toString().length()==0){
                    //jika form nama dosen belum di isi / masih kosong
                    nama.setError("Nama belum di isi!");
                }else if(nidn.getText().toString().length()==0){
                    //jika form nidn belum di isi / masih kosong
                    nidn.setError("NIDN belum di isi!!");
                }else if(gelar.getText().toString().length()==0){
                    //jika form gelar belum di isi / masih kosong
                    gelar.setError("Gelar belum di isi!");

                }else if(alamat.getText().toString().length()==0){
                    //jika form alamat belum di isi / masih kosong
                    alamat.setError("Alamat belum di isi!");

                }else {
                    //jika form dosen sudah terisi semua
                    Toast.makeText(getApplicationContext(), "Data Tersimpan Terimakasih",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}







