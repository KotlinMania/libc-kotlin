package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun utime(file: String?, buf: Utimbuf?): Int
