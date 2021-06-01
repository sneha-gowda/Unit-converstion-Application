package e.kailina.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
    }
    public void onclick2(View view){
        Intent i6=new Intent(Activity4.this,MainActivity.class);
        startActivity(i6);
        finish();
    }
}
