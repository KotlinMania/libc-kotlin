package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun freopen(a: String?, b: String?, f: FILE?): FILE?
