package fastware.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="job_seeker_verifications")
public class JobSeekerVerification {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="job_seeker_id")
    private int jobSeekerId;

    @Column(name="email_verification")
    private boolean emailVerification;

    @Column(name="mernis_verification")
    private boolean mernisVerification;
}
