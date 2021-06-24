package TayybaDev.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email,pass;
    SharedPref sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email=(EditText)findViewById(R.id.email);
        pass=(EditText)findViewById(R.id.password);

        sharedPref=new SharedPref(MainActivity.this);


    }

    public void Clickme(View view) {
        switch (view.getId())
        {

            case  R.id.save:
                sharedPref.insertData(email.getText().toString(),pass.getText().toString());
                Toast.makeText(MainActivity.this,"Data saved",Toast.LENGTH_LONG).show();
            break;
            case R.id.load:
                String data=sharedPref.displayData();
                Toast.makeText(MainActivity.this,data,Toast.LENGTH_LONG).show();


                break;
        }
    }

}