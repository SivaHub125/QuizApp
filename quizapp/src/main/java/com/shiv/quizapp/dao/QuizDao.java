package com.shiv.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shiv.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer>{
        
}
