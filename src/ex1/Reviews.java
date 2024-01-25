package ex1;

import java.time.LocalDateTime;
import java.util.Objects;

public class Reviews {
    private final int id;
    private final String text;
    private int likes;
    private final LocalDateTime dateTime;

    public Reviews(int id, String text, int likes, LocalDateTime dateTime) {
        this.id = id;
        this.text = text;
        this.likes = likes;
        this.dateTime = dateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Reviews reviews = (Reviews) o;
        return id == reviews.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return ""
                + id
                + " " + text
                + " " + likes
                + " " + dateTime;
    }

    public int getLikes() {
        return likes;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
