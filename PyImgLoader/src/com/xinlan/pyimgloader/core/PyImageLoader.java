package com.xinlan.pyimgloader.core;

import java.util.concurrent.locks.ReentrantLock;

import android.widget.ImageView;

/**
 * 
 * PyImageLoader
 * 
 * @author panyi
 * 
 */
public class PyImageLoader
{
    private static final ReentrantLock mLock = new ReentrantLock();
    private volatile static PyImageLoader instance;
    protected PyConfig mConfig;

    /**
     * ���ص���
     * 
     * @return
     */
    public static PyImageLoader getInstance()
    {
        if (instance == null)
        {
            mLock.lock();
            if (instance == null)
            {
                mLock.lock();
                instance = new PyImageLoader();
                mLock.unlock();
            }
            mLock.unlock();
        }
        return instance;
    }

    private PyImageLoader()
    {
    }

    public void init(PyConfig config)
    {
        mLock.lock();
        this.mConfig = config;
        
        mLock.unlock();
    }

    public void loadImage(String url, ImageView imageView)
    {
    }
}// end class
