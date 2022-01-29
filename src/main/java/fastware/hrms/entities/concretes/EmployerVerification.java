package fastware.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="employer_verifications")
public class EmployerVerification {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="employer_id")
    private int employerId;

    @Column(name="email_verification")
    private boolean emailVerification;

    @Column(name="employee_verificaton")
    private boolean employeeVerification;
}
