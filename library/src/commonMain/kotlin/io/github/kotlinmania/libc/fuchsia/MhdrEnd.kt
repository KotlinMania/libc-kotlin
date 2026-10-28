package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

internal fun mhdrEnd(mhdr: Msghdr?): COpaquePointer? = messageHeaderEnd(mhdr)
