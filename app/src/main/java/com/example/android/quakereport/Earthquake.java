package com.example.android.quakereport;

/**
 * An {@link Earthquake} object contains information related to a single earthquake.
 */
public class Earthquake {

    /** Magnitude of the earthquake */
    private double mMagnitude;

    /** Location of the earthquake */
    private String mLocation;

    /** Time of the earthquake */
    private long mTimeInMilimeters;

    /** url of the earthquake */
    private String mUrlEarthquake;


    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the location where the earthquake happened
     * @param timeInMilimeters is the time and date of the fake Earthquake when the
     *                           earthquake happened
     * @param urlEarthquake is the url where the earthquake happened
     */

    public Earthquake(String location, double magnitude,  long timeInMilimeters, String urlEarthquake) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilimeters = timeInMilimeters;
        mUrlEarthquake = urlEarthquake;
    }

    /**
     * Returns the magnitude of the earthquake.
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Returns the location of the earthquake.
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilimeters() {
        return mTimeInMilimeters;
    }

    /**
     * Returns the url of the earthquake.
     */
    public String getUrl() {
        return mUrlEarthquake;
    }

}
