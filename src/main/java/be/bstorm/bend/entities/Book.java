package be.bstorm.bend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor @AllArgsConstructor
@ToString @EqualsAndHashCode
public class Book {

    @Id @GeneratedValue
    private Long id;

    @Setter
    @Column(nullable = false,unique = true,length = 50)
    private String title;

    public Book(String title) {
        this.title = title;
    }
}
