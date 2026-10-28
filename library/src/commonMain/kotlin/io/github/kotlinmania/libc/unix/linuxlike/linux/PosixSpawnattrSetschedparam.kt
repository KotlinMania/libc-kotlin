package io.github.kotlinmania.libc.unix.linuxlike.linux
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.SchedParam

public expect fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): Int
