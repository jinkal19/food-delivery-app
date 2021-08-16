package com.example.gujjutastic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class details extends AppCompatActivity implements View.OnClickListener {
    TextView quantity;
    int totalQuantity = 1;
    int totalprice =0;
    ImageView img;
    TextView des_food,food_name,price;
    Button addtoCart;
    ImageView additem,removeitem;
    PopularFood object;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details2);

        img = (ImageView)findViewById(R.id.food_image1);
        des_food = (TextView)findViewById(R.id.des_food);
        food_name = (TextView)findViewById(R.id.food_name);
        price = (TextView)findViewById(R.id.price);
        addtoCart = (Button)findViewById(R.id.add_to_cart);
        additem = (ImageView)findViewById(R.id.add);
        removeitem = (ImageView)findViewById(R.id.remove);
        quantity = (TextView)findViewById(R.id.quantity);

        img.setImageResource(getIntent().getIntExtra("imageUrl",0));
        food_name.setText(getIntent().getStringExtra("name"));
        des_food.setText(getIntent().getStringExtra("des"));
        price.setText(getIntent().getStringExtra("price"));

        addtoCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent get_next = new Intent(details.this,your_cart.class);
                startActivity(get_next);
            }
        });


        additem.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (totalQuantity < 10 ){
                    totalQuantity++;
                    quantity.setText((String.valueOf(totalQuantity)));
                }
            }
        });

        removeitem.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (totalQuantity > 1 ){
                    totalQuantity--;
                    quantity.setText((String.valueOf(totalQuantity)));
                }
            }
        });
    }


    @Override
    public void onClick(View view) {

        }
    }
