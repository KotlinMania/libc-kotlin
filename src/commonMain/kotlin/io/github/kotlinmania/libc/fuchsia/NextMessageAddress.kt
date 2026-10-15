// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

internal fun nextMessageAddress(cmsg: COpaquePointer?, len: Long): COpaquePointer? {
    if (cmsg == null) return null
    return COpaquePointer(cmsg.value + len)
}
