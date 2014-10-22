package com.xinlan.pyimgloader.cache.memory;

import android.graphics.Bitmap;

/**
 * �ڴ滺��ӿ�
 * @author panyi
 *
 */
public interface IMemoryCache
{
    /**
     * ��Key-Bitmap
     * ���뻺��
     * @param key
     * @param value
     * @return
     */
    boolean put(String key, Bitmap value);

    /**
     * ����Key ȡ��Bitmap
     * @param key
     * @return
     */
    Bitmap get(String key);

    /**
     * ����Keyɾ��Bitmap
     * @param key
     * @return
     */
    Bitmap remove(String key);

    /**
     * ��ջ���
     */
    void clear();
}
