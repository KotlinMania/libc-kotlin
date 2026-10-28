package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun fputs(s: String?, stream: FILE?): Int
