package com.music.library.pop;

import com.music.library.MusicTrack;

import java.util.Scanner;

public class PopMusicTrack extends MusicTrack {
    private int chartPosition;
    private int releaseYear;
    public PopMusicTrack(){;}

    public PopMusicTrack(String trackID, String title, String artist, double duration, int chartPosition, int releaseYear) {
        super(trackID, title, artist, duration);
        this.chartPosition = chartPosition;
        this.releaseYear = releaseYear;
    }

    public int getChartPosition() {
        return chartPosition;
    }

    public void setChartPosition(int chartPosition) {
        this.chartPosition = chartPosition;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Track ID: ");
        setTrackID(scanner.nextLine());

        System.out.print("Enter Title: ");
        setTitle(scanner.nextLine());

        System.out.print("Enter Artist: ");
        setArtist(scanner.nextLine());

        System.out.print("Enter Duration (in minutes): ");
        setDuration(scanner.nextDouble());

        System.out.print("Enter Chart Position: ");
        setChartPosition(scanner.nextInt());

        System.out.print("Enter Release Year: ");
        setReleaseYear(scanner.nextInt());
    }

    @Override
    public void display() {
        System.out.println("Track Id : "+getTrackID());
        System.out.println("Title : "+getTitle());
        System.out.println("Artist : "+getArtist());
        System.out.println("Duration : "+getDuration());
        System.out.println("Chart Position : "+chartPosition);
        System.out.println("Release Year : "+releaseYear);
    }

    @Override
    public String toString() {
        return "PopMusicTrack{" +
                "chartPosition=" + chartPosition +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
