package greenbotsite.cleansampleapp;

import android.content.Context;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import greenbotsite.cleansampleapp.BuildConfig;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by gaurav on 10/1/17.
 */
@Module
@Singleton
public class ApiModule {

    private static final String BASE_URL = "https://api.breezometer.com/baqi/";


    @Provides
    @Named(Constants.Injection.Named.FORECAST_API_KEY)
    String provideAPIKey(Context context) {
        return context.getString(R.string.api_key);
    }

    @Provides
    String provideBaseUrl(@Named(Constants.Injection.Named.FORECAST_API_KEY) String key) {
        return BASE_URL + "?key=" + key;
    }

    @Provides
    OkHttpClient provideOkHttpClient() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(BuildConfig.DEBUG ? HttpLoggingInterceptor.Level.BODY : HttpLoggingInterceptor.Level.NONE);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .build();

        return okHttpClient;
    }

    @Provides
    Retrofit provideRetrofitClient(String baseUrl, OkHttpClient okHttpClient) {
        return new Retrofit.Builder().baseUrl(baseUrl)
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


}
