package com.example.fact;

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

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button f;
    public int fact(int n) {
        int i=1;
        int res=1;
        while(i<=n) {
            res*=i;
            i++;
        }
        return res;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f=(Button) findViewById(R.id.find);
        f.setOnClickListener(this);
        }
        @Override
    public void onClick(View view)
        {
           if(view.getId()==R.id.find) {
               EditText num=(EditText) findViewById(R.id.num);
               int temp=Integer.parseInt(num.getText().toString());
               String result=String.valueOf(fact(temp));
               TextView t=(TextView) findViewById(R.id.res);

               t.setText(t.getText()+result);
           }
        }
    }
