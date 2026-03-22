package tiil.edu.bth5_xulysukien1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edtSoA, edtSoB;
    Button btnCong, btnTru, btnNhan, btnChia;
    TextView txtKetQua;

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

        // Ánh xạ
        edtSoA = findViewById(R.id.edtSoA);
        edtSoB = findViewById(R.id.edtSoB);
        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);
        txtKetQua = findViewById(R.id.txtKetQua);

        // Cộng
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!kiemTra()) return;

                double a = Double.parseDouble(edtSoA.getText().toString());
                double b = Double.parseDouble(edtSoB.getText().toString());

                txtKetQua.setText("Kết quả: " + (a + b));
            }
        });

        // Trừ
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!kiemTra()) return;

                double a = Double.parseDouble(edtSoA.getText().toString());
                double b = Double.parseDouble(edtSoB.getText().toString());

                txtKetQua.setText("Kết quả: " + (a - b));
            }
        });

        // Nhân
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!kiemTra()) return;

                double a = Double.parseDouble(edtSoA.getText().toString());
                double b = Double.parseDouble(edtSoB.getText().toString());

                txtKetQua.setText("Kết quả: " + (a * b));
            }
        });

        // Chia
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!kiemTra()) return;

                double a = Double.parseDouble(edtSoA.getText().toString());
                double b = Double.parseDouble(edtSoB.getText().toString());

                if (b == 0) {
                    Toast.makeText(MainActivity.this, "Không thể chia cho 0", Toast.LENGTH_SHORT).show();
                    return;
                }

                txtKetQua.setText("Kết quả: " + (a / b));
            }
        });
    }

    private boolean kiemTra() {
        String a = edtSoA.getText().toString().trim();
        String b = edtSoB.getText().toString().trim();

        if (a.isEmpty() || b.isEmpty()) {
            Toast.makeText(this, "Nhập đủ 2 số", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}