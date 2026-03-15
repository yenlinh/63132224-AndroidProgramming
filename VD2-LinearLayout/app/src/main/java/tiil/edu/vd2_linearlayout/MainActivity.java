package tiil.edu.vd2_linearlayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtSo1, edtSo2, edtKetQua;
    Button btnCong, btnTru, btnNhan, btnChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSo1 = findViewById(R.id.edtSo1);
        edtSo2 = findViewById(R.id.edtSo2);
        edtKetQua = findViewById(R.id.edtKetQua);

        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);

        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tinhCong();
            }
        });

        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tinhTru();
            }
        });

        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tinhNhan();
            }
        });

        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tinhChia();
            }
        });
    }

    private boolean kiemTraDuLieu() {
        String so1 = edtSo1.getText().toString().trim();
        String so2 = edtSo2.getText().toString().trim();

        if (so1.isEmpty() || so2.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đầy đủ 2 số", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    private void tinhCong() {
        if (!kiemTraDuLieu()) return;

        double a = Double.parseDouble(edtSo1.getText().toString());
        double b = Double.parseDouble(edtSo2.getText().toString());
        double kq = a + b;

        edtKetQua.setText(String.valueOf(kq));
    }

    private void tinhTru() {
        if (!kiemTraDuLieu()) return;

        double a = Double.parseDouble(edtSo1.getText().toString());
        double b = Double.parseDouble(edtSo2.getText().toString());
        double kq = a - b;

        edtKetQua.setText(String.valueOf(kq));
    }

    private void tinhNhan() {
        if (!kiemTraDuLieu()) return;

        double a = Double.parseDouble(edtSo1.getText().toString());
        double b = Double.parseDouble(edtSo2.getText().toString());
        double kq = a * b;

        edtKetQua.setText(String.valueOf(kq));
    }

    private void tinhChia() {
        if (!kiemTraDuLieu()) return;

        double a = Double.parseDouble(edtSo1.getText().toString());
        double b = Double.parseDouble(edtSo2.getText().toString());

        if (b == 0) {
            Toast.makeText(this, "Không thể chia cho 0", Toast.LENGTH_SHORT).show();
            return;
        }

        double kq = a / b;
        edtKetQua.setText(String.valueOf(kq));
    }
}