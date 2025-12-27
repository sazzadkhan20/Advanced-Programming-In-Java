public enum Months {
    January(1),
    February(2),
    March(3),
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December;

    Months(){
        System.out.println("Months: ["+this.name()+"]");
    }

    int a;
    Months(int a)
    {
        System.out.println("Month Created "+this.name());
    }

    public void setMonth(int a)
    {
        this.a = a;
    }

    public int getMonth()
    {
        return this.a;
    }

}
