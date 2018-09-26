package com.example.android.order;

import android.icu.text.NumberFormat;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;


import android.icu.text.NumberFormat;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/





/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */

    int quantity = 2;
    int price = 10;
    String s1;

    public void submitOrder(View view) {

        int price = calculatePrice();
        String message = createOrderSummary(price);
        displayMessage(message);
    }

    private int calculatePrice()
    {
        int price = quantity*5;
        return price;
    }

    private String check_me()
    {
        boolean s;
        CheckBox c = (CheckBox) findViewById(R.id.notify_me_checkbox);
        if (c.isChecked()== true )
        {
            s = true;
            s1 = "true" ;
        }

        else
        {
            s = false;
            s1 = "false";
        }

        return s1;
    }

    private String createOrderSummary(int price)
    {
        String s = "Name: Kaptain Kunal" +  "\n" + "Add whipped cream? " + s1 + "\n" +  "Quantity: " + quantity + "\n"  + "Total: " + price +  "Thank you!" ;
        return s;
    }
    /**
     * This method displays the given price on the screen.
     */
    @RequiresApi(api = Build.VERSION_CODES.N)
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
        priceTextView.setText("" + "$" + number);}
    /**
     * This method displays the given quantity value on the screen.
     */

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
    public void increment(View view){

        quantity++;

        display(quantity);


    }

    public void decrement(View view){

        quantity--;

        display(quantity);

    }


    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);


        quantityTextView.setText("" + number);




    }
}