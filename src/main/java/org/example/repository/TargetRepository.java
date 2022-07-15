package org.example.repository;

import org.example.entity.Target;
import org.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface TargetRepository extends JpaRepository<Target, UUID> {
    List<Target> getTargetsByUserAndPage(User user, String page);
}
