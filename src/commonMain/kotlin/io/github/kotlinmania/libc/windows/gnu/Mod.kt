// port-lint: source libc/src/windows/gnu/mod.rs
package io.github.kotlinmania.libc.windows.gnu

import io.github.kotlinmania.libc.*

// Upstream defines max_align_t differently for 32-bit vs 64-bit targets via
// cfg_if!. The 64-bit variant (priv_: [f64; 4]) is the common case on modern
// Windows GNU targets.
public data class MaxAlignT(
    val priv: List<Double>,
)

public const val STDIN_FILENO: CInt = 0
public const val STDOUT_FILENO: CInt = 1
public const val STDERR_FILENO: CInt = 2

public fun strcasecmp(s1: String?, s2: String?): CInt = -1

public fun strncasecmp(s1: String?, s2: String?, n: ULong): CInt = -1

public fun wmemchr(cx: WcharT?, c: WcharT, n: ULong): WcharT? = null
