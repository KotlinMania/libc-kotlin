package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun freopen64(filename: String?, mode: String?, file: FILE?): FILE?
