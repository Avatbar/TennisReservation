package local.tennisreservation.tennis;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Tadeas Machacek
 */
public class User {
    private final String nameOfUser;

    private final String userNumber;

    private final Long id;

    private static final AtomicLong ID_GENERATOR = new AtomicLong();

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
