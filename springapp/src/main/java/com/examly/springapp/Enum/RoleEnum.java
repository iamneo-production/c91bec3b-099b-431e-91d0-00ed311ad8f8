package com.examly.springapp.Enum;

public enum RoleEnum {

    USER(0, "ROLE_USER"),
    ADMIN(1, "ROLE_ADMIN"),
    SUPER_ADMIN(2, "ROLE_SUPERADMIN");

    private int value;
    private String role;

    RoleEnum(int value, String role) {
        this.value = value;
        this.role = role;
    }

    public static String getRoleString(int value){
        for (RoleEnum role: values()){
            if(role.value == value){
                return role.role;
            }
        }
        throw new RuntimeException("Invalid Role");
    }
}