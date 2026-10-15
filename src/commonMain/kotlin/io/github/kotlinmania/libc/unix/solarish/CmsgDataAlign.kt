// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

internal fun cmsgDataAlign(p: ULong): ULong =
    (p + 4uL - 1uL) and (4uL - 1uL).inv()
