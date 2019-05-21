/*tanggal pengerjaan : 19-05-2019
  nim : 10116026
  nama : Said Dinar Fadilah
  kelas : IF-1

*/

package com.example.said.daftarteman;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class datateman extends AppCompatActivity {

    private TextView nim, getnama, kelas, telepon, email, sosmed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datateman);
        getSupportActionBar().setTitle("Data Teman");
        nim = findViewById(R.id.nim);
        getnama = findViewById(R.id.getnama);
        kelas = findViewById(R.id.kelas);
        telepon = findViewById(R.id.telepon);
        email = findViewById(R.id.email);
        sosmed = findViewById(R.id.sosmed);
        showdata();


    }

    @SuppressLint("SetTextI18n")
    private void showdata() {
        String nama = getIntent().getExtras().getString("MyName");
        switch (nama) {
            case "Faizal Nur M":
                nim.setText("NIM: 10116011");
                getnama.setText("Nama: Faizal Nur M");
                kelas.setText("Kelas: IF-1");
                telepon.setText("Telepon : 081390906753");
                email.setText("Email : faizal26@gmail.com");
                sosmed.setText("Sosmed : faiz");
                break;

            case "Rizki Fadhillah":
                nim.setText("NIM: 10116017");
                getnama.setText("Nama: Rizki Fadhillah");
                kelas.setText("Kelas: IF-1");
                telepon.setText("Telepon : 08726578272");
                email.setText("Email : rizkiskididi@gmail.com");
                sosmed.setText("Sosmed : Rizki Fadhillah");
                break;

            case "Doni Wiranata":
                nim.setText("NIM: 10116024");
                getnama.setText("Nama: Doni Wiranata");
                kelas.setText("Kelas: IF-1");
                telepon.setText("Telepon : 08543252627");
                email.setText("Email : donidonat@gmail.com");
                sosmed.setText("Sosmed : Donikurangbelajar");
                break;

            case "Bagus Fajar P":
                nim.setText("NIM: 10116039");
                getnama.setText("Nama: Bagus Fajar P");
                kelas.setText("Kelas: IF-1");
                telepon.setText("Telepon : 08533367899");
                email.setText("Email : bagusfp@gmail.com");
                sosmed.setText("Sosmed : bagusfp");
                break;


        }
    }
}