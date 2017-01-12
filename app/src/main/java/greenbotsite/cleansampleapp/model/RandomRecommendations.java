
package greenbotsite.cleansampleapp.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RandomRecommendations implements Parcelable
{

    @SerializedName("children")
    @Expose
    private String children;
    @SerializedName("sport")
    @Expose
    private String sport;
    @SerializedName("health")
    @Expose
    private String health;
    @SerializedName("inside")
    @Expose
    private String inside;
    @SerializedName("outside")
    @Expose
    private String outside;
    public final static Creator<RandomRecommendations> CREATOR = new Creator<RandomRecommendations>() {


        @SuppressWarnings({
            "unchecked"
        })
        public RandomRecommendations createFromParcel(Parcel in) {
            RandomRecommendations instance = new RandomRecommendations();
            instance.children = ((String) in.readValue((String.class.getClassLoader())));
            instance.sport = ((String) in.readValue((String.class.getClassLoader())));
            instance.health = ((String) in.readValue((String.class.getClassLoader())));
            instance.inside = ((String) in.readValue((String.class.getClassLoader())));
            instance.outside = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public RandomRecommendations[] newArray(int size) {
            return (new RandomRecommendations[size]);
        }

    }
    ;

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getInside() {
        return inside;
    }

    public void setInside(String inside) {
        this.inside = inside;
    }

    public String getOutside() {
        return outside;
    }

    public void setOutside(String outside) {
        this.outside = outside;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(children);
        dest.writeValue(sport);
        dest.writeValue(health);
        dest.writeValue(inside);
        dest.writeValue(outside);
    }

    public int describeContents() {
        return  0;
    }

}
