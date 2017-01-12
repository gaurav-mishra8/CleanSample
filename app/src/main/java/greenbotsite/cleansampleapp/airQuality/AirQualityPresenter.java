package greenbotsite.cleansampleapp.airQuality;

import android.content.Context;
import android.widget.Toast;

import java.util.Observable;

import javax.inject.Inject;

import greenbotsite.cleansampleapp.ActivityScoped;
import greenbotsite.cleansampleapp.R;
import greenbotsite.cleansampleapp.model.AirQuality;
import greenbotsite.cleansampleapp.networking.AirQualityApi;
import greenbotsite.cleansampleapp.networking.AirQualityService;
import greenbotsite.cleansampleapp.networking.AirQualityServiceImpl;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

/**
 * Created by gaurav on 10/1/17.
 */

public class AirQualityPresenter implements AirQualityContract.Presenter, AirQualityServiceImpl.AirQualityFetchResult {

    private AirQualityContract.View mView;

    @Inject
    AirQualityService airQualityService;

    @Inject
    Context context;

    @Inject
    AirQualityPresenter(AirQualityContract.View view) {
        this.mView = view;
    }


    @Override
    public void start() {
        mView.showProgress();
        airQualityService.getAirQualityData("40.7324296", "-73.9977264", this);
    }

    @Override
    public void onAirQualityFetchSuccess(AirQuality airQuality) {
        mView.hideProgress();
        mView.bindAirQualityDesc(airQuality.getBreezometerDescription());
        mView.bindCountry(airQuality.getCountryName());
    }

    @Override
    public void onAirQualityFetchFailure() {
        Toast.makeText(context, R.string.failure_fetching_air_quality, Toast.LENGTH_LONG).show();
    }
}
