package com.example.android.newsapp;

public class News {

    private String mnewsTitle;
    private String mnewsTime;
    private String mUrl;
    private String mAuthor;
    private String mSection;
    // private String mImage;

    public News(String newstitle, String time, String url, String author, String section) {

        mnewsTitle = newstitle;
        mnewsTime = time;
        mUrl = url;
        mAuthor = author;
        mSection = section;
        //  mImage = image;
    }

   /* public String getmImage() {
        return mImage;
    }*/


    public String getmSection() {
        return mSection;
    }

    public String getmnewsTitle() {
        return mnewsTitle;
    }

    public String getmnewsTime() {
        return mnewsTime;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getmAuthor() {
        return mAuthor;
    }
}
