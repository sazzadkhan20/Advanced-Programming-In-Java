import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Event> events = new ArrayList<Event>();
         events.add(new Event("Java Quiz","10-12-2025",EventType.QUIZ));
         events.add(new Event("Java WorkShop","12-12-2025",EventType.WORKSHOP));
         events.add(new Event("Java ABC","13-12-2025",EventType.ABC));
         events.add(new Event("Java Job","11-12-2025",EventType.JOB));
         events.add(new Event("Java Programming","15-12-2025",EventType.PROGRAMING));
         events.add(new Event("Hackathon Java","14-12-2025",EventType.HACKATHON));

        LocalDate date = LocalDate.parse("2025-12-11");
        System.out.println("Selected Date: "+date);
        for(Event event:events){
            if(!event.getDate().isBefore(date) || event.getEvent() == EventType.WORKSHOP ||
                    event.getEvent() == EventType.HACKATHON ){
                event.printEvent();
            }
        }
    }
}