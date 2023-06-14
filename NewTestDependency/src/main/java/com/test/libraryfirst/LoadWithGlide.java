package com.test.libraryfirst;


import javax.naming.Context;
import javax.swing.text.html.ImageView;

public class LoadWithGlide {

    public static Context mContext;
    public static LoadWithGlide loadImgWithGlide = new LoadWithGlide();


    public static LoadWithGlide getContext(Context context){
        mContext = context;
        return loadImgWithGlide;
    }

    public static Context getmContext(){
        return mContext;
    }


    public void LoadImageWithPlaceHolder(final ImageView imageView , String url/* , int width, int height*/){

       /* Glide.with(mContext)
                .load(url)
               // .placeholder(R.drawable.placeholder)
                //.apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE))
               // .error(R.drawable.placeholder)
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                //.crossFade().diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .into(imageView);*/

    }


    public void loadPlaceHolder(ImageView imageView,int width, int height){

        /*Glide.with(mContext)
                //.load(R.drawable.placeholder)
                //.placeholder(R.drawable.placeholder)
                .centerCrop()
                .apply(new RequestOptions().override(width, height))
                //.apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE))
               // .error(R.drawable.placeholder)
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                //.crossFade().diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .into(imageView);*/
    }

}




