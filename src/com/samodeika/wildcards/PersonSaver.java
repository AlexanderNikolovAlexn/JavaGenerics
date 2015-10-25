package com.samodeika.wildcards;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class PersonSaver {
    private final RandomAccessFile file;

    public PersonSaver(File file) throws FileNotFoundException {
        this.file = new RandomAccessFile(file, "rw");
    }

    public void save() throws IOException {

    }
}
