package com.sapna.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText number1;
    private EditText number2;
    private Button btnAdd;
    private Button btnSubtract;
    private Button btnDivide;
    private Button btnMultiply;
    private Button btnClear;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = (EditText) findViewById(R.id.editNumber1);
        number2= (EditText) findViewById(R.id.editNumber2);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSubtract = (Button) findViewById(R.id.btnSubtract);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnClear = (Button) findViewById(R.id.btnClear);
        txtResult = (TextView) findViewById(R.id.txtResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((number1.getText().length() > 0) && (number2.getText().length() > 0)) {
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());
                    double theResult = num1 + num2;
                    txtResult.setText(Double.toString(theResult));
                }
                else
                    Toast.makeText(MainActivity.this,"Please enter numbers in both fields",Toast.LENGTH_LONG).show();
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((number1.getText().length() > 0) && (number2.getText().length() > 0)) {
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());
                    double theResult = num1 - num2;
                    txtResult.setText(Double.toString(theResult));
                }
                else
                    Toast.makeText(MainActivity.this,"Please enter numbers in both fields",Toast.LENGTH_LONG).show();
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((number1.getText().length() > 0) && (number2.getText().length() > 0)) {
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());
                    double theResult = num1 / num2;
                    txtResult.setText(Double.toString(theResult));
                }
                else
                    Toast.makeText(MainActivity.this,"Please enter numbers in both fields",Toast.LENGTH_LONG).show();
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((number1.getText().length() > 0) && (number2.getText().length() > 0)) {
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());
                    double theResult = num1 * num2;
                    txtResult.setText(Double.toString(theResult));
                }
                else
                    Toast.makeText(MainActivity.this,"Please enter numbers in both fields",Toast.LENGTH_LONG).show();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1.setText("");
                number2.setText("");
                txtResult.setText("0.00");
                number1.requestFocus();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemsSelected(MenuItem item){
        int id = item.getItemId();
        if(id == R.id.action_settings)
            return true;
        return super.onOptionsItemSelected(item);
    }

}
