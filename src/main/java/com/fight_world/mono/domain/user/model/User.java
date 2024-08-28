package com.fight_world.mono.domain.user.model;

import com.fight_world.mono.domain.model.TimeBase;
import com.fight_world.mono.domain.user.dto.request.UserSignUpDto;
import com.fight_world.mono.domain.user.model.value_object.UserEmail;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "p_user")
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends TimeBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    @Embedded
    private UserEmail email;

    private String role;

    private String nickname;

    @Builder(access = AccessLevel.PRIVATE)
    public User(String username, String password, UserEmail email, String role, String nickname) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.nickname = nickname;
    }

    public static User of(UserSignUpDto userSignUpDto, String encodedPassword) {

        return User.builder()
                   .username(userSignUpDto.username())
                   .password(encodedPassword)
                   .email(new UserEmail(userSignUpDto.email()))
                   .role(userSignUpDto.role())
                   .nickname(userSignUpDto.nickname())
                   .build();
    }
}
