package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*

public expect fun popen(command: String?, mode: String?): FILE?
