package fastware.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="job_positions")
public class JobPositions {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="position_name")
    private String positionName;
}
