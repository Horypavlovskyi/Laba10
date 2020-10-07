package com.company;

/**
 * keeps a library of films
 */
public class Library {
    public static void main(String[] args) {

    }
    private String[] films;
    private String libraryName;
    public static final String CONSTANTA = "Name";

    {
        this.films = new String[5];
        films[0] = "Терминатор 2: Судный день";
        films[1] = "Маска";

        System.out.println("Добавлены любимые фильмы");
    }

    /**
     *checks the array, empty or not empty
     * @return returns the index of an empty cell in an array
     */
    public int returnArray() {
        for (int i = 0; i < films.length; i++) {
            if (films[i] == null)
                return i;
        }
        return -1;
    }

    /**
     * adds a new movie to the array
     * @param film add new film
     * @return "Вы достигли лимита" or "your film was added to cell with index: and index method returnArray"
     */
    public String implementCheck(String film) {
        int indexOfArray = returnArray();
        if (indexOfArray == -1) {
            return "Вы достигли лимита";
        } else {
            films[indexOfArray] = film;
            return "your film was added to cell with index: " + indexOfArray;
        }

    }

    public Library(String libraryName) {
        this.libraryName = libraryName;
        System.out.println("Библиотека " + libraryName + " успешно создана.");
    }

    public String[] getFilms() {
        return films;
    }

    public static String getCONSTANTA() {
        return CONSTANTA;
    }


}

