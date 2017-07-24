package dependencyInversion.good;

public class EmailClient {
    
    public void alertWeatherConditions(String weatherConditions) {
        if (weatherConditions == "sunny") {
            System.out.print("It is sunny");
        }
    }

}
