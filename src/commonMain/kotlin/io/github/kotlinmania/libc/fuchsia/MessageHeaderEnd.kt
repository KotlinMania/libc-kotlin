// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

internal fun messageHeaderEnd(mhdr: Msghdr?): COpaquePointer? {
    val ctrl = mhdr?.msgControl ?: return null
    return COpaquePointer(ctrl.value + mhdr.msgControllen.toLong())
}
