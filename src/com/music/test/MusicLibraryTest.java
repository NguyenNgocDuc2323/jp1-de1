package com.music.test;

import com.music.library.classical.ClassicalMusicTrack;
import com.music.library.pop.PopMusicTrack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicLibraryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<PopMusicTrack> popMusicTracks = new ArrayList<PopMusicTrack>();
        List<ClassicalMusicTrack> classicalMusicTracks = new ArrayList<ClassicalMusicTrack>();
        int chooise = 0;
        do{
            System.out.println("+---------------------------------------------------------+");
            System.out.println("+                            MENU                         +");
            System.out.println("+---------------------------------------------------------+");
            System.out.println("1. Input information for n Pop Music Tracks.");
            System.out.println("2. Input information for n Classical Music Tracks.");
            System.out.println("3. Display information of n Pop Music Tracks (Sorted by chart position ascending).");
            System.out.println("4. Display information of n Classical Music Tracks (Sorted by popularity score descending).");
            System.out.println("5. Exit.");
            System.out.println("+---------------------------------------------------------+");
            System.out.println("Please enter your choice: ");
            chooise = scanner.nextInt();
            scanner.nextLine();
            switch (chooise){
                case 1:
                    System.out.print("Enter the number of Pop Music Tracks: ");
                    int popCount = scanner.nextInt();
                    scanner.nextLine();
                    for(int i = 0; i < popCount; i++){
                        PopMusicTrack popTrack = new PopMusicTrack();
                        popTrack.input();
                        popMusicTracks.add(popTrack);
                    }
                    break;
                    case 2:
                        System.out.print("Enter the number of Classical Music Tracks: ");
                        int classCount = scanner.nextInt();
                        scanner.nextLine();
                        for(int i = 0; i < classCount; i++){
                            ClassicalMusicTrack classicalTrack = new ClassicalMusicTrack();
                            classicalTrack.input();
                            classicalMusicTracks.add(classicalTrack);
                        }
                        break;
                        case 3:
                            if (!popMusicTracks.isEmpty()) {
                                List<PopMusicTrack> sortedPopTracks = popMusicTracks.stream()
                                        .sorted((a, b) -> Integer.compare(a.getChartPosition(), b.getChartPosition()))
                                        .toList();

                                System.out.println("Pop Music Tracks sorted by chart position (ascending):");
                                sortedPopTracks.forEach(track -> {
                                    track.display();
                                    System.out.println("-------------------------");
                                });
                            } else {
                                System.out.println("No Pop Music Tracks available.");
                            }
                            break;
                            case 4:
                                if(!classicalMusicTracks.isEmpty()) {
                                    List<ClassicalMusicTrack> sortedClassicalTracks = classicalMusicTracks.stream()
                                            .sorted((a, b) -> Double.compare(b.calculatePopularity(), a.calculatePopularity()))
                                            .toList();
                                    System.out.println("Classical Music Tracks sorted by popularity score (descending):");
                                    sortedClassicalTracks.forEach(track -> {
                                        track.display();
                                        System.out.println("-------------------------");
                                    });
                                } else {
                                    System.out.println("No Classical Music Tracks available.");
                                }
                                break;
                                case 5:
                                    System.out.println("Exiting the program. Goodbye!");
                                    break;
                                    default:
                                        System.out.println("Please enter a valid choice.");
                                        break;
            }
        }
        while (chooise != 5);
        scanner.close();
    }
}
