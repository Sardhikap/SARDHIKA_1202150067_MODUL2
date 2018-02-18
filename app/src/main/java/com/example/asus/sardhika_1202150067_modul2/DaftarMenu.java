package com.example.asus.sardhika_1202150067_modul2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DaftarMenuAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> Menu;
    private ArrayList<String> Price;
    private ArrayList<Integer> Gambar;

    //Daftar Menu
    private String[] menu = {"Mie Kuah", "Ice Cream Chery", "Pizza",
            "Burger", "Tea", "Salad"};
    //Daftar Harga
    private String[] price = {"8.000", "5.000", "12.000", "15.000", "3.000", "7.000"};
    //Daftar Gambar
    private int[] image = {R.drawable.miebaso, R.drawable.icecream, R.drawable.pizza, R.drawable.burger, R.drawable.tea,
            R.drawable.salad};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        Menu = new ArrayList<>();
        Price = new ArrayList<>();
        Gambar = new ArrayList<>();

        recyclerView= findViewById(R.id.my_recycler_view);
        DaftarItem();

        layoutManager = new LinearLayoutManager(this); // Layout Manager,  Membuat List Secara Vertical
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new DaftarMenuAdapter(Menu, Price, Gambar);

        recyclerView.setAdapter(adapter); //Memasang Adapter pada RecyclerView
    }

    private void DaftarItem() {
        for (int w=0; w<menu.length; w++){
            Gambar.add(image[w]);
            Menu.add(menu[w]);
            Price.add(price[w]);
        }
    }
}