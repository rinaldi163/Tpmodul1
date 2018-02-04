package com.example.toshiba.rinaldi_1106130092_modul1;

/**
 * Created by TOSHIBA on 2/5/2018.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class MainActivity1 extends AppCompatActivity {
    TextView namaMakanan, porsi, namaRestoran, totalHarga;

    @Override
    protected void onCreate (Bundle savedInstanceStats) {
        super.onCreate(savedInstanceStats);
        setContentView(R.layout.eatbus);
        namaMakanan = (TextView) findViewById(R.id.nasiud);
        porsi = (TextView) findViewById(R.id.porsi1);
        totalHarga = (TextView) findViewById(R.id.harga1);
        namaRestoran = (TextView) findViewById(R.id.eatbus1);

        Intent u = getIntent();
        String restoran = u.getStringExtra("nama_restoran");
        String makanan = u.getStringExtra("nama_makanan");
        String porsi123 = u.getStringExtra("porsi");
        int w = u.getIntExtra("total_harga");
        String totalHargaa = String.valueOf(w);

        namaRestoran.setText(restoran);
        namaMakanan.setText(makanan);
        porsi.setText(porsi123);
        totalHarga.setText(totalHargaa);

    }
}

}
