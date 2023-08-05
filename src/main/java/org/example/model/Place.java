package org.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Configuration;

@Configuration
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name="place")

public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int x;
    private int y;
    private int price;
}
