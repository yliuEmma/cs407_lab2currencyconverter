package com.example.currency_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void buttonClicked (View view){
        EditText myTextField = (EditText) findViewById(R.id.editText);
        String str = myTextField.getText().toString();
        goToActivity2(str);
    }

    public void goToActivity2 (String s) {
        double converted = 0;
        converted = (double) Integer.parseInt(s);
        converted = converted * 0.77;
        Intent intent = new Intent (this, Main2Activity.class);
        intent.putExtra("message", "£"+converted);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
