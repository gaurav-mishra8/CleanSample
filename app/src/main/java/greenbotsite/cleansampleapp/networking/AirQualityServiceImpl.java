package greenbotsite.cleansampleapp.networking;

import greenbotsite.cleansampleapp.model.AirQuality;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

/**
 * Created by gaurav on 10/1/17.
 */

public class AirQualityServiceImpl implements AirQualityService {

    private AirQualityApi airQualityApi;

    public interface AirQualityFetchResult {

        void onAirQualityFetchSuccess(AirQuality airQuality);

        void onAirQualityFetchFailure();

    }

    public AirQualityServiceImpl(Retrofit retrofit) {
        airQualityApi = retrofit.create(AirQualityApi.class);
    }


    public void getAirQualityData(String latitude, String longitude, final AirQualityFetchResult resultListener) {
        airQualityApi.getAirQuality(latitude, longitude)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DisposableObserver<AirQuality>() {
                    @Override
                    public void onNext(AirQuality airQuality) {
                        resultListener.onAirQualityFetchSuccess(airQuality);
                    }

                    @Override
                    public void onError(Throwable e) {
                        resultListener.onAirQualityFetchFailure();
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

}
