package greenbotsite.cleansampleapp.airQuality;

import dagger.Component;
import greenbotsite.cleansampleapp.ActivityScoped;
import greenbotsite.cleansampleapp.ApplicationComponent;

/**
 * Created by gaurav on 11/1/17.
 */
@ActivityScoped
@Component(dependencies = ApplicationComponent.class, modules = AirQualityPresenterModule.class)
public interface AirQualityPresenterComponent {
    void inject(AirQualityActivity target);
}
