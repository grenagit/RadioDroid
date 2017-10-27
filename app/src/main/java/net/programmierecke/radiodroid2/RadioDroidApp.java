package net.programmierecke.radiodroid2;

import android.app.Application;

import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

public class RadioDroidApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Picasso.Builder builder = new Picasso.Builder(this);
        builder.downloader(new OkHttp3Downloader(this, Integer.MAX_VALUE));
        Picasso picassoInstance = builder.build();
        Picasso.setSingletonInstance(picassoInstance);

        CountryFlagsLoader.getInstance().load(this);
    }
}
