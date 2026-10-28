package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun syslog(priority: Int, message: String?, vararg args: Any?)
