package com.project.entities.Users;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="usersmain")
public class UsersEmail{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String email;
}