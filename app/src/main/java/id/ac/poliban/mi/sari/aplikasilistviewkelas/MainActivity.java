package id.ac.poliban.mi.sari.aplikasilistviewkelas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> name = new ArrayList<>();
    {
        name.add("Eko Asdy Wibowo");
        name.add("Fenia Dwi Maulida");
        name.add("Firda Kharisma");
        name.add("Hendra Gunawan");
        name.add("Hini Amaliah");
        name.add("Insan Norcahyo");
        name.add("Maisarah");
        name.add("Maulida Rahmi");
        name.add("Mayadiah Atikasari");
        name.add("Molida Junida");
        name.add("Muhammad Auzan");
        name.add("Muhammad Hafiz Ansari");
        name.add("Muhammad Rizki Fahmi");
        name.add("Nia Karlida Yanti");
        name.add("Nur Rizki Aulia");
        name.add("Octa Pasaribu");
        name.add("Sari Rahma Maulida");
        name.add("Wardatul Hisaniah");
        name.add("Wenny Lisandra");
        name.add("Ahmad Yusfanhafizh");
        name.add("Sri Wahyuni");
        name.add("Haifa Mai Suci");
        name.add("Muhammad Rasyad Sultansyah");
        name.add("Hendri Pratama");
        name.add("Risma Sari");
        name.add("M Tri Utomo");

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ubah judul di Action Bar
        if (getSupportActionBar() != null)
            setTitle("Aplikasi List name");

        //daftarkan view untuk dimanipulasi
        ListView listView = findViewById(R.id.list_view);

        //buat adapter
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.item_rows_nama, R.id.tv_item_nama, name);

        listView.setAdapter(adapter);

        //event handling (jangan lupa aktifkan java1.8)
        listView.setOnItemClickListener(((parent, view, position, id) -> {
            Toast.makeText(this, "Anda Mengklik "    +
                    name.get(position), Toast.LENGTH_SHORT).show();
        }));
    }
}
