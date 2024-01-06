package com.suleman.practicewithshikha.model;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserForm {

    private Integer id;
    private String name;
    private String email;
    private String password;
    private String gender;
    private String profession;
    private String address;


}
