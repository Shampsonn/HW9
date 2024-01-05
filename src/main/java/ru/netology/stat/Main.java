package ru.netology.stat;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.surname = "Иванов";
        post.passport = "4444 № 34343444";
        post.subscription = true;
        post.phone = "+7222222222";
        post.patronymic = "Иванович";
        post.birthday = new FormDate();
        post.birthday.day = 12;
        post.birthday.month = 12;
        post.birthday.year = 1998;

    }
}