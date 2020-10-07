package com.company;

/**
 * creating a new movie with parameters
 */
public class Film {
    private String name;
    private String duration;
    private String genre;
    public static final String COMEDY = "COMEDY";
    public static final String FANTASY = "FANTASY";
    public static final String HORROR = "HORROR";


    public Film(String name, String duration, String genre) {
        System.out.println("Создаётся новый фильм");
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        System.out.println("Фильм " + name + " успешно создан.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
