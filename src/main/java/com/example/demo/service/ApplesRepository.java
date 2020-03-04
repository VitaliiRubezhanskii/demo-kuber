package com.example.demo.service;

import com.example.demo.model.Apples;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplesRepository extends JpaRepository<Apples, Long> {

}
