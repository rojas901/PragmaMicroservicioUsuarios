package com.pragma.powerup.domain.usecase;

import com.pragma.powerup.domain.model.Role;
import com.pragma.powerup.domain.model.User;
import com.pragma.powerup.domain.spi.IUserPersistencePort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserUseCaseTest {
    private IUserPersistencePort userPersistencePort;
    private UserUseCase userUseCase;

    @BeforeEach
    void setUp() {
        userPersistencePort = Mockito.mock(IUserPersistencePort.class);
        userUseCase = new UserUseCase(userPersistencePort);
    }

    @Test
    void saveUser() {
        //Arrange
        Role role = new Role(2L , "owner", "owner description");
        User user = new User(
                1L,
                "jhon",
                "restrepo",
                "123456789",
                "+573125879465",
                 role, LocalDate.parse("1990-01-27"),
                "carlos@email.com",
                "password"
        );

        //Act
        userUseCase.saveUser(user);

        //Assert
        ArgumentCaptor<User> userCaptor = ArgumentCaptor.forClass(User.class);
        Mockito.verify(userPersistencePort).saveUser(userCaptor.capture());
        User savedUser = userCaptor.getValue();

        assertEquals(user, savedUser);
    }
}