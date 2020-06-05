package sg.edu.rp.webservices.demotipsforexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;
    String[] examTipsArray;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvExamTips = findViewById(R.id.lv);

        examTipsArray = new String[5];
        examTipsArray[0] = "Don't just read the code, code it as much as possible during each practical session";
        examTipsArray[1] = "Seek help from the lecturer ASAP, don't wait till you lost in the jungle";
        examTipsArray[2] = "Prepare your template source code for each topic";
        examTipsArray[3] = "Create a few empty Android projects to speed up your coding during the exam";
        examTipsArray[4] = "Ensure that your Android Studio is up and running before the exam";

        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, examTipsArray);
        lvExamTips.setAdapter(adapter);
        lvExamTips = findViewById(R.id.lv);


    }
}
