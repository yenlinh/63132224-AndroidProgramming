package thigk2.TranYenLinh;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ChuViDienTichHCN extends AppCompatActivity {

    EditText edtChieuDai, edtChieuRong;
    EditText editTextKetQua;
    Button nutChuVi, nutDienTich;

    void TimDieuKhien() {
        edtChieuDai = findViewById(R.id.edtChieuDai);
        edtChieuRong = findViewById(R.id.edtChieuRong);
        editTextKetQua = findViewById(R.id.edtKetQua);
        nutChuVi = findViewById(R.id.btnChuVi);
        nutDienTich = findViewById(R.id.btnDienTich);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chu_vi_dien_tich_hcn);
        TimDieuKhien();
    }

    public void TinhChuVi(View v) {
        String daiStr = edtChieuDai.getText().toString();
        String rongStr = edtChieuRong.getText().toString();

        if (daiStr.isEmpty() || rongStr.isEmpty()) {
            editTextKetQua.setText("Vui lòng nhập đầy đủ chiều dài và chiều rộng!");
            return;
        }

        float dai = Float.parseFloat(daiStr);
        float rong = Float.parseFloat(rongStr);

        float chuVi = 2 * (dai + rong);
        editTextKetQua.setText(String.valueOf(chuVi));
    }

    public void TinhDienTich(View v) {
        String daiStr = edtChieuDai.getText().toString();
        String rongStr = edtChieuRong.getText().toString();

        if (daiStr.isEmpty() || rongStr.isEmpty()) {
            editTextKetQua.setText("Vui lòng nhập đầy đủ chiều dài và chiều rộng!");
            return;
        }

        float dai = Float.parseFloat(daiStr);
        float rong = Float.parseFloat(rongStr);

        float dienTich = dai * rong;
        editTextKetQua.setText(String.valueOf(dienTich));
    }
}