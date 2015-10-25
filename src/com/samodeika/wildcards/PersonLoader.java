package com.samodeika.wildcards;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * Created by Eagle on 25.10.2015 ã..
 */
public class PersonLoader {
    private final RandomAccessFile file;

    public PersonLoader(File file) throws FileNotFoundException {
        this.file = new RandomAccessFile(file, "rw");
    }

    public Person load() throws ClassNotFoundException {
        return new Person("Not implemented", 111);
    }
}
