package com.example.administrator.mygreendao;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2017-12-07 0007.
 */
public class Appliction extends Application {
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        GreenDaoHelper.initDatabase();
    }
}
