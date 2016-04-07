package com.example.drew1_000.advanced_espresso_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button changeButton = (Button) findViewById(R.id.change_button);
        final TextView textView = (TextView) findViewById(R.id.top_text);
        final EditText textField = (EditText) findViewById(R.id.editText);

        changeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText(textField.getText());
            }
        });
    }
}
