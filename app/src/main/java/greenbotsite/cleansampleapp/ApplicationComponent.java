package greenbotsite.cleansampleapp;

import android.content.Context;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by gaurav on 10/1/17.
 */
@Singleton
@Component(modules = {ApplicationModule.class, ApiModule.class})
public interface ApplicationComponent {

    void inject(CleanSampleApplication target);

    Retrofit provideRetrofit();

    OkHttpClient provideOKclient();

    @Named(Constants.Injection.Named.FORECAST_API_KEY)
    String provideAPIKey();

    String provideBaseUrl();

    Context provideContext();

}
