package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun freopen(filename: String?, mode: String?, file: FILE?): FILE?
