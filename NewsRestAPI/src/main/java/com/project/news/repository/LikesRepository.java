package com.project.news.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.project.news.entity.Likes;

@RepositoryRestResource(path="likes")
@CrossOrigin("http://localhost:4200/")
public interface LikesRepository extends JpaRepository<Likes, Integer> {
	
	public List<Likes> findByUserId(Integer userId); 
	
	public Integer countByArticleId(Integer articleId);

}
