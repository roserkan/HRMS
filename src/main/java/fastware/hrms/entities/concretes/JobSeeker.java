package fastware.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="job_seekers")
public class JobSeeker {
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

    @Column(name="tc_no")
    private String tcNo;

    @Column(name="birth_year")
    private Date birthYear;
}
