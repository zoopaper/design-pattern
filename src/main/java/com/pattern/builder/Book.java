package com.pattern.builder;

/**
 * User: krisjin
 * Date: 2016/4/30
 */
public class Book {
    private String title;
    private double price;
    private String author;

    private String publish;
    private String introduction;

    private Book(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.publish = builder.publish;
        this.introduction = builder.introduction;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublish() {
        return publish;
    }

    public String getIntroduction() {
        return introduction;
    }

    //构建器
    public static class Builder {
        private String title;
        private double price;
        private String author;

        private String publish;
        private String introduction;

        public Builder(String title, double price, String author) {
            this.author = author;
            this.title = title;
            this.price = price;
        }

        public Builder publish(String publish) {
            this.publish = publish;
            return this;
        }

        public Builder introduction(String introduction) {
            this.introduction = introduction;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
