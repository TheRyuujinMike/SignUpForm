package edu.temple.signupform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        Button saveButton = (Button) findViewById(R.id.saveButton);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nameString, emailString, passwordString, rePasswordString;

                EditText nameText = (EditText) findViewById(R.id.nameEditText);

                EditText emailText = (EditText) findViewById(R.id.emailEditText);

                EditText passwordText = (EditText) findViewById(R.id.passwordEditText);

                EditText rePasswordText = (EditText) findViewById(R.id.rePasswordEditText);

                nameString = nameText.getText().toString();

                emailString = emailText.getText().toString();

                passwordString = passwordText.getText().toString();

                rePasswordString = rePasswordText.getText().toString();

                if (nameString.isEmpty() || emailString.isEmpty() || passwordString.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please enter missing information.", Toast.LENGTH_SHORT).show();
                }

                else if (!passwordString.matches(rePasswordString)) {
                    Toast.makeText(getApplicationContext(), "Passwords do not match.", Toast.LENGTH_SHORT).show();
                }

                else {
                    Toast.makeText(getApplicationContext(), "Your information has been saved.", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
