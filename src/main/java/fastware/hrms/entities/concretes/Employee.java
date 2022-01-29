package fastware.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="user_id")
    private int userId;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;
}
