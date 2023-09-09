package com.ust.air_lines;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JsonDataRepository extends JpaRepository<JsonDataEntity, Long> {
    // You can define custom query methods if needed
}
