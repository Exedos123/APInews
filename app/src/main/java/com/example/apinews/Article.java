package com.example.apinews;

import com.google.gson.annotations.SerializedName;

public class Article {

    @SerializedName("author")
    private String Author;

    @SerializedName("title")
    private String Title;

    @SerializedName("description")
    private String Description;


    //private List<SourceJeevan> source;


    public String getAuthor() {
        return Author;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

  
}



