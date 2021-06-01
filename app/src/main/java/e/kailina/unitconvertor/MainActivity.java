package e.kailina.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    protected Button button1;
    protected Button button3,mail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent( MainActivity.this,Activity2.class);
                startActivity(i);



            }
        });
        button3=findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
            Intent i5=new Intent(MainActivity.this,Activity4.class);
            startActivity(i5);
            }
        });

        mail=findViewById(R.id.button4);
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gmail="vanitha.vanihari@gmail.com";
                String subject="UNIT CONVERTER APPLICATION";
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{gmail});
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"Choose mailing option"));
                }
            
        });

    }
    public void onclick1(View view){
        Intent i2=new Intent( MainActivity.this, Activity3.class);
        startActivity(i2);

    }
}
