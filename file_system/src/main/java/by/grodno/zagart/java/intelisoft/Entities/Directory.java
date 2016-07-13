package by.grodno.zagart.java.intelisoft.Entities;

import javax.persistence.*;
import java.util.ArrayList;

/**
 * Entity which describes directory objects.
 */
@Entity
@Table(name = "directories")
public class Directory {

    private Long id;
    private String name;
    private String parent;
    private ArrayList<File> files;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    @Column(name = "name")
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Column(name = "parent")
    public String getParent() { return parent; }
    public void setParent(String parent) { this.parent = parent; }

    @ManyToOne
    public ArrayList<File> getFiles() { return files; }
    public void setFiles(ArrayList<File> files) { this.files = files; }

}
