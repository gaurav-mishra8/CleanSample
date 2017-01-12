package greenbotsite.cleansampleapp.networking;


/**
 * Created by gaurav on 10/1/17.
 */

public interface AirQualityService {

    void getAirQualityData(String latitude, String longitude, AirQualityServiceImpl.AirQualityFetchResult airQualityFetchResult);

}
