package com.company.springsecurity.config;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.company.springsecurity.config.UserPermission.*;

public enum UserRole {
    ADMIN(Sets.newHashSet(COURSE_READ, COURSE_WRITE, STUDENT_WRITE, STUDENT_READ)),
    STUDENT(Sets.newHashSet());

    public final Set<UserPermission> permissions;

    UserRole(Set<UserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<UserPermission> getPermissions(){
        return this.permissions;
    }
}







