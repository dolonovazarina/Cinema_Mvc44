package org.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Entity
@Configuration
@Setter
@Getter
@ToString
@NoArgsConstructor
@Table(name="movie")
public class Movie {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private  int id;
    private String name;



}
