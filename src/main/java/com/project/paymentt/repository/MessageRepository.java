package com.project.paymentt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.paymentt.model.Message;

public interface MessageRepository extends JpaRepository<Message, String> {

}
