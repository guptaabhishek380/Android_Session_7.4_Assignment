package gupta.abhi380.com.assignment_74;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    DataBase sql_database;
    TextView textView;
    DataBase db= new DataBase(MainActivity.this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.display_textview);
        db.deleteAllItems();
        sql_database = new DataBase(this);

        sql_database.insertName("Soumya","Seth");
        sql_database.insertName("Alleinna","Singh");
        sql_database.insertName("Subhrajyoti","Brahma");
        sql_database.insertName("Sharukh","Khan");
        sql_database.insertName("Deepika","Padukone");
        sql_database.insertName("Ranveer","Singh");

        sql_database.getName(textView);
    }
}

