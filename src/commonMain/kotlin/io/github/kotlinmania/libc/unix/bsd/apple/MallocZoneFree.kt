package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun mallocZoneFree(zone: io.github.kotlinmania.libc.COpaquePointer?, ptr: COpaquePointer?)
