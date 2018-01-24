package dao;

import org.springframework.data.jpa.repository.JpaRepository;


import entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>{
	
}