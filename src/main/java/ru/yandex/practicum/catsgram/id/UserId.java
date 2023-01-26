package ru.yandex.practicum.catsgram.id;

public class UserId {
    private static int userId;

    public static int getUserId() {
        return ++userId;
    }
}