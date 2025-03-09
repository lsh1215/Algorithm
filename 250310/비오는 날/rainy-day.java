import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 개행 문자 처리

        Data[] weathers = new Data[n];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            weathers[i] = new Data(date, day, weather);
        }

        // 가장 가까운 비 오는 날 찾기
        Data nearestRainyDay = null;
        LocalDate nearestDate = null;

        for (int i = 0; i < n; i++) {
            if (weathers[i].weather.equals("Rain")) {
                LocalDate weatherDate = LocalDate.parse(weathers[i].date, formatter);

                if (nearestRainyDay == null || weatherDate.isBefore(nearestDate)) {
                    nearestRainyDay = weathers[i];
                    nearestDate = weatherDate; // 비교 기준 업데이트
                }
            }
        }

        // 결과 출력
        if (nearestRainyDay != null) {
            System.out.println(nearestRainyDay.date + " " + nearestRainyDay.day + " " + nearestRainyDay.weather);
        }
    }
}

class Data {
    String date;
    String day;
    String weather;

    public Data(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}
