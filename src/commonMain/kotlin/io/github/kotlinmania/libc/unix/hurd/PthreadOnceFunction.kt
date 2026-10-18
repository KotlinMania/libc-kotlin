package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun pthreadOnce(control: io.github.kotlinmania.libc.unix.hurd.PthreadOnce?, routine: (() -> Unit)?): Int
