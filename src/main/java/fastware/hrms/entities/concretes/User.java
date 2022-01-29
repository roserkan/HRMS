package fastware.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;
}
