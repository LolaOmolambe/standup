package com.expense.tracker.repository;

import com.expense.tracker.entity.Role;

import com.expense.tracker.enums.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleType name);
}
