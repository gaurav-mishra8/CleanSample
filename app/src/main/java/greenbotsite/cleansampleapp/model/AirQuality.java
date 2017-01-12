
package greenbotsite.cleansampleapp.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AirQuality implements Parcelable
{

    @SerializedName("datetime")
    @Expose
    private String datetime;
    @SerializedName("country_name")
    @Expose
    private String countryName;
    @SerializedName("breezometer_aqi")
    @Expose
    private Integer breezometerAqi;
    @SerializedName("breezometer_color")
    @Expose
    private String breezometerColor;
    @SerializedName("breezometer_description")
    @Expose
    private String breezometerDescription;
    @SerializedName("country_aqi")
    @Expose
    private Integer countryAqi;
    @SerializedName("country_aqi_prefix")
    @Expose
    private String countryAqiPrefix;
    @SerializedName("country_color")
    @Expose
    private String countryColor;
    @SerializedName("country_description")
    @Expose
    private String countryDescription;
    @SerializedName("data_valid")
    @Expose
    private Boolean dataValid;
    @SerializedName("key_valid")
    @Expose
    private Boolean keyValid;
    @SerializedName("random_recommendations")
    @Expose
    private RandomRecommendations randomRecommendations;
    @SerializedName("dominant_pollutant_canonical_name")
    @Expose
    private String dominantPollutantCanonicalName;
    @SerializedName("dominant_pollutant_description")
    @Expose
    private String dominantPollutantDescription;
    @SerializedName("dominant_pollutant_text")
    @Expose
    private DominantPollutantText dominantPollutantText;
    public final static Creator<AirQuality> CREATOR = new Creator<AirQuality>() {


        @SuppressWarnings({
            "unchecked"
        })
        public AirQuality createFromParcel(Parcel in) {
            AirQuality instance = new AirQuality();
            instance.datetime = ((String) in.readValue((String.class.getClassLoader())));
            instance.countryName = ((String) in.readValue((String.class.getClassLoader())));
            instance.breezometerAqi = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.breezometerColor = ((String) in.readValue((String.class.getClassLoader())));
            instance.breezometerDescription = ((String) in.readValue((String.class.getClassLoader())));
            instance.countryAqi = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.countryAqiPrefix = ((String) in.readValue((String.class.getClassLoader())));
            instance.countryColor = ((String) in.readValue((String.class.getClassLoader())));
            instance.countryDescription = ((String) in.readValue((String.class.getClassLoader())));
            instance.dataValid = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            instance.keyValid = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            instance.randomRecommendations = ((RandomRecommendations) in.readValue((RandomRecommendations.class.getClassLoader())));
            instance.dominantPollutantCanonicalName = ((String) in.readValue((String.class.getClassLoader())));
            instance.dominantPollutantDescription = ((String) in.readValue((String.class.getClassLoader())));
            instance.dominantPollutantText = ((DominantPollutantText) in.readValue((DominantPollutantText.class.getClassLoader())));
            return instance;
        }

        public AirQuality[] newArray(int size) {
            return (new AirQuality[size]);
        }

    }
    ;

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Integer getBreezometerAqi() {
        return breezometerAqi;
    }

    public void setBreezometerAqi(Integer breezometerAqi) {
        this.breezometerAqi = breezometerAqi;
    }

    public String getBreezometerColor() {
        return breezometerColor;
    }

    public void setBreezometerColor(String breezometerColor) {
        this.breezometerColor = breezometerColor;
    }

    public String getBreezometerDescription() {
        return breezometerDescription;
    }

    public void setBreezometerDescription(String breezometerDescription) {
        this.breezometerDescription = breezometerDescription;
    }

    public Integer getCountryAqi() {
        return countryAqi;
    }

    public void setCountryAqi(Integer countryAqi) {
        this.countryAqi = countryAqi;
    }

    public String getCountryAqiPrefix() {
        return countryAqiPrefix;
    }

    public void setCountryAqiPrefix(String countryAqiPrefix) {
        this.countryAqiPrefix = countryAqiPrefix;
    }

    public String getCountryColor() {
        return countryColor;
    }

    public void setCountryColor(String countryColor) {
        this.countryColor = countryColor;
    }

    public String getCountryDescription() {
        return countryDescription;
    }

    public void setCountryDescription(String countryDescription) {
        this.countryDescription = countryDescription;
    }

    public Boolean getDataValid() {
        return dataValid;
    }

    public void setDataValid(Boolean dataValid) {
        this.dataValid = dataValid;
    }

    public Boolean getKeyValid() {
        return keyValid;
    }

    public void setKeyValid(Boolean keyValid) {
        this.keyValid = keyValid;
    }

    public RandomRecommendations getRandomRecommendations() {
        return randomRecommendations;
    }

    public void setRandomRecommendations(RandomRecommendations randomRecommendations) {
        this.randomRecommendations = randomRecommendations;
    }

    public String getDominantPollutantCanonicalName() {
        return dominantPollutantCanonicalName;
    }

    public void setDominantPollutantCanonicalName(String dominantPollutantCanonicalName) {
        this.dominantPollutantCanonicalName = dominantPollutantCanonicalName;
    }

    public String getDominantPollutantDescription() {
        return dominantPollutantDescription;
    }

    public void setDominantPollutantDescription(String dominantPollutantDescription) {
        this.dominantPollutantDescription = dominantPollutantDescription;
    }

    public DominantPollutantText getDominantPollutantText() {
        return dominantPollutantText;
    }

    public void setDominantPollutantText(DominantPollutantText dominantPollutantText) {
        this.dominantPollutantText = dominantPollutantText;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(datetime);
        dest.writeValue(countryName);
        dest.writeValue(breezometerAqi);
        dest.writeValue(breezometerColor);
        dest.writeValue(breezometerDescription);
        dest.writeValue(countryAqi);
        dest.writeValue(countryAqiPrefix);
        dest.writeValue(countryColor);
        dest.writeValue(countryDescription);
        dest.writeValue(dataValid);
        dest.writeValue(keyValid);
        dest.writeValue(randomRecommendations);
        dest.writeValue(dominantPollutantCanonicalName);
        dest.writeValue(dominantPollutantDescription);
        dest.writeValue(dominantPollutantText);
    }

    public int describeContents() {
        return  0;
    }

}
