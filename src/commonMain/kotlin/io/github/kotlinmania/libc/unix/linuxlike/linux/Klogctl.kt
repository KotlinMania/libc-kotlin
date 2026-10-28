package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun klogctl(syslogType: Int, bufp: String?, len: Int): Int
