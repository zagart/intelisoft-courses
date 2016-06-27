package by.grodno.zagart.java.intelisoft.Entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by intelisoft on 27.06.2016.
 */
@Entity
@Table(name = "employees")
public class Employee {

    private Long id;
    private Employee boss;
    private List<Employee> employees;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }


    @ManyToOne
    public Employee getBoss() { return boss; }
    public void setBoss(Employee boss) { this.boss = boss; }


    @OneToMany(mappedBy = "boss", fetch = FetchType.LAZY)
    public List<Employee> getEmployees() { return employees; }
    public void setEmployees(List<Employee> employees) { this.employees = employees; }

}
