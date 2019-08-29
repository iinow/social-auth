package com.ha.api.memo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ha.entity.Memo;

@RestController
@RequestMapping(path = "/memos")
public class MemoController {
	
	@Autowired
	private MemoService memoService;

	@PostMapping(path = "")
	public ResponseEntity<?> postMemo(
			@RequestBody Memo memo,
			HttpServletRequest request, HttpServletResponse response){
		Long id = memoService.createMemo(memo);
		return ResponseEntity.ok()
				.header("Location", String.valueOf(id))
				.build();
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<?> getMemo(
			@PathVariable(name = "id", required = true) Long id,
			HttpServletRequest request, HttpServletResponse response){
		Memo memo = memoService.getMemo(id);
		return ResponseEntity
				.ok(memo);
	}
}
