package ar.edu.unlp.info.bd2.services;

import ar.edu.unlp.info.bd2.repositories.MLRepository;

public class MLServiceImpl implements MLService {
	
	private MLRepository repository;

	public MLServiceImpl(MLRepository repository) {
		this.repository = repository;
	}
	
	

}
