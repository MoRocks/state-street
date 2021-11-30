package com.ahmed.statestreet.dao.repository;

import com.ahmed.statestreet.dao.entity.JpaCourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaCourseRepository extends JpaRepository<JpaCourseEntity, Integer> {
}
