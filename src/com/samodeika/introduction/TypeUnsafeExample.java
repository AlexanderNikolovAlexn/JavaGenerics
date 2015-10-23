package com.samodeika.introduction;

public class TypeUnsafeExample {
    public static void main(String[] args) {
        CircularBuffer<String> buffer = new CircularBuffer<>(10);
        //StringCircularBuffer buffer = new StringCircularBuffer(10); // Bad example

        buffer.offer("a");
        buffer.offer("bc");
        buffer.offer("d");

        //buffer.offer(1);

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
//
//    private static String Concatanate(StringCircularBuffer buffer) {
//        StringBuilder sb = new StringBuilder();
//        String value;
//        while((value = buffer.poll()) != null) {
//            sb.append(value);
//        }
//
//        return sb.toString();
//    }
}
