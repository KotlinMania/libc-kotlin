package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun openlog(ident: String?, logopt: Int, facility: Int)
