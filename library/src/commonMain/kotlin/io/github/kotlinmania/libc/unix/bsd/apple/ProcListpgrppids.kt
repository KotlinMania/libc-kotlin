package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun procListpgrppids(pgrpid: Int, buffer: COpaquePointer?, buffersize: Int): Int
