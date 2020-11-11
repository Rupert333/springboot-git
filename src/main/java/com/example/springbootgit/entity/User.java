package com.example.springbootgit.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Title: 人员实体类,
 *
 * @author yangyuegang
 * @create: 2020/11/11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private String userid;
    private String userName;
    private String pwd;
}
