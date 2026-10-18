package io.github.kotlinmania.libc.unix.linuxlike.linux
import io.github.kotlinmania.libc.unix.linuxlike.SchedParam

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): Int
