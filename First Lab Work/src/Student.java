public class Student {
    private String id,name,dept;

    public Student() {
    }

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Student(String id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void studentInfoForIdName()
    {
        if(this.id != null && this.name != null)
        {
            System.out.println("Student Id - "+this.id);
            System.out.println("Student Name - "+this.name);
        }
        else
            System.out.println("Information Missing,Please Fill up Student Info");
    }

    public void studentAllInfo()
    {
        if(this.id != null && this.name != null && this.dept != null)
        {
            System.out.println("Student Id - "+this.id);
            System.out.println("Student Name - "+this.name);
            System.out.println("Student Department - "+this.dept);
        }
        else
            System.out.println("Information Missing,Please Fill up Student Info");
    }
}
