package io.github.kotlinmania.libc.windows.gnu

import io.github.kotlinmania.libc.*

// Upstream defines max_align_t differently for 32-bit vs 64-bit targets via
// cfg_if!. The 64-bit variant (priv_: [f64; 4]) is the common case on modern
// Windows GNU targets.
public data class MaxAlignT(
    val priv: List<Double>,
)
