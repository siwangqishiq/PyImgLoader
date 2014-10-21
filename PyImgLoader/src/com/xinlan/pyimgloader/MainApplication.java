
package com.xinlan.pyimgloader;

import android.app.Application;
import android.content.Context;

public class MainApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        initPyImageLoader(getApplicationContext());
    }

    public static void initPyImageLoader(Context context)
    {
            
//        // This configuration tuning is custom. You can tune every option, you
//        // may tune some of them,
//        // or you can create default configuration by
//        // ImageLoaderConfiguration.createDefault(this);
//        // method.
//        File cacheDir = StorageUtils.getCacheDirectory(context);
//        System.out.println("dir--->"+cacheDir.getAbsolutePath());
//        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(context)
//                .memoryCacheExtraOptions(480, 800) // default = device screen dimensions
//                .threadPoolSize(4) // default
//                .threadPriority(Thread.NORM_PRIORITY - 1) // default
//                .tasksProcessingOrder(QueueProcessingType.FIFO) // default
//                .denyCacheImageMultipleSizesInMemory()
//                .memoryCache(new WeakMemoryCache())
//                .memoryCacheSize(2 * 1024 * 1024)
//                .memoryCacheSizePercentage(13) // default
//                .diskCache(new UnlimitedDiskCache(cacheDir)) // default
//                .imageDownloader(new BaseImageDownloader(context)) // default
//                .imageDecoder(new BaseImageDecoder(false)) // default
//                .defaultDisplayImageOptions(DisplayImageOptions.createSimple()) // default
//                .writeDebugLogs()
//                .build();
////        
////        
////        ImageLoaderConfiguration defaultConfig = ImageLoaderConfiguration
////                .createDefault(context);
//        // ImageLoaderConfiguration config = new
//        // ImageLoaderConfiguration.Builder(context)
//        // .threadPriority(Thread.NORM_PRIORITY - 2)
//        // .denyCacheImageMultipleSizesInMemory()
//        // .diskCacheFileNameGenerator(new Md5FileNameGenerator())
//        // .diskCacheSize(50 * 1024 * 1024) // 50 Mb
//        // .tasksProcessingOrder(QueueProcessingType.LIFO)
//        // .writeDebugLogs() // Remove for release app
//        // .build();
//        ImageLoader.getInstance().init(config);
//        // Initialize ImageLoader with configuration.
//        // ImageLoader.getInstance().init(
//        // ImageLoaderConfiguration.createDefault(context));
    }

}
