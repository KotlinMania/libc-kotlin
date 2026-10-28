package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun fopen(filename: String?, mode: String?): FILE?
