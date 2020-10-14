package dzimmermann.tgm.dzimmermann_listviews;

public class Geoloc {

    private int lat;
    private int longi;

    public Geoloc(int lat, int longi) {
        setLat(lat);
        setLongi(longi);
    }

    public void setLat(int lat) {
        if(lat <= 90 && lat >= -90) {
            this.lat = lat;
        } else {
            //TODO: Better error handling right here ...
            throw new RuntimeException();
        }
    }

    public int getLat() {return lat;}
    public int getLongi() {return  longi;}

    public void setLongi(int longi) {
        if(lat <= 180 && lat >= -180) {
            this.longi = longi;
        } else {
            //TODO: Better error handling right here ...
            throw new RuntimeException();
        }
    }

    @Override
    public String toString() {
        if(lat >= 0) {
            if(longi >= 0) {
                return lat+"N"+longi+"E";
            } else {
                return lat+"N"+(Math.abs(longi))+"W";
            }
        } else {
            if(longi >= 0) {
                return Math.abs(lat)+"S"+longi+"E";
            } else {
                return Math.abs(lat)+"S"+Math.abs(longi)+"W";
            }
        }
    }
}
