import java.util.Random;

public enum Month {

    JANUARY("Január"),
    FEBRUARY("Február"),
    MARCH("Március"),
    APRIL("Április"),
    MAY("Május"),
    JUNE("Június"),
    JULY("Július"),
    AUGUST("Augusztus"),
    SEPTEMBER("Szeptember"),
    OCTOBER("Október"),
    NOVEMBER("November"),
    DECEMBER("December");

    private String hungarianName;

    Month(String hungarianName) {
        this.hungarianName = hungarianName;
    }
    public String getHungarianName() {
        return hungarianName;
    }

    // 3.b
    public boolean isSummerMonth() {
        return this == JUNE || this == JULY || this == AUGUST;
    }
    public boolean isSpringMonth() {
        return this == MARCH || this == APRIL || this == MAY;
    }
    public boolean isAutumnMonth() {
        return this == SEPTEMBER || this == OCTOBER || this == NOVEMBER;
    }
    public boolean isWinterMonth() {
        return this == DECEMBER || this == JANUARY || this == FEBRUARY;
    }

    // 3.c ordinal() használata, visszaadja, hanyadik hónap
    public int getMonthNumber() {
        return this.ordinal() + 1;
    }

    public static Month getRandomMonth() {
        Random random = new Random();
        Month[] months = Month.values();
        return months[random.nextInt(months.length)];

    }


}
