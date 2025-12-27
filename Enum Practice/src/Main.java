

public class Main {
    public static void main(String[] args) {
        // Enum Lab Task 1
        // Print all the Enum values using values()
//        Months [] month = Months.values(); // return all Enum as a Array
//        System.out.println("Lab Task 1 -----------------");
//        for(int i=0; i<month.length; i++)
//            System.out.println(month[i]);
//
//        // Enum Lab Task 2
//        System.out.println("\n\nLab Task 2 -----------------");
//        System.out.println(Planet.valueOf("Earth").surface_gravity());
//        System.out.println(Planet.valueOf("Venus").getRadius());
//        System.out.println(Planet.valueOf("Venus").surface_gravity());

        // Practice--------

//       Months m1 = Months.January;
//       m1.setMonth(1);
//        Months m2 = Months.February;
//        Months m3 = Months.March;
        //Months [] month = Months.values();
//        for(int i=0; i<month.length; i++)
//            System.out.println(month[i]);
        for(int i=0; i<=10; i++)
        {
            Months m1 = Months.April;
            Months m2 = Months.May;
        }

        System.out.println(Months.April.ordinal());
//        Months m1 = Months.valueOf("djret");
//        System.out.println(m1.ordinal());
        System.out.println(Months.January.compareTo(Months.January));
//        Months m1 = Months.March;
//        m1.setMonth(10);
//        System.out.println(m1.getMonth());

        Months m1 = Months.February;

       switch (m1)
       {
           case February:
               System.out.println(Months.February);
           case March:
               System.out.println(Months.March);
           default:
               System.out.println(Months.May);
       }



    }
}