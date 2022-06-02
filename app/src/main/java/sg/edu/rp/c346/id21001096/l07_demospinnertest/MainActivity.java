package sg.edu.rp.c346.id21001096.l07_demospinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        spinner = findViewById(R.id.spinner);

       spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
               switch (position) {
                   case 0:
                       //Your cod for item 1 selected
                       tv.setText("Spinner Item, Yes Selected");
                       break;

                   case 1:
                       // Your code for item 2 selected
                       tv.setText("Spinner Item, No Selected");
                       break;

               }
           }

           @Override
           public void onNothingSelected(AdapterView<?> adapterView) {

           }
       });


    }
}