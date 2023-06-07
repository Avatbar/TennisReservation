package local.tennisreservation.tennis.user;

import jakarta.persistence.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Tadeas Machacek
 */
@Entity
@Table
public class User {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private  String nameOfUser;

    private  String userNumber;

    private  Long id;

    private static final AtomicLong ID_GENERATOR = new AtomicLong();

    public User() {
    }
    public User(String name, String number) {
        this.id = ID_GENERATOR.getAndIncrement();
        this.nameOfUser = name;
        this.userNumber = number;
    }

    public Long getId() {
        return id;
    }

    public String getNameOfUser() {
        return nameOfUser;
    }

    public String getUserNumber() {
        return userNumber;
    }
}
