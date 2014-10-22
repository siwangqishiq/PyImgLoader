package com.xinlan.pyimgloader.cache.disc;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import android.graphics.Bitmap;

/**
 * ´ÅÅÌ»º´æ½Ó¿Ú 
 * ´æÖüÍøÂçÏÂÔØµÄÍ¼Æ¬
 * @author panyi
 *
 */
public interface IDiskCache
{
    File getDirectory();
    
    File get(String imageUri);

    boolean save(String imageUri, InputStream imageStream) throws IOException;
    
    boolean save(String imageUri, Bitmap bitmap) throws IOException;
    
    boolean remove(String imageUri);

    void close();

    void clear();
}//end class
