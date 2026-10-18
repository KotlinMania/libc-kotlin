package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): Int
