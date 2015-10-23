package com.example.aaaaa_000.wouldyourather;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseObject;
import com.parse.ParseUser;


public class StarterApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        // Register Questions Class
        ParseObject.registerSubclass(Questions.class);

        // Add your initialization code here
        Parse.initialize(this, "yjgCZgP8DGAZHHtQgmvUNJhDGqAFCaU39K4WylTv", "DqDABgWXnbAEJA7qsaNPxgxk9bWlMEPmtDURlUTj");

        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();
        // Optionally enable public read access.
        // defaultACL.setPublicReadAccess(true);
        ParseACL.setDefaultACL(defaultACL, true);
    }
}
