package by.grodno.zagart.java.intelisoft.Entities;

import javax.persistence.*;

/**
 * Entity which describes file objects.
 */
@Entity
@Table(name = "files")
public class File {

    private Long id;
    private Long size;
    private Directory directory;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    @Column(name = "name")
    private String name;
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }


    @Column(name = "size")
    public Long getSize() { return size; }
    public void setSize(Long size) { this.size = size; }

    @OneToMany(mappedBy = "files")
    public Directory getDirectory() { return directory; }
    public void setDirectory(Directory directory) { this.directory = directory; }


}
