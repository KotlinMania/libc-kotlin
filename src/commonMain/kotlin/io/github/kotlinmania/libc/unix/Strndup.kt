package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun strndup(cs: String?, n: ULong): String?
