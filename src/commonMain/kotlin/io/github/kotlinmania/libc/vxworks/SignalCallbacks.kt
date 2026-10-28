package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.COpaquePointer

public fun interface TerminatingSignalHandler {
    public operator fun invoke(signal: Int): Nothing
}

public fun interface TerminatingSignalAction {
    public operator fun invoke(signal: Int, info: SiginfoT?, context: COpaquePointer?): Nothing
}
