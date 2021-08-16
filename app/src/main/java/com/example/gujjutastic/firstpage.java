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


public class firstpage extends AppCompatActivity implements View.OnClickListener {

    RecyclerView popularRecycler;
    PopularFoodAdapter popularFoodAdapter;
    Button  yourcart,next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);

        yourcart = findViewById(R.id.button3);
        next = findViewById(R.id.button2);
        next.setOnClickListener(this);
       
        yourcart.setOnClickListener(this);

        // now here we will add some dummy data to out model class

                List<PopularFood> popularFoodList = new ArrayList<>();
                List<PopularFood> asiaFoodList = new ArrayList<>();

                popularFoodList.add(new PopularFood("Dosa", "Rs:40.00","Masala Dosa,Plain Dosa along with chutney,aloo curry and sambar",R.drawable.dosa));
                popularFoodList.add(new PopularFood("Idly", "Rs:38.00","Idly along with chutney and sambar  ", R.drawable.idli));
                popularFoodList.add(new PopularFood("RavaIdly", "Rs:42.00","Rava Idly along with chutney and sambar", R.drawable.rava_idli));
                popularFoodList.add(new PopularFood("Vada", "Rs:33.00", "Vada along with chutney and sambar",R.drawable.vada));
                setPopularRecycler(popularFoodList);

                asiaFoodList.add(new PopularFood("Dhokla", "Rs:40.00", "Dhokla with green chutney and red chutney",R.drawable.dhokla));
                asiaFoodList.add(new PopularFood("Fafda", "Rs:40.00", "Fafda with papaya salad and green chutney",R.drawable.fafda));
                asiaFoodList.add(new PopularFood("Gathiya", "Rs:60.00", "Gathiya vanela with green chutney and red chutney",R.drawable.gathiya_vanela));
                asiaFoodList.add(new PopularFood("Khakhra", "Rs:50.00", "Masala Khakhra,Methi Khakhra,Plain Khakhra,Jeera Khakhra",R.drawable.khakhra));
                asiaFoodList.add(new PopularFood("Bhel", "Rs:35.00","Masala Bhel", R.drawable.bhel));
                asiaFoodList.add(new PopularFood("Handvo", "Rs:35.00", "Handvo along with curd chutney",R.drawable.handvo));
                asiaFoodList.add(new PopularFood("Samosa", "Rs:20.00", "Samosa with green and red chutney",R.drawable.samosa));
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
            Intent get_cart = new Intent(firstpage.this,your_cart.class);
            startActivity(get_cart);
        }
        else if (view == next)
        {
            Intent get_next = new Intent(firstpage.this, second_page.class);
            startActivity(get_next);
        }

    }

}
