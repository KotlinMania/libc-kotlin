// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

internal fun cmsgHdrAlign(p: ULong): ULong =
    (p + 8uL - 1uL) and (8uL - 1uL).inv()
