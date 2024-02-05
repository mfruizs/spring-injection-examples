package com.mfruizs.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum InterfaceSelector {
    A(1),
    B(2);

    private final Integer selector;

}
