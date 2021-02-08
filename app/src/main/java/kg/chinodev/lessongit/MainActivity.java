package kg.chinodev.lessongit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        second = findViewById(R.id.second_button);


        int x  = 4;
        int y  = x * 15;
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Go!");
                Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
                myIntent.putExtra("sdasda", "sdasdas" +  y);
                startActivityForResult(myIntent, 75);
            }
        });
        System.out.println("Go!");
    }
}