package com.GestionReviews.GestionReviews.repository;

import com.GestionReviews.GestionReviews.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
