package com.xinlan.pyimgloader.cache.memory;

import android.graphics.Bitmap;

/**
 * �ڴ滺�����ʵ��
 * @author panyi
 *
 */
public class BaseMemoryCache implements IMemoryCache
{

    @Override
    public boolean put(String key, Bitmap value)
    {
        return false;
    }

    @Override
    public Bitmap get(String key)
    {
        return null;
    }

    @Override
    public Bitmap remove(String key)
    {
        return null;
    }

    @Override
    public void clear()
    {
        
    }

}//end class
