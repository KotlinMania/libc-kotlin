package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun localtime(timeP: Long?): Tm?
