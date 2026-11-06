package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.COpaquePointer

internal object Powerpc64RawLibc {
    external fun getsystemcfg(label: Int): Long
}

public actual fun getsystemcfg(label: CInt): CUlong =
    Powerpc64RawLibc.getsystemcfg(label)
