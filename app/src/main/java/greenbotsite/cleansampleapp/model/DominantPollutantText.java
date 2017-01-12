
package greenbotsite.cleansampleapp.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DominantPollutantText implements Parcelable
{

    @SerializedName("main")
    @Expose
    private String main;
    @SerializedName("effects")
    @Expose
    private String effects;
    @SerializedName("causes")
    @Expose
    private String causes;
    public final static Creator<DominantPollutantText> CREATOR = new Creator<DominantPollutantText>() {


        @SuppressWarnings({
            "unchecked"
        })
        public DominantPollutantText createFromParcel(Parcel in) {
            DominantPollutantText instance = new DominantPollutantText();
            instance.main = ((String) in.readValue((String.class.getClassLoader())));
            instance.effects = ((String) in.readValue((String.class.getClassLoader())));
            instance.causes = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public DominantPollutantText[] newArray(int size) {
            return (new DominantPollutantText[size]);
        }

    }
    ;

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getEffects() {
        return effects;
    }

    public void setEffects(String effects) {
        this.effects = effects;
    }

    public String getCauses() {
        return causes;
    }

    public void setCauses(String causes) {
        this.causes = causes;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(main);
        dest.writeValue(effects);
        dest.writeValue(causes);
    }

    public int describeContents() {
        return  0;
    }

}
