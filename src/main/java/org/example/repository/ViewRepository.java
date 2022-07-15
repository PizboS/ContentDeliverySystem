package org.example.repository;

import org.example.entity.View;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface ViewRepository extends JpaRepository<View, UUID> {
    List<View> getViewsBySentFalse();
}
