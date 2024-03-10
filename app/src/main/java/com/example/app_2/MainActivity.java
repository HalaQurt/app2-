package com.example.app_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button btnLogin ;
private EditText txtName;
private EditText txtPassword ;
public TextView txtnameError ;
private TextView txtPasseError;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
         btnLogin =findViewById(R.id.btnLogin);
         txtName = findViewById(R.id.txtName);
         txtPassword = findViewById(R.id.txtPassword);
         txtnameError = findViewById(R.id.txtnameError);
         txtPasseError = findViewById(R.id.txtPasseError);

        btnLogin.setOnClickListener(this);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;



        });
    }

    @Override
    public void onClick(View v) {
        txtnameError.setText("");
        txtPasseError.setText("");


        String name = "halaqurt";
        String pass = "1234" ;
        String passtxt = txtPassword.getText().toString();
        String nametxt = txtName.getText().toString();

     if ( !passtxt.equals("") && !nametxt.equals("") ){

         if (passtxt.equals(pass) && nametxt.equals(name)){
             Toast.makeText(this ,"Successful login ", Toast.LENGTH_LONG).show();

         } if ( !nametxt.equals(name)) {
             txtnameError.setText("wrong username");


         }
         if ( !passtxt.equals(pass)){
             txtPasseError.setText("wrong Password");
         }

     }
    }
}