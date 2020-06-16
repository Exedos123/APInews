package com.example.apinews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.List;
import java.util.concurrent.Callable;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {
    private TextView myPosts_View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myPosts_View = findViewById(R.id.textView_one);

        //calling




        Retrofit baseurl = new Retrofit.Builder()
                .baseUrl("https://newsapi.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        News endpnt = baseurl.create(News.class);



        Call<MyNews> calling = endpnt.getMyArticles();




        calling.enqueue(new Callback<MyNews>() {
            @Override
            public void onResponse(Call<MyNews> call, Response<MyNews> response) {


                MyNews cardTotal = response.body();


                String mattr = "";
                mattr += "Total Results :" + cardTotal.getTotalResults() + "\n";
                myPosts_View.append(mattr);

//secodn lvel


         //       List<Article> articleList = response.body().getArticles();



                List<Article> card = response.body().getArticles();

                for (Article i : card) {
                    String matter = "";

                  //  matter += "Name :"+ i.getAuthor()+"\n";
                      matter += "author :" + i.getAuthor() + "\n";

                     matter += "title :" + i.getTitle() + "\n";
                     matter += "description :" + i.getDescription() + "\n\n";

                    myPosts_View.append(matter);
                }


// third level
        //        List<Article> card = response.body().getArticles().getSourceJeevan();






            }

            @Override
            public void onFailure(Call<MyNews> call, Throwable t) {

                myPosts_View.setText("Poindi"+t.getMessage());
            }
        });
/*
        calling.enqueue(new Callback<List<MyNews>>() {
            @Override
            public void onResponse(Call<List<MyNews>> call, Response<List<MyNews>> response) {


                List<MyNews> card = response.body();

                for (MyNews i : card) {
                    String matter = "";

                    matter += "Name :"+ i.getSource()+"\n";
                 //   matter += "author :" + i.getAuthor() + "\n";

                 //   matter += "title :" + i.getTitle() + "\n";
                 //   matter += "description :" + i.getDescription() + "\n\n";

                    myPosts_View.append(matter);
                }
            }

            @Override
            public void onFailure(Call<List<MyNews>> call, Throwable t) {
                    myPosts_View.setText("IDi Kuda poindi"+t.getMessage());
            }
        });

*/

    //    https://medium.com/@sraju432/news-application-using-retrofit-2-be8d052c7aca


    }



    /*
    ////STEPS:

    1. Android Manifest - internet access
    2. Build gradle -
        Retrofit


        GsonCOnverter

    3. create a interface
        crate required clasees for all the required response fields
        geenrate get/set methods

    4. MainActivit
        .. build baseurl
            baseurl.endpoint
            call endpoint

            start " Enqueue"
            diplays results








    */
}



