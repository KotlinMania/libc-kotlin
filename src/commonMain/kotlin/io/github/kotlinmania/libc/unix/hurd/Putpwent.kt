package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun putpwent(p: Passwd?, stream: FILE?): Int
