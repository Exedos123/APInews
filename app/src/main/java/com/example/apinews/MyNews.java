package com.example.apinews;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MyNews {

    @SerializedName("totalResults")
    private String TotalResults;


    @SerializedName("articles")
    private List<Article> articles = null;






    public String getTotalResults() {
        return TotalResults;
    }

    public List<Article> getArticles() {
        return articles;
    }
}

    /*


/*
"author": "Jack Morse",
"title": "J.K. Rowling is four cocktails in and talking trash about Bitcoin",
"description": "J.K. Rowling has been drinking a lot and you'd better believe she has some thoughts on Bitcoin.\nNoted TERF and author of The Cuckoo’s Calling, Rowling decided Friday was the perfect time to learn about the cryptocurrency Bitcoin. And so, like any celebrity wh…",
"url": "https://mashable.com/article/jk-rowling-asked-twitter-about-bitcoin/",
"urlToImage": "https://mondrian.mashable.com/2020%252F05%252F16%252Fed%252F65127486efd14faea068927124f3b1ee.253ab.jpg%252F1200x630.jpg?signature=XjJ4aqKaX56MW5k29Zn1ygz0Evc=",
"publishedAt": "2020-05-16T00:34:00Z",
"content": "J.K. Rowling has been drinking a lot and you'd better believe she has some thoughts on Bitcoin.\r\nNotedTERF and author of The Cuckoos Calling, Rowlingdecided Friday was the perfect time to learn about… [+2124 chars]"



 */


    /*
    elements-1
    element -
        elemetn 1.1
        element 1.2
            element 1.2.1
            element 1.2.2



     */