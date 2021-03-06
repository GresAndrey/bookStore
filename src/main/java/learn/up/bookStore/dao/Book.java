package learn.up.bookStore.dao;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Book {
    private Long id;
    private String name;
    private int author_id;
    private int price;
}
