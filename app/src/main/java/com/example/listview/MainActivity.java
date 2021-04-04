package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);

        ArrayList<Person> arrayList= new ArrayList<>();
        arrayList.add(new Person(R.drawable.item1,"Rokon","International Version of the Epidemic "));
        arrayList.add(new Person(R.drawable.item2,"Zahid","We have African food available. Dm us and we can ship anywhere within China."));
        arrayList.add(new Person(R.drawable.item3,"Kumshe","inspection report and the closed-loop"));
        arrayList.add(new Person(R.drawable.item4,"Ousmane","embassy to issue a green code"));
        arrayList.add(new Person(R.drawable.item5,"Rob","obtaining the certificate of negative nucleic acid test, declare your personal"));
        arrayList.add(new Person(R.drawable.item6,"Toukir","inspection report and the closed-loop personnel registration list issued by WeBang WeBang."));
        arrayList.add(new Person(R.drawable.item7,"Toushi"," certificate of negative nucleic acid test"));


        PersonAdapter personAdapter=new PersonAdapter(this,R.layout.list_row,arrayList);
        listView.setAdapter(personAdapter);
    }
}