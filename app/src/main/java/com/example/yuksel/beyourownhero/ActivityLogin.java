package com.example.yuksel.beyourownhero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ArrayList<User> arrayUser = new ArrayList<>();
        final ArrayList<String> arrSt = new ArrayList<>();
        arrSt.add("Personality");
        arrSt.add("Relationship");
        arrSt.add("Business/Winning");
        arrSt.add("Motivation");

        ArrayAdapter arrAdapt = new ArrayAdapter(this,android.R.layout.simple_list_item_multiple_choice,arrSt);



        final ListView lstTry = (ListView)findViewById(R.id.lst1);

        lstTry.setAdapter(arrAdapt);
        lstTry.setChoiceMode(lstTry.CHOICE_MODE_MULTIPLE);

      /*  ListView lstView = (ListView)findViewById(R.id.listview1);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayUser);
        User user = new User("yuksel","bilgin","bilginyuksel","123456");
        User user1 = new User("hasancan","kazan","hck","221133");

        arrayUser.add(user);
        arrayUser.add(user1);
        lstView.setAdapter(adapter);

*/

    }
}
