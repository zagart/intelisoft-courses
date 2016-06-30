package by.grodno.zagart.java.intelisoft.Entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "employees")
public class Employee {

    private Long id;
    private Employee boss;
    private List<Employee> employees;
    private Date date;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }


    @ManyToOne
    public Employee getBoss() { return boss; }
    public void setBoss(Employee boss) { this.boss = boss; }


    @OneToMany(mappedBy = "boss", fetch = FetchType.LAZY)
    public List<Employee> getEmployees() { return employees; }
    public void setEmployees(List<Employee> employees) { this.employees = employees; }

    @Temporal(TemporalType.DATE)
    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", date=" + date +
                '}';
    }

}
