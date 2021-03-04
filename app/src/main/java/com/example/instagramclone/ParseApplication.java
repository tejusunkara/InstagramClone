package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        //Register parse models
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Z7vjQyYbJvgpiKdN21aIDk64NDLhE7fK1I4Goyx8")
                .clientKey("eDdISlDCwGSJlbdHrTQSpvFaRBtkPZg44ZpQfbm7")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
