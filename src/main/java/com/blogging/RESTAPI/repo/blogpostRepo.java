package com.blogging.RESTAPI.repo;

import com.blogging.RESTAPI.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface blogpostRepo extends JpaRepository<BlogPost, Long> {


    @Query(
            nativeQuery = true,
            value = "SELECT * FROM blog_post WHERE title LIKE CONCAT('%', :term, '%')")
    List<BlogPost> findByTerm(@Param("term") String term);
}
