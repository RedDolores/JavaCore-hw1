package hw4;

public enum Holidays {
    NEW_YEAR("01.01"),
    WORLD_WOMEN_S_DAY("08.03"),
    DEFENDER_OF_THE_FATHERLAND_DAY("23.02");
    String holiday;

    Holidays(String day) {
        this.holiday = day;
    }
}
