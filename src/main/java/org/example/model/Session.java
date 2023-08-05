package org.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
@Configuration
@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@Table(name = "session")
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private LocalDate start;
    private LocalDate finish;
    @ManyToOne(cascade = {CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.MERGE})
    @JoinColumn(name ="movie_id")
    private Movie movie;
    @ManyToOne(cascade = {CascadeType.REFRESH,
            CascadeType.DETACH,CascadeType.MERGE})
    @JoinColumn(name = "room_id")
    private  Room room;

}
