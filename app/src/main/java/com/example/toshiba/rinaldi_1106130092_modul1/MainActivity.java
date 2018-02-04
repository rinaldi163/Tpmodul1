package com.example.toshiba.rinaldi_1106130092_modul1;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText editextmenu, editextjumlah;
    Button btneatbus;
    Button btnabnormal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editextmenu = (EditText) findViewById(R.id.edittextmenu);
        editextjumlah = (EditText) findViewById(R.id.edittextjumlah);
        btneatbus =  (Button) findViewById(R.id.buttoneatbus);
        btnabnormal =  (Button) findViewById(R.id.buttonabnormal);

        btneatbus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                final String nasiuudk = editextmenu.getText().toString();
                final String porsi1 = editextjumlah.getText().toString();
                int jumlah_integer = Integer.parseInt(editextjumlah.getText().toString());
                Intent intent = new Intent(getApplicationContext(), Activity2.class);
                intent.putExtra("nama_restoran", "Eatbus");
                intent.putExtra("nama_makanan", nasiuudk;
                intent.putExtra("porsi", porsi1);
                intent.putExtra("total_harga", jumlah_integer*50000);
                startActivity(intent);

            }

        };

        btnabnormal.setOnClickListener(View) {

            final String nasiudk = editextmenu.getText().toString();
            final String porsi2 = editextjumlah.getText().toString();
            int jumlah_integer = Integer.parseInt(editextjumlah.getText(),toString());
            Intent u = new Intent(getApplicationContext(), MainActivity1.class);
            u.putExtra("nama_restoran", "Abnormal");
            u.putExtra("nama_makanan", nasiudk);
            u.putExtra("porsi", porsi2);
            u.putExtra("total_harga", jumlah_integer*30000);
            startActivity(u);
        }
    } ;
}

