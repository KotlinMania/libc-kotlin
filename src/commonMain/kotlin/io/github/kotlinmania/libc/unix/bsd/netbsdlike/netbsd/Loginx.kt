package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd
import io.github.kotlinmania.libc.new.netbsd.Utmpx

import io.github.kotlinmania.libc.*

public expect fun loginx(ut: Utmpx?)
