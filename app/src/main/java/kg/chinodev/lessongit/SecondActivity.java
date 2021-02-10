package kg.chinodev.lessongit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    Button pereiti ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        pereiti = findViewById(R.id.myButton);

        pereiti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pereitiButton();
            }
        });
    }
    public void pereitiButton(){
        Intent pereActIntent = new Intent(this,ZairbekActivity.class );
        startActivityForResult(pereActIntent, 75);
    }

}