package com.springboot.dslist.Entity;

import java.util.Objects;


import jakarta.persistence.*;


@Entity
@Table(name= "tb_Game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(name = "game_year")
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;

    @Column(columnDefinition = "TEXT")
    private String shotDescription;
    @Column(columnDefinition = "TEXT")
    private String longDescription;

    public Game() {}


        public Game(Long id, String title, Integer year, String genre, String platforms, Double score, String imgUrl, String shotDescription, String longDescription) {
            this.id = id;
            this.title = title;
            this.year = year;
            this.genre = genre;
            this.platforms = platforms;
            this.score = score;
            this.imgUrl = imgUrl;
            this.shotDescription = shotDescription;
            this.longDescription = longDescription;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getLongDescription() {
            return longDescription;
        }

        public void setLongDescription(String longDescription) {
            this.longDescription = longDescription;
        }

        public String getShotDescription() {
            return shotDescription;
        }

        public void setShotDescription(String shotDescription) {
            this.shotDescription = shotDescription;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Integer getYear() {
            return year;
        }

        public void setYear(Integer year) {
            this.year = year;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getPlatforms() {
            return platforms;
        }

        public void setPlatforms(String platforms) {
            this.platforms = platforms;
        }

        public Double getScore() {
            return score;
        }

        public void setScore(Double score) {
            this.score = score;
        }

        public String getImgUrl() {
            return imgUrl;
        }

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }




        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Game game = (Game) o;
            return Objects.equals(id, game.id);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(id);
        }


}
