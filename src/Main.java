 import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        checkLeapYear(2020);
        getDeviceLink(osType: 0, manufacturingYear: 2005);
        int deiveryDays = calculateDeliveryDays(deliveryDistance: 60);
        System.out.println("Потребуется дней: " + deiveryDays);
    }

    public static void checkLeapYear (int year); {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год - является високосным");
        } else {
            System.out.println(year + " год - не является високосным");
        }
    }
    public static void getDeviceLink (int osType, int manufacturingYear); {
        if (osType != 1 && osType != 0) {
            throw new IllegalArgumentException("Wrong OS type");
        }
        int currentYear = LocalDate.now().getYear();
        if (manufacturingYear > currentYear) {
            throw new IllegalArgumentException("Wrong manufacturing year");
        }
        String osString = osType == 0 ? "iOS" : "Android";
        String versionSring = manufacturingYear > 2015 ? "полную" : "облегченную";
        System.out.printf("Установите %s версию для %s по ссылке%n", versionSring, osString);
    }
    public static int calculateDeliveryDays (int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else {
            return (int) Math.round((double) deliveryDistance / 40) + 1;
        }
    }
}       // Сделал всё как в разборе дз, но ничего не работает! Ругается на 5 строку, всё 10 раз перепроверил
        // всё правильно, но не работает. В чём ошибка?