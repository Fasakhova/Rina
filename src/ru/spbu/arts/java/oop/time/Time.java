package ru.spbu.arts.java.oop.time;

public class Time {
    private int hour;
    private int minute;

    Time(int a, int b) {
        this.hour = a;
        this.minute = b;
    }


    public String show() {
        String a = Integer.toString(hour);
        String b = Integer.toString(minute);
        if (a.length() < 2)
            a = "0" + a;
        if (b.length() < 2)
            b = "0" + b;
        return "%s:%s".formatted(a, b);
    }


    public boolean isMorning() {
        return (4 < hour && hour < 11);
    }

    public boolean isDay() {
        return (11 < hour && hour < 17);
    }

    public boolean isEvening() {
        return (17 < hour && hour < 21);
    }

    public boolean isNight() {
        return (22 < hour && hour < 4);
    }


    public String sayHello() {
        if (isMorning())
            return "Доброе утро, солнце!";
        if (isDay())
            return "Добрый день, надеюсь, ты удачлив сегодня :)";
        if (isEvening())
            return "Добрый вечер, как прошёл день?";
        if (isNight())
            return "Доброй ночи. А не пора ли спать?";
        return "Упс... Вы вызвали временную воронку!0_0";
    }


    public void add(int toAdd) {
        int hoursToAdd = toAdd / 60;
        int minutesToAdd = toAdd % 60;
        this.hour = this.hour + hoursToAdd;
        this.minute = this.minute + minutesToAdd;

        if (this.minute > 59) {
            this.hour = this.hour + 1;
            this.minute = this.minute % 60;
        }
    }
}
