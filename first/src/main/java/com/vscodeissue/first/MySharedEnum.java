package com.vscodeissue.first;

import lombok.Getter;

public enum MySharedEnum {
    ECLIPSE(1),
    VSCODE(2),
    INTELLIJ(3),
    ;

    @Getter
    private int numberOfUser;

    MySharedEnum(int numberOfUser) {
        this.numberOfUser = numberOfUser;
    }
}
