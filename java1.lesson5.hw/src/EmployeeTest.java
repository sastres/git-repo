import org.junit.Test;


public class EmployeeTest {
    private final int COUNT = 5;
    private Employee[] employee;

    public EmployeeTest() {
        employee = new Employee[COUNT];

        employee[0] = new Employee("Ivanov Ivan", "Admin",
                "ivivan@mailbox.com", "892312312", 30000, 26);
        employee[1] = new Employee("Petrov Ivan", "Engineer",
                "ivivan@mailbox.com", "892312312", 40000, 41);
        employee[2] = new Employee("Sidorov Ivan", "IT Director",
                "ivivan@mailbox.com", "892312312", 50000, 35);
        employee[3] = new Employee("Aliev Ivan", "Engineer",
                "ivivan@mailbox.com", "892312312", 40000, 56);
        employee[4] = new Employee("Sergeev Ivan", "Manager",
                "ivivan@mailbox.com", "892312312", 20000, 30);
    }

    @Test
    public void getOver40oldTest() {
        Employee.getOver40old(employee);
    }
} 