package at.fh.swengb.homework3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editTextNumber1);
        resultView = (TextView) findViewById(R.id.textViewResult);

    }

    public void convert(View view) {

        String num1String = editText1.getText().toString();
        double num1 = 0;
        double num2 = 0;

        try {
            num1 = Double.parseDouble(num1String);
            num2 = 2.20462;
            double result = num1 * num2;

            resultView.setText(num1String+"kg is "+result + "lbs");
        } catch (NumberFormatException e) {
            resultView.setText("wrong input!");
            e.printStackTrace();
        }


    }

}