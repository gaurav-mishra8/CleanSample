package greenbotsite.cleansampleapp;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by gaurav on 10/1/17.
 */
@Module
@Singleton
public class ApplicationModule {

    private Context context;

    public ApplicationModule(Application application) {
        context = application;
    }

    @Provides
    Context providesContext() {
        return context;
    }

    @Provides
    SharedPreferences providesSharedPref(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Provides
    LayoutInflater providesLayoutInflator(Context context) {
        return LayoutInflater.from(context);
    }

}
