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

public class fifth_page extends AppCompatActivity implements View.OnClickListener {


    RecyclerView popularRecycler;
    PopularFoodAdapter popularFoodAdapter;
    Button yourcart,next,previous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_page);

        yourcart = findViewById(R.id.button3);
        next = findViewById(R.id.button2);
        previous = findViewById(R.id.button4);
        previous.setOnClickListener(this);
        yourcart.setOnClickListener(this);


        // now here we will add some dummy data to out model class

        List<PopularFood> popularFoodList = new ArrayList<>();
        List<PopularFood> asia_FoodList = new ArrayList<>();


        popularFoodList.add(new PopularFood("Rasmali", "Rs:80.00","Rasmali is a popular and delicious Bengali sweet where lip-smacking cottage cheese balls are soaked in lusciously thick, sweetened milk.", R.drawable.rasmali));
        popularFoodList.add(new PopularFood("Carrot Hawla", "Rs:120.00", "Carrot Hawla is a slow cooked traditional indian pudding made by simmering carrots and milk.",R.drawable.carrot_hawla));
        popularFoodList.add(new PopularFood("Jalebi", "Rs:65.00", "Jalebi is one of the most popular desserts of India and is a spiralled dish. This crispy and crunchy dessert is dipped in suger syrup and is loaded with flavours.",R.drawable.jalebi));
        popularFoodList.add(new PopularFood("Chum Chum", "Rs:75.00", "Chumchum is one of the other Bengali delicacies apart from Rasgulla. It is made with lot of colorful stuffings and and garnishing.",R.drawable.chumchum));
        setPopularRecycler(popularFoodList);


        asia_FoodList.add(new PopularFood("Paneer Butter Masala", "Rs:120.00", "Paneer Butter Masala is one of the most popular paneer recipes in Indian cuisin.The perfect combination of spiciness and creaminess of its gravy and served with any Indian bread.",R.drawable.putter_butter_masla));
        asia_FoodList.add(new PopularFood("Vegetable Curry", "Rs:150.00","Mixed Vegetable curry for chapati,roti, poori or plain rice.", R.drawable.veg_curry));
        asia_FoodList.add(new PopularFood("Kofta Curry", "Rs:168.00", "Kofta curry is made either with paneer and potato or with veggies and served with roti or rice.",R.drawable.kota));
        setAsia_Recycler(asia_FoodList);
    }



    private void setPopularRecycler(List<PopularFood> popularFoodList ) {

        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this, popularFoodList );
        popularRecycler.setAdapter(popularFoodAdapter);

    }



    private void setAsia_Recycler(List<PopularFood>  asia_FoodList) {

        popularRecycler = findViewById(R.id.asia_recycler_);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this, asia_FoodList );
        popularRecycler.setAdapter(popularFoodAdapter);

    }





    @Override
    public void onClick(View view) {
      if  (view == yourcart){
            Intent get_cart = new Intent(fifth_page.this, your_cart.class);
            startActivity(get_cart);
        }

        else if (view == previous)
        {
            Intent get_next = new Intent(fifth_page.this, fourth_page.class);
            startActivity(get_next);
        }
    }

}






