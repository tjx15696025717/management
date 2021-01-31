package com.chongqing.domain;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {

    @NonNull
    private Long id;

    private String name;

    private String password;

    private String status;


}