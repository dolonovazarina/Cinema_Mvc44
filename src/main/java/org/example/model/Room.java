package org.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Configuration;

@Configuration
@Entity
@NoArgsConstructor
@ToString
@Getter
@Setter
@Table (name="room")
public class Room{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int rating;

}
