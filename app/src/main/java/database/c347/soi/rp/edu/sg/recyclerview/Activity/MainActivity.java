package database.c347.soi.rp.edu.sg.recyclerview.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import database.c347.soi.rp.edu.sg.recyclerview.Adapter.ExpandableListAdapter;
import database.c347.soi.rp.edu.sg.recyclerview.R;

public class MainActivity extends AppCompatActivity {

    ExpandableListView ELVlist;
    ExpandableListAdapter adapter;
    List<String> listDataHeader;
    HashMap<String, List<String>> listHash;
    int lastExpandedPosition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ELVlist = (ExpandableListView) findViewById(R.id.ELVlist);
        initData();
        adapter = new ExpandableListAdapter(this, listDataHeader, listHash);
        ELVlist.setAdapter(adapter);

        ELVlist.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                if (lastExpandedPosition != -1
                        && groupPosition != lastExpandedPosition) {
                    ELVlist.collapseGroup(lastExpandedPosition);
                }
                lastExpandedPosition = groupPosition;
            }
        });

        ELVlist.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i1, long l) {
                if(listHash.get(listDataHeader.get(i)).get(i1).equals("Grid 3x3")){
                    nextActivity(FirstActivity.class, "Grid 3x3");
                }
                if(listHash.get(listDataHeader.get(i)).get(i1).equals("Grid 3x3 Different Layout")){
                    nextActivity(SecondActivity.class, "Grid 3x3 Different Layout");
                }
                if(listHash.get(listDataHeader.get(i)).get(i1).equals("Grid 2x2")){
                    nextActivity(ThirdActivity.class, "Grid 2x2");
                }
                if(listHash.get(listDataHeader.get(i)).get(i1).equals("Profile Design")){
                    nextActivity(FourthActivity.class, "Profile Design");
                }
                if(listHash.get(listDataHeader.get(i)).get(i1).equals("Nested RecyclerView")){
                    nextActivity(FifthActivity.class, "Nested RecyclerView");
                }
                if(listHash.get(listDataHeader.get(i)).get(i1).equals("Sub Item 1")){
                    nextActivity(TestActivity.class, "Test");
                }
                if(listHash.get(listDataHeader.get(i)).get(i1).equals("Profile Design 2")){
                    nextActivity(SixthActivity.class, "Profile Design 2");
                }
                return true;
            }
        });
    }

    private void nextActivity(Class c, String title){
        Intent i = new Intent(MainActivity.this, c);
        i.putExtra("title",title);
        startActivity(i);
        ELVlist.collapseGroup(0);
        ELVlist.collapseGroup(1);
    }

    private void random(){
        List<Integer> solution = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            solution.add(i);
        }

        List<Integer> store = new ArrayList<>();
        for(int j=0; j<5; j++){
            Collections.shuffle(solution);
            System.out.println("Shuffle " + j + " " + solution);
            for(int k=0; k<solution.size(); k++){
                store.add(solution.get(k));
            }
        }
        System.out.println("STORE : " + store);
    }

    private void initData(){
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("Recyclerview");
        listDataHeader.add("Firebase");
        listDataHeader.add("Menu 3");

        List<String> title1 = new ArrayList<>();
        List<String> title2 = new ArrayList<>();
        List<String> title3 = new ArrayList<>();

        title1.add("Grid 2x2");
        title1.add("Grid 3x3");
        title1.add("Grid 3x3 Different Layout");
        title1.add("Profile Design");
        title1.add("Nested RecyclerView");
        title1.add("Profile Design 2");

        title2.add("RealTime Firebase");
        title2.add("FireStore");
        title2.add("OTP");

        title3.add("Sub Item 1");
        title3.add("Sub Item 2");
        title3.add("Sub Item 3");
        title3.add("Sub Item 4");

        listHash.put(listDataHeader.get(0), title1);
        listHash.put(listDataHeader.get(1), title2);
        listHash.put(listDataHeader.get(2), title3);
    }
}
