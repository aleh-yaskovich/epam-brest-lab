package com.epam.brest.io;

import com.epam.brest.entity.Song;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    private List<Song> songs;
    private String filePath = "java-collections-task/resources/Songs.txt";

    public Reader() {
        List<Song> songs = new ArrayList<>();
    }

    public List<Song> getSongs() {
        File file = new File(filePath);

        return this.songs;
    }
}
