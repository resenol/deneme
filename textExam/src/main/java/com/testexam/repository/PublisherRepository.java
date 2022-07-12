package com.testexam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testexam.model.Publisher;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}