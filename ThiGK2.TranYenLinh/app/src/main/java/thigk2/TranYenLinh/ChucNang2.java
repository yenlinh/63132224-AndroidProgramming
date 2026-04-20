package thigk2.TranYenLinh;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChucNang2 extends AppCompatActivity {

    ListView listTinhThanh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang2);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        listTinhThanh = findViewById(R.id.listTinhThanh);

        String[] dsTinhThanh = {
                "Hà Nội",
                "TP Hồ Chí Minh",
                "Đà Nẵng",
                "Cần Thơ",
                "Hải Phòng",
                "Nha Trang",
                "Huế",
                "Bình Dương",
                "Đồng Nai",
                "Trần Yến Linh"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dsTinhThanh
        );

        listTinhThanh.setAdapter(adapter);
    }
}