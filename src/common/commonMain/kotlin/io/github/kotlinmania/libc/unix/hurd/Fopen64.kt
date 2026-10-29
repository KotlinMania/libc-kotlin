package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun fopen64(filename: String?, mode: String?): FILE?
