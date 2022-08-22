public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
    public static void task3() {

        byte numberOfBananas = 5;
        short bananaWeight = 80;
        short milkPortion = 200 / 100;
        short milkPortionWeight = 105;
        byte countOfIceCreamPackages = 2;
        short iceCreamPackageWeight = 100;
        byte countOfEggs = 4;
        byte eggWeight = 70;
        int gramsInKg = 1000;
        int milkWeight = milkPortion * milkPortionWeight;
        int totalBreakfastWeight = numberOfBananas * bananaWeight + milkWeight + countOfIceCreamPackages * iceCreamPackageWeight + countOfEggs * eggWeight;
        double reducedWeight = (double) totalBreakfastWeight / gramsInKg;

        System.out.println("Вес спорт-завтрака составил " + reducedWeight + " кг.");
    }