package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd
import io.github.kotlinmania.libc.new.netbsd.Utmp

import io.github.kotlinmania.libc.*

public expect fun login(ut: Utmp?)
