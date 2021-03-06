package com.register.repository.server.domain.dao;

import com.register.repository.server.domain.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyDao extends JpaRepository<Property, Long> {
}
