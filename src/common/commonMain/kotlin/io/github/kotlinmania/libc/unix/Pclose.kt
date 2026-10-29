package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun pclose(stream: FILE?): Int
