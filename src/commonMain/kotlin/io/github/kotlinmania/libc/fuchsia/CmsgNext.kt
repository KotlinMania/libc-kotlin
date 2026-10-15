// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

internal fun cmsgNext(cmsg: COpaquePointer?, len: Long): COpaquePointer? = nextMessageAddress(cmsg, len)
