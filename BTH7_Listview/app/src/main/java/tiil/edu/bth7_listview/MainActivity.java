package tiil.edu.bth7_listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listViewNNLT;
    ArrayList<String> dsNgonNguLT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        listViewNNLT = findViewById(R.id.lvNNLT);

        // Chuẩn bị dữ liệu
        dsNgonNguLT = new ArrayList<>();
        dsNgonNguLT.add("Python");
        dsNgonNguLT.add("Java");
        dsNgonNguLT.add("Kotlin");
        dsNgonNguLT.add("C++");

        // Tạo adapter và gán cho ListView
        ArrayAdapter<String> adapterNNLT;
        adapterNNLT = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dsNgonNguLT
        );
        listViewNNLT.setAdapter(adapterNNLT);

        // Gắn bộ lắng nghe và xử lý sự kiện
        listViewNNLT.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String giaTriDuocChon = dsNgonNguLT.get(position);
                Toast.makeText(MainActivity.this, giaTriDuocChon, Toast.LENGTH_SHORT).show();
            }
        });
    }
}