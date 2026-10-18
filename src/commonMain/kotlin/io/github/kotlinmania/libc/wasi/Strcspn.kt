package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun strcspn(cs: String?, ct: String?): ULong
