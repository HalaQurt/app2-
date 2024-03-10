package com.example.app_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class sampleBio extends AppCompatActivity implements View.OnClickListener{
    private Button btnadd ;
    private EditText txtHobby;

    public TextView txthobby2
            ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sample_bio);
        btnadd =findViewById(R.id.btnadd);
        txtHobby = findViewById(R.id.txtHobby);
        txthobby2 = findViewById(R.id.txthobby2);





        btnadd.setOnClickListener(this);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public void onClick(View v) {

        String hobbies = txtHobby.getText().toString();
        if (!hobbies.equals("")) {
            txthobby2.setVisibility(View.VISIBLE);
            txthobby2.setText(hobbies);
        }
    }
}