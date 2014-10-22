package com.xinlan.pyimgloader.cache.memory;

import android.graphics.Bitmap;

/**
 * 内存缓存接口
 * @author panyi
 *
 */
public interface IMemoryCache
{
    /**
     * 将Key-Bitmap
     * 放入缓存
     * @param key
     * @param value
     * @return
     */
    boolean put(String key, Bitmap value);

    /**
     * 根据Key 取得Bitmap
     * @param key
     * @return
     */
    Bitmap get(String key);

    /**
     * 根据Key删除Bitmap
     * @param key
     * @return
     */
    Bitmap remove(String key);

    /**
     * 清空缓存
     */
    void clear();
}
