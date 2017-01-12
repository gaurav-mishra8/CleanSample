package greenbotsite.cleansampleapp;

import android.app.Application;

import greenbotsite.cleansampleapp.airQuality.AirQualityContract;

/**
 * Created by gaurav on 10/1/17.
 */

public class CleanSampleApplication extends Application {

    private ApplicationComponent daggerApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        daggerApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .apiModule(new ApiModule())
                .build();
    }


    public ApplicationComponent getDaggerApplicationComponent() {
        return daggerApplicationComponent;
    }

}
