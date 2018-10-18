package com.example.android.newsapp;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;

public class NewsAdapter extends ArrayAdapter<News> {


    private static final String LOG_TAG = NewsAdapter.class.getSimpleName();


    public NewsAdapter(Activity context, ArrayList<News> songs) {

        super(context, 0, songs);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }
        News currentNews = getItem(position);

        String originalLocation = currentNews.getmnewsTitle();
        String authorName = currentNews.getmAuthor();

        String sectionName = currentNews.getmSection();

        String time1 = currentNews.getmnewsTime();

        TextView primaryLocationView = (TextView) listItemView.findViewById(R.id.title_news);
        primaryLocationView.setText(originalLocation);

        TextView authorView = (TextView) listItemView.findViewById(R.id.author);
        authorView.setText(authorName);

        TextView sectionView = (TextView) listItemView.findViewById(R.id.section_name);
        sectionView.setText(sectionName);

        // ImageView imageView = (ImageView)listItemView.findViewById(R.id.image);
        //imageView.setImageResource(currentNews.getmImage());

        TextView dateView = (TextView) listItemView.findViewById(R.id.date);

        dateView.setText(time1);

        return listItemView;

    }

}


