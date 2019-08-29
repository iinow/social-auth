package com.ha.api.memo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ha.entity.Memo;
import com.ha.entity.User;

@Service
public class MemoService {

	@Autowired
	private MemoRepository memoRepository;
	
	@Transactional
	public Long createMemo(Memo memo) {
		return memoRepository.save(memo).getId();
	}
	
	@Transactional
	public Memo getMemo(Long id) {
		return memoRepository.findById(id).orElse(null);
	}
	
	@Transactional
	public List<Memo> getMemo(User user) {
		return user.getMemos();
	}
	
	@Transactional
	public void updateMemo(Memo memo) {
		memoRepository.save(memo);
	}
	
	@Transactional
	public void deleteMemo(Long id) {
		memoRepository.deleteById(id);
	}
}
