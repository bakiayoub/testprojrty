package com.example.tpgqllery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;


public class ImageAdapter extends BaseAdapter {

    private Context mcontext;
    private Integer[] imageids = {R.drawable.image1, R.drawable.image2, R.drawable.image3};

    public ImageAdapter(Context mcontext) {
        this.mcontext = mcontext;
    }

    @Override
    public int getCount() {
        return imageids.length;
    }

    @Override
    public Object getItem(int position) {
        return imageids[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView i = new ImageView(mcontext);
        i.setImageResource((Integer) getItem(position));
        i.setLayoutParams(new Gallery.LayoutParams(250,250));
        i.setScaleType(ImageView.ScaleType.FIT_XY);
        return i;
    }
}
