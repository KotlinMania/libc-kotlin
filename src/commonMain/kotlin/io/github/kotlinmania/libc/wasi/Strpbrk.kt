package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun strpbrk(cs: String?, ct: String?): String?
