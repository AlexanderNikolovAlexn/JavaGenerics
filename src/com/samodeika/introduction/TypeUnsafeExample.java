package com.samodeika.introduction;

public class TypeUnsafeExample {
    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(10);

        buffer.offer("a");
        buffer.offer("bc");
        buffer.offer("d");

        String value = Concatanate(buffer);
        System.out.println(value);
    }

    private static String Concatanate(CircularBuffer buffer) {
        StringBuilder sb = new StringBuilder();
        String value;
        while((value = (String) buffer.poll()) != null) {
            sb.append(value);
        }

        return sb.toString();
    }
}
