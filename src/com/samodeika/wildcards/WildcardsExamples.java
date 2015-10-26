package com.samodeika.wildcards;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WildcardsExamples {

    public static void main(String[] args) throws IOException {
        Partner alexNik = new Partner("Alex Nik", 28);
        Partner stoPan = new Partner("Stoyan Pan", 22);
        Employee nasIgn = new Employee("Nasko Ignat", 33);
        List<Partner> partners = new ArrayList<>();
        partners.add(alexNik);
        partners.add(stoPan);

        PersonSaver saver = new PersonSaver(new File("abvv", "rw"));

        saver.save(alexNik);

        saver.saveAll(partners);
    }

}
