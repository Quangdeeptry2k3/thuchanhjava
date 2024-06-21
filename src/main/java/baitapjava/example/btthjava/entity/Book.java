package baitapjava.example.btthjava.entity;

import baitapjava.example.btthjava.Validator.annotation.ValidCategoryId;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title")
    @NotEmpty(message = "Title không được để trống")
    @Size(max = 50, min = 1, message = "Title phải nhỏ hơn 50 kí tự ")
    private String title;
    @Column(name = "author")
    private String author;
    @Column(name = "price is require")
    private Double price;
    @ManyToOne
    @JoinColumn(name = "category_id")
    @ValidCategoryId
    private Category category;

}
