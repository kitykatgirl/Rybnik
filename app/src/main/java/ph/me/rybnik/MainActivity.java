package ph.me.rybnik;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText nazwaGatunkuEditText;
    Spinner sposobySpinner;
    TextView textViewDlugosc;
    SeekBar seekBarDlugosc;
    Switch checkBoxOkresOchronny;
    EditText wagaEditText;
    Button btnDodaj;

    ListView listView;

    private String[] sposoby = {"roslinozerne","wszystkozerne","drapiezne"};

    ArrayList<Ryba> ryby = new ArrayList<>();
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
        sposobySpinner = findViewById(R.id.spinner);
        textViewDlugosc = findViewById(R.id.textViewDlugosc);
        seekBarDlugosc = findViewById(R.id.seekBar);
        checkBoxOkresOchronny = findViewById(R.id.switch1);
        wagaEditText = findViewById(R.id.editTextWaga);
        btnDodaj = findViewById(R.id.button);
        listView = findViewById(R.id.listView);
        int sposobZywienia = 1;

        ArrayAdapter<Ryba> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,ryby);

        listView.setAdapter(adapter);

        ArrayAdapter<String> ad = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,sposoby);

        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sposobySpinner.setAdapter(ad);



        seekBarDlugosc.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textViewDlugosc.setText("Dlugosc: " + i + "cm");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        btnDodaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!nazwaGatunkuEditText.getText().equals("") || !wagaEditText.getText().equals("")){
                    String nazwa = String.valueOf(nazwaGatunkuEditText.getText());

                    int sposobZywienia = sposobySpinner.getSelectedItemPosition()+1;

                    int dlugosc = seekBarDlugosc.getProgress();

                    boolean okresOchronny = checkBoxOkresOchronny.isChecked();

                    int waga = Integer.parseInt(String.valueOf(wagaEditText.getText()));

                    ryby.add(new Ryba(nazwa,sposobZywienia,dlugosc,okresOchronny,waga));

                    adapter.notifyDataSetChanged();
                }
            }
        });

    }
}