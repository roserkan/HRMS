package fastware.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="employers")
public class Employer {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="user_id")
    private int userId;

    @Column(name="company_name")
    private String companyName;

    @Column(name="web_site")
    private String webSite;

    @Column(name="phone_number")
    private String phoneNumber;
}
