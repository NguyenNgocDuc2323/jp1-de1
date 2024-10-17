package com.music.library;

public abstract class MusicTrack {
    private String trackID;
    private String title;
    private String artist;
    private double duration;
    public MusicTrack(){;}
    public MusicTrack(String trackID, String title, String artist, double duration) {
        this.trackID = trackID;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTrackID() {
        return trackID;
    }

    public void setTrackID(String trackID) {
        this.trackID = trackID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public abstract void input();
    public abstract void display();

    @Override
    public String toString() {
        return "MusicTrack{" +
                "trackID='" + trackID + '\'' +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                '}';
    }
}
