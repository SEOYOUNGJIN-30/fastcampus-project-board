package com.fastcampus.projectboard.repository;

import com.fastcampus.projectboard.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AticleCommentRepository extends JpaRepository<ArticleComment, Long> {

}