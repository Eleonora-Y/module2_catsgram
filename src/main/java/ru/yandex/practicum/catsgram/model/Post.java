package ru.yandex.practicum.catsgram.model;
import lombok.Getter;
import lombok.Setter;
import java.time.Instant;
//@Getter
        //@Setter
public class Post {
    private Integer id;
    private final String author; // автор
    private final Instant creationDate = Instant.now(); // дата создания
    private String description; // описание
    private String photoUrl; // url-адрес фотографии


    public Post(Integer id,String author, String description, String photoUrl) {
        this.id = id;
        this.author = author;
        this.description = description;
      this.photoUrl = photoUrl;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}