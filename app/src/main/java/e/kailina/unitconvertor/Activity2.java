package e.kailina.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    protected Button button;
    protected TextView textView2;
    protected EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        button=findViewById(R.id.button);
        textView2=findViewById(R.id.textView2);
        editText=findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Activity2.this, "Done!", Toast.LENGTH_SHORT).show();
                String s=editText.getText().toString();
                int kg=Integer.parseInt(s);
                double pound=kg*2.105;
                textView2.setText("Pound value is "+pound);
            }
        });


    }
    public void back(View view){
        Intent i4=new Intent(Activity2.this,MainActivity.class);
        startActivity(i4);
        finish();
    }
}
