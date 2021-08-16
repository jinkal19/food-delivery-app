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

public class fourth_page extends AppCompatActivity implements View.OnClickListener {

    RecyclerView popularRecycler;
    PopularFoodAdapter popularFoodAdapter;
    Button  yourcart,next,previous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_page);


        yourcart = findViewById(R.id.button3);
        previous = findViewById(R.id.button4);
        next = findViewById(R.id.button2);
        next.setOnClickListener(this);
        previous.setOnClickListener(this);
        yourcart.setOnClickListener(this);

        // now here we will add some dummy data to out model class

        List<PopularFood> popularFoodList = new ArrayList<>();
        List<PopularFood> asiaFoodList = new ArrayList<>();




        popularFoodList.add(new PopularFood("Roti ", "Rs:80.00", "Roti is simplest bread that is made everyday in Indian households.It is made with only 2 ingredients-atta (wheat flour) and water",R.drawable.roti));
        popularFoodList.add(new PopularFood("Thepla", "Rs:70.00", "Thepla are flavorful flatbread that are made with spices,herbs,yogurt,whole wheat flour and millet flours.",R.drawable.thepla));
        popularFoodList.add(new PopularFood("Paratha", "Rs:90.00", "Paratha are flatbread made with onion,chili pepper,ghee,garam masala,cumin salt,chili powder and whole wheat flour.",R.drawable.paratha));
        popularFoodList.add(new PopularFood("Aloo Paratha", "Rs:110.00", "Aloo Paratha are indian breakfast flatbread made with whole wheat flour,mashed potatoes,spices and herbs",R.drawable.aloo_paratha));
        setPopularRecycler(popularFoodList);

        asiaFoodList.add(new PopularFood("Basmti Rice", "Rs:50.00","Like all rice, Basmti rice is availabe in brown and white,with the white version produced by removing the bran from the brown version.", R.drawable.basmthi_rice));
        asiaFoodList.add(new PopularFood("Vegetable Pulao", "Rs:80.00","Vegetable palao is a basic Indian style rice pilaf that is aromatic,delicious,healthy and super quick to make for a meal.", R.drawable.vegg_pullav));
        asiaFoodList.add(new PopularFood("Vegetable Biryani", "Rs:110.00", "Vegetable Biryani is an authentic Indian vegetarian recipe pack full of your favorite rice,veggies and spices.",R.drawable.veg_biryani));
        asiaFoodList.add(new PopularFood("Curd Rice", "Rs:60.00","Curd Rice is a south indian dish made with precooked rice, curd(yogurt) and tempering spices.It is often eaten with a podi,papad,pickle.", R.drawable.curd_rice));
        asiaFoodList.add(new PopularFood("White Rice", "Rs:65.00", "White Rice is precooked rice served with dal,sambhar.",R.drawable.white_rice));
        setAsiaRecycler(asiaFoodList);



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
            Intent get_cart = new Intent(fourth_page.this, your_cart.class);
            startActivity(get_cart);
        }
        else if (view == next){
            Intent get_cart = new Intent(fourth_page.this, fifth_page.class);
            startActivity(get_cart);
        }
        else if (view == previous)
        {
            Intent get_next = new Intent(fourth_page.this, third_page.class);
            startActivity(get_next);
        }
    }
}

