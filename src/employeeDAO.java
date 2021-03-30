import java.util.List;

public interface employeeDAO {
    //CRUD Operetion
    public List<Employee> getAllEmp();
    public void addEmp(Employee newEmp);
    public void updateEmp(Employee employee);
    public void deleteEmp(int id);
    public Employee findEmp(int id);
}