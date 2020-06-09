package sg.edu.rp.c346.id18016094.simpletodo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText etColour;
    Button btnAdd, btnClear, btnDelete;
    ListView lvColour;
    ArrayAdapter<String> aa;
    ArrayList<String> al;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       etColour = findViewById(R.id.editTextThings);
       btnAdd = findViewById(R.id.buttonAddItem);
       btnDelete = findViewById(R.id.buttonDelete);
       btnClear = findViewById(R.id.buttonClear);
       lvColour = findViewById(R.id.listlist);

       al = new ArrayList<>();
        aa = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, al);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item = etColour.getText().toString();
                al.add(item);
                lvColour.setAdapter(aa);
                aa.notifyDataSetChanged();
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aa.clear();
            }
        });

    }
}
