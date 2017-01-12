package greenbotsite.cleansampleapp.airQuality;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import greenbotsite.cleansampleapp.ActivityScoped;
import greenbotsite.cleansampleapp.networking.AirQualityService;
import greenbotsite.cleansampleapp.networking.AirQualityServiceImpl;
import retrofit2.Retrofit;

/**
 * Created by gaurav on 11/1/17.
 */
@Module
public class AirQualityPresenterModule {

    private AirQualityContract.View mView;

    public AirQualityPresenterModule(AirQualityContract.View view) {
        this.mView = view;
    }

    @Provides
    @ActivityScoped
    AirQualityContract.View providesView() {
        return mView;
    }

    @Provides
    @ActivityScoped
    AirQualityService providesAirQualityService(Retrofit retrofit) {
        return new AirQualityServiceImpl(retrofit);
    }

}
