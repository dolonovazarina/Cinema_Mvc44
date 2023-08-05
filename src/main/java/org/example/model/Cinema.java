package org.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Configuration;

@Configuration
@Entity
@Table (name= "cinema")
@Getter
@Setter
@NoArgsConstructor
@ToString

public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String  name;
    private String address;
}
