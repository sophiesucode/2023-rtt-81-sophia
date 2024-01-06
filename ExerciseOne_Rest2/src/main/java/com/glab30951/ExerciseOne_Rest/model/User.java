package com.glab30951.ExerciseOne_Rest.model;


import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@Setter
@Getter
@ToString
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class User {


        int id;
        String name;
        String email;

    }
