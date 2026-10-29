package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): Int
