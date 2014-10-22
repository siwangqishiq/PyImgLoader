package com.xinlan.pyimgloader;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends Activity
{
    
    public static final String[] urls = Constants.images;
    private LayoutInflater mInflater;
    private ListView mListView;

//    DisplayImageOptions options = new DisplayImageOptions.Builder()
//            .showImageOnLoading(R.drawable.ic_launcher) // resource or
//            .cacheInMemory(true) // default
//            .cacheOnDisk(true) // default
//            .bitmapConfig(Bitmap.Config.ARGB_8888) // default
//            .displayer(new SimpleBitmapDisplayer()) // default
//            .build();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        mInflater = LayoutInflater.from(this);

        mListView = (ListView) findViewById(R.id.main_list);
        mListView.setAdapter(new ImageListAdapter());
    }

    private final class ImageListAdapter extends BaseAdapter
    {
        private ViewHolder holder;

        @Override
        public int getCount()
        {
            return urls.length;
        }

        @Override
        public Object getItem(int position)
        {
            return position;
        }

        @Override
        public long getItemId(int position)
        {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent)
        {
            if (convertView == null)
            {
                holder = new ViewHolder();
                convertView = mInflater.inflate(R.layout.item_image, null);
                holder.img = (ImageView) convertView.findViewById(R.id.img);
                convertView.setTag(holder);
            }
            else
            {
                holder = (ViewHolder) convertView.getTag();
            }
            String url = urls[position];
            //ImageLoader.getInstance().displayImage(url, holder.img,options,null,null);
            return convertView;
        }
    }// end inner class

    private static class ViewHolder
    {
        ImageView img;
    }
}//end class
