package com.team10.whatis.email.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Email {
    @Id
    @Column(nullable = false,unique = true)
    private String email;
    private String code;

    private Email(String email) {
        this.email = email;
        this.code = code;
    }
    private void setCode(String code){
        this.code = code;
    }

    public static void updateCode(Email email,String code){
        email.setCode(code);
    }

}
