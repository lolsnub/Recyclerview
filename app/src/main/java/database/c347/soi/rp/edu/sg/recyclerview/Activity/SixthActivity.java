package database.c347.soi.rp.edu.sg.recyclerview.Activity;

import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import database.c347.soi.rp.edu.sg.recyclerview.Adapter.RecyclerViewAdapterTrial_4_01;
import database.c347.soi.rp.edu.sg.recyclerview.Adapter.RecyclerViewAdapterTrial_4_02;
import database.c347.soi.rp.edu.sg.recyclerview.PostModel;
import database.c347.soi.rp.edu.sg.recyclerview.R;

public class SixthActivity extends AppCompatActivity {

    RecyclerView rvTrial01, rvTrial02;
    List<Integer> img;
    List<PostModel> alPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        setTitle(getIntent().getStringExtra("title"));
        actionBar.hide();
        setContentView(R.layout.trial_layout_4);

        rvTrial01 = (RecyclerView) findViewById(R.id.rvTrial01);
        rvTrial02 = (RecyclerView) findViewById(R.id.rvTrial02);


        img = new ArrayList<>();

        img.add(R.drawable.ako_image_01);
        img.add(R.drawable.ako_image_02);
        img.add(R.drawable.ako_image_03);
        img.add(R.drawable.ako_image_04);
        img.add(R.drawable.ako_image_05);
        img.add(R.drawable.ako_image_06);

        alPost = new ArrayList<>();
        alPost.add(new PostModel(R.drawable.sayo_image_01, "Sayo", "10.15am yesterday", "Quisque imperdiet nunc at massa dictum volupat. Etiam id orci ipsim. Integer id ex dignissim"));
        alPost.add(new PostModel(R.drawable.ako_image_02, "Ako", "just now", "Quisque imperdiet nunc at massa dictum volupat. Etiam id orci ipsim. Integer id ex dignissim \"Quisque imperdiet nunc at massa dictum volupat. Etiam id orci ipsim. Integer id ex dignissim\""));

        rvTrial01.setHasFixedSize(true);
        rvTrial01.setLayoutManager(new GridLayoutManager(this, 3));
        RecyclerViewAdapterTrial_4_01 myAdapter = new RecyclerViewAdapterTrial_4_01(this, img);
        rvTrial01.setAdapter(myAdapter);

        rvTrial02.setHasFixedSize(true);
        rvTrial02.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        RecyclerViewAdapterTrial_4_02 myAdapter2 = new RecyclerViewAdapterTrial_4_02(this, alPost);
        rvTrial02.setAdapter(myAdapter2);

        ViewCompat.setNestedScrollingEnabled(rvTrial01, false);
        ViewCompat.setNestedScrollingEnabled(rvTrial02, false);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
