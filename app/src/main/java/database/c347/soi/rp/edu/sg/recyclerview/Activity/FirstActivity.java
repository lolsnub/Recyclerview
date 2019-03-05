package database.c347.soi.rp.edu.sg.recyclerview.Activity;

import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import database.c347.soi.rp.edu.sg.recyclerview.Model.Book;
import database.c347.soi.rp.edu.sg.recyclerview.R;
import database.c347.soi.rp.edu.sg.recyclerview.Adapter.RecyclerViewAdapter;

public class FirstActivity extends AppCompatActivity {

    List<Book> bookList;
    RecyclerView rvBookList;
    CoordinatorLayout clLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_first);

        setTitle(getIntent().getStringExtra("title"));

        rvBookList = (RecyclerView) findViewById(R.id.rvBookList);
        clLayout = (CoordinatorLayout) findViewById(R.id.clLayout);

        bookList = new ArrayList<>();

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

        init("Yukina", yukinaImage);
        init("Rinko", rinkoImage);
        init("Ako", akoImage);
        init("Lisa", lisaImage);
        init("Sayo", sayoImage);



//        bookList.add(new Book("Yukina 01", "Caregorie", "Description Book", R.drawable.y_image_01));
//        bookList.add(new Book("Yukina 02", "Caregorie", "Description Book", R.drawable.y_image_02));
//        bookList.add(new Book("Yukina 03", "Caregorie", "Description Book", R.drawable.y_image_03));
//        bookList.add(new Book("Yukina 04", "Caregorie", "Description Book", R.drawable.y_image_04));
//        bookList.add(new Book("Yukina 05", "Caregorie", "Description Book", R.drawable.y_image_05));
//
//        bookList.add(new Book("Yukina 06", "Caregorie", "Description Book", R.drawable.y_image_06));
//        bookList.add(new Book("Yukina 07", "Caregorie", "Description Book", R.drawable.y_image_07));
//        bookList.add(new Book("Yukina 08", "Caregorie", "Description Book", R.drawable.y_image_08));
//        bookList.add(new Book("Yukina 09", "Caregorie", "Description Book", R.drawable.y_image_09));
//        bookList.add(new Book("Yukina 10", "Caregorie", "Description Book", R.drawable.y_image_10));
//
//        bookList.add(new Book("Yukina 11", "Caregorie", "Description Book", R.drawable.y_image_11));
//        bookList.add(new Book("Yukina 12", "Caregorie", "Description Book", R.drawable.y_image_12));
//        bookList.add(new Book("Yukina 13", "Caregorie", "Description Book", R.drawable.y_image_13));
//        bookList.add(new Book("Yukina 14", "Caregorie", "Description Book", R.drawable.y_image_14));
//
//        bookList.add(new Book("Rinko 01", "Caregorie", "Description Book", R.drawable.rk_image_01));
//        bookList.add(new Book("Rinko 02", "Caregorie", "Description Book", R.drawable.rk_image_02));
//        bookList.add(new Book("Rinko 03", "Caregorie", "Description Book", R.drawable.rk_image_03));
//        bookList.add(new Book("Rinko 04", "Caregorie", "Description Book", R.drawable.rk_image_04));
//        bookList.add(new Book("Rinko 05", "Caregorie", "Description Book", R.drawable.rk_image_05));
//
//        bookList.add(new Book("Rinko 06", "Caregorie", "Description Book", R.drawable.rk_image_06));
//        bookList.add(new Book("Rinko 07", "Caregorie", "Description Book", R.drawable.rk_image_07));
//        bookList.add(new Book("Rinko 08", "Caregorie", "Description Book", R.drawable.rk_image_08));
//        bookList.add(new Book("Rinko 09", "Caregorie", "Description Book", R.drawable.rk_image_09));
//        bookList.add(new Book("Rinko 10", "Caregorie", "Description Book", R.drawable.rk_image_10));

        rvBookList.setHasFixedSize(true);
        rvBookList.setLayoutManager(new GridLayoutManager(this, 3));
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, bookList);
        rvBookList.setAdapter(myAdapter);
    }


    public void init(String title, int[] imgArray) {
        int count = 1;
        if (getIntent().getStringExtra("title").equals(title)) {
            for (int i = 0; i < imgArray.length; i++) {
                if (count < 10) {
                    bookList.add(new Book(title +" 0" + count, "Caregorie", "Description Book", imgArray[i]));
                } else {
                    bookList.add(new Book(title + " " + count, "Caregorie", "Description Book", imgArray[i]));
                }
                count++;
            }
        }
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
