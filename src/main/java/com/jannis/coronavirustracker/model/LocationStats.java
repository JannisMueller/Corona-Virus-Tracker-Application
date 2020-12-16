package com.jannis.coronavirustracker.model;

public class LocationStats {

    private String state;
    private String country;
    private String latestTotalDeath;
    private String latestConfirmedCases;

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

    public String setLatestTotalDeath(String latestTotalDeath) {
        this.latestTotalDeath = latestTotalDeath;
        return latestTotalDeath;
    }


    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalDeath=" + latestTotalDeath +
                '}';
    }

    public String getLatestConfirmedCases() {
        return latestConfirmedCases;
    }

    public void setLatestConfirmedCases(String latestConfirmedCases) {
        this.latestConfirmedCases = latestConfirmedCases;
    }
}
