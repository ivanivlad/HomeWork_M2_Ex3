package ex1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) {
        Comparator<Reviews> comparatorReviews = (sec, first) -> {
            if (first.getLikes() == sec.getLikes()) {
                return first.getDateTime().compareTo(sec.getDateTime());
            }
            return first.getLikes() - sec.getLikes();
        };
        Set<Reviews> reviews = new TreeSet<>(comparatorReviews);
        LocalDate today = LocalDate.of(2024, 1, 25);
        reviews.add(
                new Reviews(2,
                        "так себе товар!",
                        100,
                        LocalDateTime.of(today, LocalTime.of(16, 37))));
        reviews.add(
                new Reviews(1,
                        "отличный товар",
                        200,
                        LocalDateTime.of(today, LocalTime.of(13, 37))));
        reviews.add(
                new Reviews(3,
                        "плохой товар",
                        100,
                        LocalDateTime.of(today, LocalTime.of(13, 37))));

        int count = 1;
        for (var rev : reviews) {
            System.out.printf("отзыв №%s: %s \n", count,  rev.toString());
            count++;
        }
    }
}
