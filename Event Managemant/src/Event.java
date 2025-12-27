import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Event {
    String name;
    LocalDate date;
    EventType event;

    Event(String name, String date, EventType event) {
        this.name = name;
        // 25-12-2025
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.date = LocalDate.parse(date, formatter);
        //System.out.println(date);
        this.event = event;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public EventType getEvent() {
        return event;
    }

    public void printEvent() {
        System.out.println(name + " [ " + event + " ] on " + this.date);
    }
}
