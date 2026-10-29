package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun strsignal(sig: Int): String?
