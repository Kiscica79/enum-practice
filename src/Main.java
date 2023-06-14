public class Main {
    public static void main(String[] args) {

        // month

        Month thisMonth = Month.JUNE;
        System.out.println(thisMonth);

        for (Month month : Month.values()) {
            System.out.println(month.getMonthNumber()+". hónap " + month.getHungarianName());
        }

        //3.b
        System.out.println(Month.JUNE.getHungarianName());
        System.out.println(Month.APRIL.isSummerMonth() ? "Április nyári hónap" : "Április nem nyári hónap");
        System.out.println(Month.APRIL.getHungarianName());
        System.out.println(Month.APRIL.isSpringMonth() ? "Április tavaszi hónap" : "Április nem tavaszi hónap");
        System.out.println(Month.JANUARY.getHungarianName());
        System.out.println(Month.JANUARY.isAutumnMonth()? "Január őszi hónap" : "Január nem őszi hónap");

        System.out.println(Month.getRandomMonth() + ": ez egy random hónap");

        // season

        Season thisSeason = Season.SUMMER;
        System.out.println(thisSeason);

        for (Season season : Season.values()) {
            System.out.println(season);
        }

        for (Season season : Season.values()) {
            System.out.println(season.getHungarianName());
        }

    }
}