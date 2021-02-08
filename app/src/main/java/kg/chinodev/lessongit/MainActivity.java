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

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = 3;
                int y = x * 14;
                Intent secondActIntent = new Intent(MainActivity.this, SecondActivity.class);
                secondActIntent.putExtra("dasdas", "sdasda" +  y);
                startActivityForResult(secondActIntent, 75);
            }
        });
        System.out.println("Go!");
    }
}