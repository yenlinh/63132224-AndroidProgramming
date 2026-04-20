package thigk2.TranYenLinh;

package thigk2.TranYenLinh;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ChucNang3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang3);

        ListView lv = findViewById(R.id.lvDiemdulich);

        ArrayList<DiaDiem> ds = new ArrayList<>();

        // Hard-code 5 địa điểm
        ds.add(new DiaDiem(R.drawable.vinpearl, "Vinpearl Land", "Hòn Tre, Nha Trang"));
        ds.add(new DiaDiem(R.drawable.honmun, "Hòn Mun", "Vịnh Nha Trang"));
        ds.add(new DiaDiem(R.drawable.thapba, "Tháp Bà Ponagar", "2 Tháng 4, Nha Trang"));
        ds.add(new DiaDiem(R.drawable.baidai, "Bãi Dài", "Cam Lâm, Khánh Hòa"));
        ds.add(new DiaDiem(R.drawable.honchong, "Hòn Chồng", "Phạm Văn Đồng, Nha Trang"));

        DiaDiemAdapter adapter = new DiaDiemAdapter(this, ds);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener((parent, view, position, id) -> {
            DiaDiem dd = ds.get(position);
            Toast.makeText(this, dd.ten, Toast.LENGTH_SHORT).show();
        });
    }
}
