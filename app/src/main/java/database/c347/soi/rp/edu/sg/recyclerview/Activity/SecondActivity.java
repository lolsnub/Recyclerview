package database.c347.soi.rp.edu.sg.recyclerview.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import database.c347.soi.rp.edu.sg.recyclerview.Model.Book;
import database.c347.soi.rp.edu.sg.recyclerview.R;
import database.c347.soi.rp.edu.sg.recyclerview.Adapter.RecycleViewAdapter2;

public class SecondActivity extends AppCompatActivity {

    List<Book> bookList;
    RecyclerView rvBookList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        setTitle(getIntent().getStringExtra("title"));
        setContentView(R.layout.activity_second);

        rvBookList = (RecyclerView) findViewById(R.id.rvBookList);

        bookList = new ArrayList<>();

        bookList.add(new Book("Yukina 01", "Caregorie", "Description Book", R.drawable.y_image_01));
        bookList.add(new Book("Yukina 02", "Caregorie", "Description Book", R.drawable.y_image_02));
        bookList.add(new Book("Yukina 03", "Caregorie", "Description Book", R.drawable.y_image_03));
        bookList.add(new Book("Yukina 04", "Caregorie", "Description Book", R.drawable.y_image_04));
        bookList.add(new Book("Yukina 05", "Caregorie", "Description Book", R.drawable.y_image_05));

        bookList.add(new Book("Yukina 06", "Caregorie", "Description Book", R.drawable.y_image_06));
        bookList.add(new Book("Yukina 07", "Caregorie", "Description Book", R.drawable.y_image_07));
        bookList.add(new Book("Yukina 08", "Caregorie", "Description Book", R.drawable.y_image_08));
        bookList.add(new Book("Yukina 09", "Caregorie", "Description Book", R.drawable.y_image_09));
        bookList.add(new Book("Yukina 10", "Caregorie", "Description Book", R.drawable.y_image_10));

        bookList.add(new Book("Yukina 11", "Caregorie", "Description Book", R.drawable.y_image_11));
        bookList.add(new Book("Yukina 12", "Caregorie", "Description Book", R.drawable.y_image_12));
        bookList.add(new Book("Yukina 13", "Caregorie", "Description Book", R.drawable.y_image_13));
        bookList.add(new Book("Yukina 14", "Caregorie", "Description Book", R.drawable.y_image_14));
        bookList.add(new Book("Yukina 15", "Caregorie", "Description Book", R.drawable.y_image_01));

        RecycleViewAdapter2 myAdapter = new RecycleViewAdapter2(this, bookList);
        rvBookList.setHasFixedSize(true);
        rvBookList.setLayoutManager(new GridLayoutManager(this, 3));
        rvBookList.setAdapter(myAdapter);
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
