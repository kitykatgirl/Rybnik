package ph.me.rybnik;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText nazwaGatunkuEditText;
    RadioButton sposob1;
    RadioButton sposob2;
    RadioButton sposob3;
    TextView textViewDlugosc;
    SeekBar seekBarDlugosc;
    CheckBox checkBoxOkresOchronny;
    EditText wagaEditText;
    Button btnDodaj;
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
        nazwaGatunkuEditText = findViewById(R.id.editTextText);
        sposob1 = findViewById(R.id.radioButton);
        sposob2 = findViewById(R.id.radioButton2);
        sposob3 = findViewById(R.id.radioButton3);
        textViewDlugosc = findViewById(R.id.textViewDlugosc);
        seekBarDlugosc = findViewById(R.id.seekBar);
        checkBoxOkresOchronny = findViewById(R.id.checkBox);
        wagaEditText = findViewById(R.id.editTextWaga);
        btnDodaj = findViewById(R.id.button);

    }
}