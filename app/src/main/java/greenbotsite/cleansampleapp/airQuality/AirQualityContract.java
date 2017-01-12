package greenbotsite.cleansampleapp.airQuality;

import greenbotsite.cleansampleapp.BasePresenter;
import greenbotsite.cleansampleapp.BaseView;

/**
 * Created by gaurav on 10/1/17.
 */

public interface AirQualityContract {

    interface View extends BaseView{

        void showProgress();

        void hideProgress();

        void showLoadingError();

        void bindAirQualityDesc(String name);

        void bindCountry(String name);

    }


    interface Presenter extends BasePresenter{

    }

}
