package greenbotsite.cleansampleapp.networking;

import greenbotsite.cleansampleapp.model.AirQuality;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by gaurav on 10/1/17.
 */

public interface AirQualityApi {

    @GET("./?key=2edf0f97446541669eb364fba4da6e46")
    Observable<AirQuality> getAirQuality(@Query("lat") String latitiude, @Query("lon") String longitude);

}
