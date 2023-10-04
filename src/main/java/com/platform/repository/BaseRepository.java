package com.platform.repository;

import com.platform.entities.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity> extends JpaRepository<T, Long>, QuerydslPredicateExecutor<T> {
}
