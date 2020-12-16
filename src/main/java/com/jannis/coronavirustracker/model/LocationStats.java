package com.jannis.coronavirustracker.model;

public class LocationStats {

    private String state;
    private String country;
    private String latestTotalDeath;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLatestTotalDeath() {
        return latestTotalDeath;
    }

    public void setLatestTotalDeath(String latestTotalDeath) {
        this.latestTotalDeath = latestTotalDeath;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalDeath=" + latestTotalDeath +
                '}';
    }
}
