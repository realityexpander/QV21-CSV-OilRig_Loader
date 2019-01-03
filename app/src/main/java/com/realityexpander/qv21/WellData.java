package com.realityexpander.qv21;

/**
 * Created by Chris Athanas on 1/2/19.
 */
public class WellData {

    private String owner;
    private String api;
    private String longitude;
    private String latitude;
    private String property;
    private String wellName;

    @Override
    public String toString() {
        return "WellData{" +
                "owner='" + owner + '\'' +
                ", leaseName='" + api + "'" +
                ", tankName='" + longitude + "'" +
                ", tankNum='" + latitude + "'" +
                ", property='" + property + "'" +
                ", wellName='" + wellName + "'" +
                '}';
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getWellName() {
        return wellName;
    }

    public void setWellName(String wellName) {
        this.wellName = wellName;
    }
}


