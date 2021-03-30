package com.example.tugas_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvAnime;
    private ArrayList<Anime> list = new ArrayList<>();
    private String title = "Daftar Anime Mode List";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvAnime = findViewById(R.id.rv_anime);
        rvAnime.setHasFixedSize(true);

        list.addAll(AnimesData.getListData());
        showRecyclerList();

    }

    private void showRecyclerList(){
        rvAnime.setLayoutManager(new LinearLayoutManager(this));
        ListAnimeAdapter listAnimeAdapater = new ListAnimeAdapter((list));
        rvAnime.setAdapter(listAnimeAdapater);

        listAnimeAdapater.setOnItemClickCallback(new ListAnimeAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Anime data) {
                showSelectedAnime(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode (int selectedMode){
        switch (selectedMode){
            case R.id.action_list:
                title = "Daftar Anime Mode List";
                showRecyclerList();
                break;

            case R.id.action_grid:
                title = "Daftar Anime Mode Grid";
                showRecyclerGrid();
                break;

            case R.id.action_cardview:
                title = "Daftar Anime Mode CardView";
                showRecyclerCardView();
                break;
        }
        setActionBarTitle(title);
    }

    private void showRecyclerGrid(){
        rvAnime.setLayoutManager(new GridLayoutManager(this, 2));
        GridAnimeAdapter gridAnimeAdapter = new GridAnimeAdapter(list);
        rvAnime.setAdapter(gridAnimeAdapter);

        gridAnimeAdapter.setOnItemClickCallback((new GridAnimeAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Anime data) {
                showSelectedAnime(data);
            }
        }));
    }

    private void showRecyclerCardView(){
        rvAnime.setLayoutManager((new LinearLayoutManager(this)));
        CardViewAnimeAdapter cardViewAnimeAdapter = new CardViewAnimeAdapter(list);
        rvAnime.setAdapter(cardViewAnimeAdapter);
    }

    private void setActionBarTitle(String title){
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle(title);
        }
    }

    private void showSelectedAnime(Anime anime){
        Toast.makeText(this, "Kame memilih " + anime.getName(),Toast.LENGTH_SHORT).show();
    }
}