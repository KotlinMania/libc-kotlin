package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer

internal object FcntlRawLibc {
    external fun creat(pathname: String?, mode: Int): Int
}

public actual fun creat(pathname: String?, mode: ModeT): CInt =
    FcntlRawLibc.creat(pathname, mode)
