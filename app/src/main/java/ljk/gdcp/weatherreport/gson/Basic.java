package ljk.gdcp.weatherreport.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/6/16 0016.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
