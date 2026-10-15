// port-lint: source unix/linux_like/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

internal fun cmsgAlign(len: ULong): ULong = (len + ULong.SIZE_BYTES.toULong() - 1uL) and (ULong.SIZE_BYTES.toULong() - 1uL).inv()
