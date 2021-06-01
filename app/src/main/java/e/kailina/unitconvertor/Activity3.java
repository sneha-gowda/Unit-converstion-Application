package e.kailina.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
    protected Button button3;
    protected TextView textView3_1;
    protected EditText editText3;
    protected Button button3_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        button3=findViewById(R.id.button3);
        textView3_1=findViewById(R.id.textView3_1);
        editText3=findViewById(R.id.editText3);
        button3_1=findViewById(R.id.button3_1);
        button3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(Activity3.this,MainActivity.class);
                startActivity(i3);
                finish();
            }
        });

    }


    public void calculate(View view){
        String s=editText3.getText().toString();
        int km=Integer.parseInt(s);
        double mile=km*0.621;
        textView3_1.setText("mile value is "+mile);

    }
}
