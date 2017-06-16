package ljk.gdcp.weatherreport.gson;

/**
 * Created by Administrator on 2017/6/16 0016.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
