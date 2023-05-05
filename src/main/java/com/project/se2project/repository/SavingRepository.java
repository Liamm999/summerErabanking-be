package com.project.se2project.repository;

import com.project.se2project.model.Saving;
import com.project.se2project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SavingRepository extends JpaRepository<Saving, Long> {
    List<Saving> findByUser(User user);
}
