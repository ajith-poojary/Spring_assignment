package com.ajith.task.CRUD.Repository;

import com.ajith.task.CRUD.Entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image,Integer> {
}
