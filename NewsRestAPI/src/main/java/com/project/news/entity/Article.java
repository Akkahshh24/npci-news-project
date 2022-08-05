package com.project.news.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="article")
public class Article {
	
	@Id		// primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)	// auto_increment
	@Column(name="article_id")
	private Integer articleId;
	
	@Column(name="title") 
	private String title;
	
	@Column(name="author")
	private String author;
	
	@Column(name="description")
	private String description;
	
	@Column(name="image_url")
	private String imageUrl;
	
	@Column(name="redirection_url")
	private String redirectionUrl;
	
	@Column(name="publish_date")
	private Timestamp publishDate;
	
	@Column(name="likes")
	private Integer likes;
	
	@Column(name="comments")
	private Integer comments;
	
	public Article() {
		// default constructor
	}

	public Article(Integer articleId, String title, String author, String description, String imageUrl,
			String redirectionUrl, Timestamp publishDate, Integer likes, Integer comments) {
		this.articleId = articleId;
		this.title = title;
		this.author = author;
		this.description = description;
		this.imageUrl = imageUrl;
		this.redirectionUrl = redirectionUrl;
		this.publishDate = publishDate;
		this.likes = likes;
		this.comments = comments;
	}

	public Integer getArticleId() {
		return articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getRedirectionUrl() {
		return redirectionUrl;
	}

	public void setRedirectionUrl(String redirectionUrl) {
		this.redirectionUrl = redirectionUrl;
	}

	public Timestamp getPublish_date() {
		return publishDate;
	}

	public void setPublish_date(Timestamp publishDate) {
		this.publishDate = publishDate;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public Integer getComments() {
		return comments;
	}

	public void setComments(Integer comments) {
		this.comments = comments;
	}
	
}
