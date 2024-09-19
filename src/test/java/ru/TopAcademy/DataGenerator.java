package ru.TopAcademy;


import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;


public class DataGenerator {

    private static Faker faker = new Faker(new Locale("ru"));

    private static final List<String> cities = Arrays.asList(
            "Москва", "Санкт-Петербург", "Орёл", "Нижний Новгород", "Екатеринбург", "Тюмень", "Астрахань", "Йошкар-Ола"
    );

    public static String genCity() {
        return cities.get(faker.random().nextInt(cities.size()));
    }
    public static String genName() {
        return  faker.name().fullName();
    }
    public static String genPhone() {
        return faker.phoneNumber().phoneNumber();
    }
    public static String genDate(long addDays, String pattern) {
        return LocalDate.now().plusDays(addDays).format(DateTimeFormatter.ofPattern(pattern));
    }
}

