package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun mallocZoneCalloc(zone: io.github.kotlinmania.libc.COpaquePointer?, numItems: ULong, size: ULong): COpaquePointer?
