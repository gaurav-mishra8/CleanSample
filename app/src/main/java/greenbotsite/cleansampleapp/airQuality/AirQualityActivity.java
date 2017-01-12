package greenbotsite.cleansampleapp.airQuality;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import greenbotsite.cleansampleapp.CleanSampleApplication;
import greenbotsite.cleansampleapp.R;

/**
 * Created by gaurav on 10/1/17.
 */

public class AirQualityActivity extends AppCompatActivity implements AirQualityContract.View {

    @Inject
    AirQualityPresenter airQualityPresenter;

    private ProgressDialog progressDialog;

    @BindView(R.id.country_name)
    TextView countryName;

    @BindView(R.id.country_desc)
    TextView countryDesc;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        AirQualityPresenterComponent component = DaggerAirQualityPresenterComponent.builder()
                .applicationComponent(((CleanSampleApplication) getApplication()).getDaggerApplicationComponent())
                .airQualityPresenterModule(new AirQualityPresenterModule(this))
                .build();

        component.inject(this);

    }

    @Override
    protected void onResume() {
        super.onResume();
        airQualityPresenter.start();
    }

    @Override
    public void setPresenter(Object presenter) {
        // not required here using DI
    }

    @Override
    public void showProgress() {

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage(getString(R.string.fetching_air_quality_data));
        progressDialog.setTitle(R.string.please_wait);
        progressDialog.setCancelable(false);
        progressDialog.show();

    }

    @Override
    public void hideProgress() {

        if (progressDialog != null && progressDialog.isShowing())
            progressDialog.dismiss();

    }

    @Override
    public void showLoadingError() {

    }

    @Override
    public void bindAirQualityDesc(String desc) {
        countryDesc.setText(desc);
    }

    @Override
    public void bindCountry(String name) {
        countryName.setText(name);
    }

}
