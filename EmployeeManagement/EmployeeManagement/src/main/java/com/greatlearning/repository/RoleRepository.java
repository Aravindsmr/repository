/**
 * 
 */
package com.greatlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.entity.Role;

/**
 * @author Aravind
 *
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
