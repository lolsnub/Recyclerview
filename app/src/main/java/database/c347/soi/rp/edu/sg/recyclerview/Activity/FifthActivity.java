package database.c347.soi.rp.edu.sg.recyclerview.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;

import database.c347.soi.rp.edu.sg.recyclerview.Adapter.VerticalRecyclerViewAdapter;
import database.c347.soi.rp.edu.sg.recyclerview.HorizontalModel;
import database.c347.soi.rp.edu.sg.recyclerview.R;
import database.c347.soi.rp.edu.sg.recyclerview.VerticalModel;

public class FifthActivity extends AppCompatActivity {

    RecyclerView rvList;
    VerticalRecyclerViewAdapter adapter;
    ArrayList<VerticalModel> arrayListVertical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        setTitle(getIntent().getStringExtra("title"));
        setContentView(R.layout.activity_fifth);

        arrayListVertical = new ArrayList<>();
        rvList = (RecyclerView) findViewById(R.id.rvList);
        rvList.setHasFixedSize(true);

        rvList.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        adapter = new VerticalRecyclerViewAdapter(this, arrayListVertical);
        rvList.setAdapter(adapter);
        setData();
    }

    private void setData(){

        String[] verticalList = {"Yukina", "Sayo", "Lisa", "Ako", "Rinko"};

        int[] yukinaImage = {R.drawable.y_image_01, R.drawable.y_image_02, R.drawable.y_image_03, R.drawable.y_image_04,R.drawable.y_image_05,
                R.drawable.y_image_06, R.drawable.y_image_07, R.drawable.y_image_08, R.drawable.y_image_09, R.drawable.y_image_10, R.drawable.y_image_11,
                R.drawable.y_image_12, R.drawable.y_image_13, R.drawable.y_image_14 };
        int[] rinkoImage = {R.drawable.rk_image_01, R.drawable.rk_image_02, R.drawable.rk_image_03, R.drawable.rk_image_04, R.drawable.rk_image_05,
                R.drawable.rk_image_06, R.drawable.rk_image_07, R.drawable.rk_image_08, R.drawable.rk_image_09, R.drawable.rk_image_10};
        int[] sayoImage = {R.drawable.sayo_image_01, R.drawable.sayo_image_02, R.drawable.sayo_image_03, R.drawable.sayo_image_04, R.drawable.sayo_image_05,
                R.drawable.sayo_image_06, R.drawable.sayo_image_07, R.drawable.sayo_image_08, R.drawable.sayo_image_09, R.drawable.sayo_image_10};
        int[] akoImage = {R.drawable.ako_image_01, R.drawable.ako_image_02, R.drawable.ako_image_03, R.drawable.ako_image_04, R.drawable.ako_image_05,
                R.drawable.ako_image_06, R.drawable.ako_image_07, R.drawable.ako_image_08, R.drawable.ako_image_09, R.drawable.ako_image_10};
        int[] lisaImage = {R.drawable.lisa_image_01, R.drawable.lisa_image_02, R.drawable.lisa_image_03, R.drawable.lisa_image_04, R.drawable.lisa_image_05,
                R.drawable.lisa_image_06, R.drawable.lisa_image_07, R.drawable.lisa_image_08, R.drawable.lisa_image_09, R.drawable.lisa_image_10,
                R.drawable.lisa_image_11, R.drawable.lisa_image_12};


        for(int i=0; i<verticalList.length; i++){
            if(verticalList[i].equals("Yukina")){
                easyWay(verticalList[i], yukinaImage);
            } else if(verticalList[i].equals("Rinko")){
                easyWay(verticalList[i], rinkoImage);
            } else if(verticalList[i].equals("Sayo")){
                easyWay(verticalList[i], sayoImage);
            } else if(verticalList[i].equals("Ako")){
                easyWay(verticalList[i], akoImage);
            } else if(verticalList[i].equals("Lisa")){
                easyWay(verticalList[i], lisaImage);
            }
        }
        adapter.notifyDataSetChanged();
    }

    private void easyWay(String name, int[] imgArray){
        VerticalModel verticalModel = new VerticalModel();
        verticalModel.setTitle(name);
        ArrayList<HorizontalModel> arrayListHorizontal = new ArrayList<>();
        int k = 1;
        for(int j=0; j<imgArray.length; j++){
            HorizontalModel horizontalModel = new HorizontalModel();
            if(k<9){
                horizontalModel.setName(name + " : 0" +k);
            } else {
                horizontalModel.setName(name + " : " +k);
            }
            horizontalModel.setDescription("Description: " +j);
            horizontalModel.setImg(imgArray[j]);
            arrayListHorizontal.add(horizontalModel);
            k++;
        }
        verticalModel.setArrayList(arrayListHorizontal);
        arrayListVertical.add(verticalModel);
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
