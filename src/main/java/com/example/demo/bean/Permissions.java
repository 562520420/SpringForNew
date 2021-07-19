package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
public class Permissions {
    private String id;
    private String permissionsName;

//    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        set.add("1");
//        set.add("2");
//        set.add("3");
//        Set<String> stringSet = new HashSet<>();
//        stringSet.add("4");
//        stringSet.add("3");
//        stringSet.add("5");
//        stringSet.add("6");
//        set.addAll(stringSet);
//        System.out.println(set.toString());
//    }
}
