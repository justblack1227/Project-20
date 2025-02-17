package org.coursesimple.CourseBlog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.coursesimple.CourseBlog.models.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
