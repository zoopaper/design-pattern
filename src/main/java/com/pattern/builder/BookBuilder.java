package com.pattern.builder;

/**
 * User: shijingui
 * Date: 2016/4/30
 */
public class BookBuilder {
    private String title;
    private double price;
    private String author;

    private String publish;
    private String introduction;

    private BookBuilder(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.publish = builder.publish;
        this.introduction = builder.introduction;
    }

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

        public BookBuilder build() {
            return new BookBuilder(this);
        }
    }
}
