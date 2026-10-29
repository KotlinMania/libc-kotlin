package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

// Returns the ancillary data pointer in a message buffer.
public expect fun cmsgData(cmsg: COpaquePointer?): COpaquePointer?
