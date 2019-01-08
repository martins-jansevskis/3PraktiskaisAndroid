package lv.jansevskis.martins.darbsuzvietas;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button activity2 = (Button) findViewById(R.id.activity2_btn);
       Button save= (Button) findViewById(R.id.save_btn);
       activity2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Aktivitate2.class));
            }

        });
        final EditText edit_text= (EditText) findViewById(R.id.editText);
       final SharedPreferences preferenceAccess = getSharedPreferences("PREFERENCES", MODE_PRIVATE);
        save.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SharedPreferences.Editor editor = preferenceAccess.edit();
                editor.putString( "Darbs",edit_text.getText().toString());
                editor.commit();
            }

        });
    }


}
