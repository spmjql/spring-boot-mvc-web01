package com.home.exp.controller.service.process;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.exp.controller.service.MemoService;
import com.home.exp.domain.entity.MemoEntity;
import com.home.exp.domain.entity.MemoRepository;

@Service
public class MemoServiceProcess implements MemoService {

	@Autowired
	MemoRepository repo;
	
	@Override
	public void memoS(String content) {
		repo.save( MemoEntity.builder().content(content).build() );
	}

}
