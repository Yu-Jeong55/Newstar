package com.ssafy.newstar.domain.article.repository;

import com.ssafy.newstar.domain.article.dto.ArticleResponse;
import com.ssafy.newstar.domain.article.entity.Article;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ArticleRepository extends JpaRepository<Article, Long> {
  @Query("SELECT a FROM Article a WHERE a.Scategory = :category ORDER BY a.date DESC")
  List<Article> findByCategory(@Param("category") int category);
}
