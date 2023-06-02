package kz.techorda.trellohermano.model;

import jakarta.persistence.*;
import org.springframework.scheduling.config.Task;

@Entity
@Table(name = "Comments")
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String comment;

    @ManyToOne
    private Tasks task;
}
