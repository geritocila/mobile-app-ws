package com.appsdeveloperblog.app.ws.io.repositories;

import org.springframework.data.repository.CrudRepository;

import com.appsdeveloperblog.app.ws.io.entity.PasswordResetTokenEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface PasswordResetTokenRepository extends CrudRepository<PasswordResetTokenEntity, Long>{
    PasswordResetTokenEntity findByToken(String token);
}
