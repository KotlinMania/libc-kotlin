package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.powerpc64

import io.github.kotlinmania.libc.*

public expect fun makecontext(ucp: UcontextT?, func: (() -> Unit)?, argc: Int, vararg args: Any?)
