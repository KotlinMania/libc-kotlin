package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.new.netbsd.Utmp

public expect fun login(ut: Utmp?)
