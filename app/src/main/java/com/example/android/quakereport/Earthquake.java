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
    private String mTimeInfakeFormat;


    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the location where the earthquake happened
     * @param timeInfakeFormat is the time and date of the fake Earthquake when the
     *                           earthquake happened
     */
    public Earthquake(String location, double magnitude,  String timeInfakeFormat) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInfakeFormat = timeInfakeFormat;

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
    public String getTimeInfakeFormat() {
        return mTimeInfakeFormat;
    }

}
