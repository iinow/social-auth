package com.ha.api.memo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ha.entity.Memo;

public interface MemoRepository extends JpaRepository<Memo, Long> {

}
