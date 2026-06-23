// port-lint: source windows/gnu/mod.rs
package io.github.kotlinmania.libc.windows.gnu

import io.github.kotlinmania.libc.*

public data class MaxAlignT(
    val priv: List<Double>,
)

public data class MaxAlignT(
    val priv: LongArray,
)

public const val STDIN_FILENO: CInt = 0
public const val STDOUT_FILENO: CInt = 1
public const val STDERR_FILENO: CInt = 2

public expect fun strcasecmp(s1: String?, s2: String?): CInt

public expect fun strncasecmp(s1: String?, s2: String?, n: ULong): CInt

public expect fun wmemchr(cx: WcharT?, c: WcharT, n: ULong): WcharT?
