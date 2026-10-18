package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.unix.linuxlike.Lconv

import io.github.kotlinmania.libc.*

public expect fun localeconv(): Lconv?
