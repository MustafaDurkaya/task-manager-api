package com.taskmanager.enums;

import java.util.Set;

public enum Role {
    ADMIN(Set.of("USER_READ", "USER_WRITE", "ADMIN_PANEL")),
    USER(Set.of("USER_READ", "USER_WRITE")),
    GUEST(Set.of("PUBLIC_READ"));

    private final Set<String> permissions;

    Role(Set<String> permissions) {
        this.permissions = permissions;
    }

    public Set<String> getPermissions() {
        return permissions;
    }
}
