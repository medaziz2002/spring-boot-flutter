package net.ahmed.universitymanagement.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Attendance {
    @Id
    @UuidGenerator
    private String id;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Subject subject;


    @Temporal(TemporalType.DATE)
    private Date date;

    private boolean isPresent;
}
