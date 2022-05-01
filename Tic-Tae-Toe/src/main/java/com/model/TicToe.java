package com.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor // 클래스에 존재하는 모든 필드에 대한 생성자를 자동 생성해준다.
@Getter
public enum TicToe {
    X(1),O(2); // empyy는 0

    private Integer value;
}
