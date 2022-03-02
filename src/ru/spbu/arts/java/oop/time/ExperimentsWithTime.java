package ru.spbu.arts.java.oop.time;

public class ExperimentsWithTime {
    public static void main(String[] args) {
        Time t1 = new Time(4, 0);

        System.out.println(t1.show());

        System.out.println(t1.isDay());
        System.out.println(t1.isMorning());
        System.out.println(t1.isNight());
        System.out.println(t1.isEvening());

        System.out.println(t1.sayHello());

        t1.add(47);
        System.out.println(t1.show());
    }
}
