package com.music.library.classical;

import com.music.library.MusicTrack;

import java.util.Scanner;

public class ClassicalMusicTrack extends MusicTrack {
    private String composer;
    private String period;
    public ClassicalMusicTrack() {;}

    public ClassicalMusicTrack(String trackID, String title, String artist, double duration, String composer, String period) {
        super(trackID, title, artist, duration);
        this.composer = composer;
        this.period = period;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Track Id : ");
        setTrackID(sc.nextLine());
        System.out.println("Enter Title : ");
        setTitle(sc.nextLine());
        System.out.println("Enter Artist : ");
        setArtist(sc.nextLine());
        System.out.println("Enter Duration : ");
        setDuration(sc.nextDouble());
        System.out.println("Enter Composer : ");
        setComposer(sc.nextLine());
        System.out.println("Enter Period : ");
        setPeriod(sc.nextLine());

    }

    @Override
    public void display() {
        System.out.println("Track ID : " + getTrackID());
        System.out.println("Title : " + getTitle());
        System.out.println("Artist : " + getArtist());
        System.out.println("Duration : " + getDuration());
        System.out.println("Composer : " + getComposer());
        System.out.println("Period : " + getPeriod());

    }
    public double calculatePopularity() {
        double factor;

        switch (period) {
            case "Baroque":
                factor = 1.2;
                break;
            case "Classical":
                factor = 1.0;
                break;
            case "Romantic":
                factor = 1.5;
                break;
            default:
                factor = 1.0;
        }

        return getDuration() * factor * 10;
    }
    @Override
    public String toString() {
        return "ClassicalMusicTrack{" +
                "composer='" + composer + '\'' +
                ", period='" + period + '\'' +
                '}';
    }
}
