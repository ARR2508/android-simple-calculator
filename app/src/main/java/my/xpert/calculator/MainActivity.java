package my.xpert.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView answertextView;
    EditText insert1editText, insert2editText;
    double insert1;
    double insert2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answertextView = findViewById(R.id.answer_textView);
        insert1editText = findViewById(R.id.insert1_editText);
        insert2editText = findViewById(R.id.insert2_editText);
    }

    public void button_add(View view) {

        insert1 = Double.parseDouble(insert1editText.getText().toString());
        insert2 = Double.parseDouble(insert2editText.getText().toString());
        answertextView.setText(""+(insert1+insert2));

    }

    public void button_sub(View view) {

        insert1 = Double.parseDouble(insert1editText.getText().toString());
        insert2 = Double.parseDouble(insert2editText.getText().toString());
        answertextView.setText(""+(insert1-insert2));
    }

    public void button_div(View view) {

        insert1 = Double.parseDouble(insert1editText.getText().toString());
        insert2 = Double.parseDouble(insert2editText.getText().toString());

        if (insert2 == 0){

            Toast.makeText(MainActivity.this,"Number cannot be zero", Toast.LENGTH_LONG).show();

        }else {
            answertextView.setText("" + (insert1 / insert2));
        }
    }

    public void button_mul(View view) {

        insert1 = Double.parseDouble(insert1editText.getText().toString());
        insert2 = Double.parseDouble(insert2editText.getText().toString());
        answertextView.setText(""+(insert1*insert2));
    }
}
