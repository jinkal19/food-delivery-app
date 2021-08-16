package com.example.gujjutastic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class second_page extends AppCompatActivity implements View.OnClickListener {

    RecyclerView popularRecycler;
    PopularFoodAdapter popularFoodAdapter;
    Button yourcart,next,previous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);


            yourcart = findViewById(R.id.button3);
            next = findViewById(R.id.button2);
            previous = findViewById(R.id.button4);
            next.setOnClickListener(this);
            previous.setOnClickListener(this);
            yourcart.setOnClickListener(this);


            // now here we will add some dummy data to out model class

            List<PopularFood> popularFoodList = new ArrayList<>();
            List<PopularFood> asiaFoodList = new ArrayList<>();
            List<PopularFood> asia_FoodList = new ArrayList<>();
            List<PopularFood> asia_Food_List = new ArrayList<>();


            popularFoodList.add(new PopularFood("Apple Juice", "Rs:30.00", "Apple Juice is a fruit juice made by the maceration and pressing of an apple.",R.drawable.fruit1));
            popularFoodList.add(new PopularFood("Orange Juice", "Rs.30.00","Orange Juice is a liquid extract of the orange tree fruit, produced by squeezing or reaming oranges.", R.drawable.fruit2));
            popularFoodList.add(new PopularFood("PinappleJuice", "Rs:30.00", "Pineapple Juice is a liquid made from pressing the natural liquid from the pulp of te pineapple tropical plant.",R.drawable.fruit3));
            popularFoodList.add(new PopularFood("Lime Juice", "Rs:20.00", "Lime Juice may be squeezed from fresh limes or purchased in bottles in both unsweetened and sweetened varieties.",R.drawable.lime));
            popularFoodList.add(new PopularFood("Lassi ", "Rs:45.00","Lassi is a popular traditional dahi based drink that originated in the Punjab region. Lassi is a blend of yogurt,water, spices and sometime fruit. Namkeen lassi is similar to doogh, while sweet and mango lassi are like milkshakes.", R.drawable.lassi));
            popularFoodList.add(new PopularFood("ButterMilk ", "Rs:35.00", "Butter Mil is fermented dairy drink.",R.drawable.butter_milk));
            popularFoodList.add(new PopularFood("Soft Drinks", "Rs:45.00", "Soft Drink isa drink that usually contains water,a sweeetener and natural or artifical flavoring.",R.drawable.soft_drinks));
            popularFoodList.add(new PopularFood("Mineral Water", "Rs:25.00", "Mineral water is water from a mineral spring that contains various minerals, such as salts and sulfur compounds.",R.drawable.mineral_water));
            setPopularRecycler(popularFoodList);


        asia_Food_List.add(new PopularFood("Falooda", "Rs:40.00", "A falooda is a South Asian version of cold dessert made with noodles",R.drawable.falooda));
        asia_Food_List.add(new PopularFood("Special Falooda", "Rs:55.00","A Special Falooda consists of vermicelli,roohafza or rose syrup,khus syrup,sabja seeds,custrad,chopped fruits,jellies,nuts.", R.drawable.splfalooda));
        asia_Food_List.add(new PopularFood("Kesar Falooda", "Rs:65.00", "Kesar Falooda is a delicious multi layered dessert made with milk,falooda sev,sabja seeds topped with icecream and tutti-fruitti.",R.drawable.faloodake));
        asia_Food_List.add(new PopularFood("Royal Falooda", "Rs:70.00", "Royal Falooda consists of sabja seeds, vermicelli,jelly, ice-cream, fruits and nuts.",R.drawable.royalfalooda));

        setAsiaRecycler(asia_Food_List);
        }



        private void setPopularRecycler(List<PopularFood> popularFoodList ) {

            popularRecycler = findViewById(R.id.popular_recycler);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
            popularRecycler.setLayoutManager(layoutManager);
            popularFoodAdapter = new PopularFoodAdapter(this, popularFoodList );
            popularRecycler.setAdapter(popularFoodAdapter);

        }


        private void setAsiaRecycler(List<PopularFood>  asiaFoodList) {

            popularRecycler = findViewById(R.id.asia_recycler);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
            popularRecycler.setLayoutManager(layoutManager);
            popularFoodAdapter = new PopularFoodAdapter(this, asiaFoodList );
            popularRecycler.setAdapter(popularFoodAdapter);

        }



    @Override
    public void onClick(View view) {

      if  (view == yourcart){
            Intent get_cart = new Intent(second_page.this, your_cart.class);
            startActivity(get_cart);
        }
        else if (view == next)
        {
            Intent get_next = new Intent(second_page.this, third_page.class);
            startActivity(get_next);
        }
        else if (view == previous)
        {
            Intent get_next = new Intent(second_page.this, firstpage.class);
            startActivity(get_next);
        }
    }

    }

