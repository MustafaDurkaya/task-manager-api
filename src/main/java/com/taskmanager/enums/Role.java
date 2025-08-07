package com.taskmanager.enums;

import java.util.Set;

public enum Role {
    ADMIN(Set.of("USER_READ", "USER_WRITE", "ADMIN_PANEL"), "Administrator"),
    USER(Set.of("USER_READ", "USER_WRITE"), "Standard User"),
    GUEST(Set.of("PUBLIC_READ"), "Guest User");

    private final Set<String> permissions;
    private final String displayName;

    Role(Set<String> permissions,String displayName) {
        this.permissions = permissions;
        this.displayName = displayName;
    }

    public Set<String> getPermissions() {
        return permissions;
    }
    public String getDisplayName() {return displayName;}

    public boolean hasPermission(String permission) {
        return permissions.contains(permission);
    }
}
