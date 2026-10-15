// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

internal fun alignedMessageLength(cmsg: Cmsghdr): Long {
    val longSize = 8uL
    return (((cmsg.cmsgLen.toULong() + longSize - 1uL) and (longSize - 1uL).inv())).toLong()
}
