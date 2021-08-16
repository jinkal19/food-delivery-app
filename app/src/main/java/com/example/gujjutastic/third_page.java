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

public class third_page extends AppCompatActivity implements View.OnClickListener {

    RecyclerView popularRecycler;
    PopularFoodAdapter popularFoodAdapter;
    Button yourcart,next,previous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);


        yourcart = findViewById(R.id.button3);
        next = findViewById(R.id.button2);
        previous = findViewById(R.id.button4);
        next.setOnClickListener(this);
        previous.setOnClickListener(this);
        yourcart.setOnClickListener(this);


        // now here we will add some dummy data to out model class

        List<PopularFood> popularFoodList = new ArrayList<>();
        List<PopularFood> asia_FoodList = new ArrayList<>();



        popularFoodList.add(new PopularFood("Gujarati Thali", "Rs:120.00","A Gujarati Thali typically comprises of one or two steamed or fried snacks,a green vegetable, a tuber or a gourd shaak,a kathol,dahi, kadhi,raita or sweet shrikhand,rice or khichdi, daal,sweets like halwas,basundi or shrikhand and roti or puri.", R.drawable.gujarati_summer_thali));
        popularFoodList.add(new PopularFood("NorthIndian Thali", "Rs:110.00","A North Indian Thali comprises of rice,flatbread of some kind,dal or kadhi,paneer or mushroom,aloo or some other vegetable,raita or salad,mithai and some fried fritter.", R.drawable.noth_indian_thali));
        popularFoodList.add(new PopularFood("SouthIndian Thali", "Rs:150.00", "A South Indian Thali consists of white rice, sambar or kalambu, rasam,pumpkin kootu,potato fry, carrot kosumari,medu vadai,fried papad,curd,mango pickle,akkaravadisal (south indian sweet).",R.drawable.south_indian_thali));
        popularFoodList.add(new PopularFood("Kutch Thali", "Rs:180.00", "A Kutch Thali consists of bahra roti with ghee and gud,bhakri with homemade makhan,an ringna no olo and some moog dal vada with meethi chutney,khuchdi with lehsun-micrhi,khaari bhaat and tamatar sev. ",R.drawable.kutch_thali));
        setPopularRecycler(popularFoodList);

        asia_FoodList.add(new PopularFood("Butterscotch Ice-Cream", "Rs:40.00", "Butterscotch ice-cream is made with cream and it has crunchy praline swirled into it.",R.drawable.ice1));
        asia_FoodList.add(new PopularFood("Candy", "Rs:55.00", "All Candy Flavours are raspberry,mango,bella candy,panak candy,kulfi candy,choco dream,choco nutz,orange,pineapple,grape,badam milk candy",R.drawable.ice2));
        asia_FoodList.add(new PopularFood("Cone", "Rs:35.00", "All Cone Flavours are raspberry,mango,bella candy,panak candy,kulfi candy,choco dream,choco nutz,orange,pineapple,grape,cotton candy cone.",R.drawable.ice3));
        asia_FoodList.add(new PopularFood("Stir-fried ice cream", "Rs:75.00","Stir-fried ice cream is sweetened frozen dessert,made using milk,cream and sugars as well as other added ingredients to increase the flavour.", R.drawable.ice4));
        asia_FoodList.add(new PopularFood("Stir-fried ice cream", "Rs:75.00", "Stir-fried ice cream is sweetened frozen dessert,made using milk,cream and sugars as well as other added ingredients to increase the flavour.",R.drawable.ice5));
        asia_FoodList.add(new PopularFood("Sundae", "Rs:65.00", "Sundae ice cream consists of one or more scoops of ice cream topped with sauce or syrup and in some cases other toppings such as: sprinkles,whipped cream,marshmallows,peanuts,maraschino cherries or other fruits.",R.drawable.ice_cream));
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
            Intent get_cart = new Intent(third_page.this, your_cart.class);
            startActivity(get_cart);
        }
        else if (view == next)
        {
            Intent get_next = new Intent(third_page.this, fourth_page.class);
            startActivity(get_next);
        }
        else if (view == previous)
        {
            Intent get_next = new Intent(third_page.this, second_page.class);
            startActivity(get_next);
        }
    }
}

