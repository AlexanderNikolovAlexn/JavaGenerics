package com.samodeika.wildcards;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.List;

public class PersonLoader {
    private final RandomAccessFile file;

    public PersonLoader(File file) throws FileNotFoundException {
        this.file = new RandomAccessFile(file, "rw");
    }

    public Person load() throws ClassNotFoundException {
        return new Person("Not implemented", 111);
    }

    public void loadAll(List<? super Person> people) throws ClassNotFoundException {
        Person person;
        while ((person = load()) != null) {
            people.add(person);
        }
    }
}
