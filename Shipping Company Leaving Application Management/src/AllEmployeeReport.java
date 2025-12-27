import java.util.*;

public class AllEmployeeReport
{
    List<Employee> employeeList;

    AllEmployeeReport()
    {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee e)
    {
        employeeList.add(e);
    }


    public Employee getEmployee(int id)
    {
        for (Employee e : employeeList)
        {
            if(e.getId() == id)
                return e;
        }
        return null;
    }

}
