package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664

import io.github.kotlinmania.libc.*

public expect fun makecontext(ucp: UcontextT?, func: (() -> Unit)?, argc: Int, vararg args: Any?)
