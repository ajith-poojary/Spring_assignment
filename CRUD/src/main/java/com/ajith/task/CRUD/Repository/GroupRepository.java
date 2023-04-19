package com.ajith.task.CRUD.Repository;

import com.ajith.task.CRUD.Entity.Group;
import com.ajith.task.CRUD.Entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GroupRepository extends JpaRepository<Group,Integer> {
}
