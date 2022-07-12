package com.testexam.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testexam.model.Publisher;
import com.testexam.repository.PublisherRepository;

@Service
public class TestService {
	@Autowired
	PublisherRepository publisherDAO;

	public String getData() {
		Optional<Publisher> publisher = publisherDAO.findById(1l);
		return publisher.isPresent() ? publisher.get().getName() : "Data not found";
	}

}
