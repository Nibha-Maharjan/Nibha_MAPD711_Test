package com.example.nibha_mapd711_test

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    //Initialize Shared Pref and textviews
    private lateinit var sharedPrefs: SharedPreferences
    private lateinit var text1 : TextView
    private lateinit var text2 : TextView
    private lateinit var text3 : TextView
    private lateinit var text4 : TextView
    private lateinit var text5 : TextView
    private lateinit var text6 : TextView
    private lateinit var text7 : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        //Page title
        title = "Watch Buying Helper App"
        //Share pref init
        sharedPrefs = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        //AssignValue
        text1 = findViewById(R.id.textView2)
        text2 = findViewById(R.id.textView3)
        text3 = findViewById(R.id.textView4)
        text4 = findViewById(R.id.textView9)
        text5 = findViewById(R.id.textView10)
        text6 = findViewById(R.id.textView11)
        text7 = findViewById(R.id.textView12)

        //Get Value from sharedPref and Intent
        val isCheck = sharedPrefs.getString("check","")
        val spinnerDetail = sharedPrefs.getString("spin", "")
        val sizeDet = intent.getStringExtra("size")
        val loopDet = intent.getStringExtra("loop")
        val tradeDet = intent.getStringExtra("trade")
        //Text 1 & 2
        text1.text=spinnerDetail
        text2.text= "$sizeDet + $loopDet + $tradeDet"
        //Loops to put the values to the Design
        //Loops are a bit too much but i copy pasted
        if (spinnerDetail == "Apple Watch Series 9 - $550"){
            val price = 500
            text3.text = "The price of watch you selected: "+ price
            if (sizeDet == "41 mm"){
                val sizePrice = 50
                text4.text = "Price for the Size: "+sizePrice
                if (loopDet == "Nike Sports Loop"){
                    val loopPrice = 50
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the loop: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the loop: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }else if (loopDet == "Bridon Single Tour"){
                    val loopPrice = 60
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }else{
                    val loopPrice = 70
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }
            }else{
                val sizePrice = 100
                text4.text = "Price for the Size: "+sizePrice
                if (loopDet == "Nike Sports Loop"){
                    val loopPrice = 50
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the loop: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the loop: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }else if (loopDet == "Bridon Single Tour"){
                    val loopPrice = 60
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }else{
                    val loopPrice = 70
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }
            }
        } else if (spinnerDetail == "Apple Watch Ultra 2 - $1100"){
            val price = 1100
            text3.text = "The price of watch you selected: "+ price
            if (sizeDet == "41 mm"){
                val sizePrice = 50
                text4.text = "Price for the Size: "+sizePrice
                if (loopDet == "Nike Sports Loop"){
                    val loopPrice = 50
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the loop: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the loop: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }else if (loopDet == "Bridon Single Tour"){
                    val loopPrice = 60
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }else{
                    val loopPrice = 70
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }
            }else{
                val sizePrice = 100
                text4.text = "Price for the Size: "+sizePrice
                if (loopDet == "Nike Sports Loop"){
                    val loopPrice = 50
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the loop: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the loop: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }else if (loopDet == "Bridon Single Tour"){
                    val loopPrice = 60
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }else{
                    val loopPrice = 70
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }
            }
        }else if (spinnerDetail == "Apple Watch SE  - $300"){
            val price = 300
            text3.text = "The price of watch you selected: "+ price
            if (sizeDet == "41 mm"){
                val sizePrice = 50
                text4.text = "Price for the Size: "+sizePrice
                if (loopDet == "Nike Sports Loop"){
                    val loopPrice = 50
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the loop: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the loop: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }else if (loopDet == "Bridon Single Tour"){
                    val loopPrice = 60
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }else{
                    val loopPrice = 70
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }
            }else{
                val sizePrice = 100
                text4.text = "Price for the Size: "+sizePrice
                if (loopDet == "Nike Sports Loop"){
                    val loopPrice = 50
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the loop: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the loop: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }else if (loopDet == "Bridon Single Tour"){
                    val loopPrice = 60
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }else{
                    val loopPrice = 70
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }
            }
        }
        else if (spinnerDetail == "Apple Watch Nike - $400"){
            val price = 400
            text3.text = "The price of watch you selected: "+ price
            if (sizeDet == "41 mm"){
                val sizePrice = 50
                text4.text = "Price for the Size: "+sizePrice
                if (loopDet == "Nike Sports Loop"){
                    val loopPrice = 50
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the loop: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the loop: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }else if (loopDet == "Bridon Single Tour"){
                    val loopPrice = 60
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }else{
                    val loopPrice = 70
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }
            }else{
                val sizePrice = 100
                text4.text = "Price for the Size: "+sizePrice
                if (loopDet == "Nike Sports Loop"){
                    val loopPrice = 50
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the loop: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the loop: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }else if (loopDet == "Bridon Single Tour"){
                    val loopPrice = 60
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }else{
                    val loopPrice = 70
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }
            }
        }else if (spinnerDetail == "Apple Watch Hermes - $1700"){
            val price = 1700
            text3.text = "The price of watch you selected: "+ price
            if (sizeDet == "41 mm"){
                val sizePrice = 50
                text4.text = "Price for the Size: "+sizePrice
                if (loopDet == "Nike Sports Loop"){
                    val loopPrice = 50
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the loop: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the loop: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }else if (loopDet == "Bridon Single Tour"){
                    val loopPrice = 60
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }else{
                    val loopPrice = 70
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }
            }else{
                val sizePrice = 100
                text4.text = "Price for the Size: "+sizePrice
                if (loopDet == "Nike Sports Loop"){
                    val loopPrice = 50
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the loop: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the loop: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }else if (loopDet == "Bridon Single Tour"){
                    val loopPrice = 60
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }else{
                    val loopPrice = 70
                    text5.text = "Price for the loop: "+loopPrice
                    if (tradeDet == "Trade"){
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }else{
                        val tradePrice = 50
                        text6.text = "Price for the Trade: "+tradePrice
                        val total = (price+sizePrice+loopPrice)-tradePrice
                        text7.text = "Total Price: "+total
                    }
                }
            }
        }


        if (isCheck == "true"){
            val wv = findViewById<View>(R.id.webContent) as WebView
            //enabling Javascript
            wv.settings.javaScriptEnabled

            //loading the URL
            wv.loadUrl("https://www.apple.com/ca/")}else{

        }
    }
}