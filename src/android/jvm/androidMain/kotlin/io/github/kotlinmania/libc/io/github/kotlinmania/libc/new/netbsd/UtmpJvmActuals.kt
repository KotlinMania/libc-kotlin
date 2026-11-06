package io.github.kotlinmania.libc.new.netbsd

import io.github.kotlinmania.libc.COpaquePointer

internal object UtmpRawLibc {
    external fun utmpname(file: String?): Int
    external fun setutent()
    external fun getutent(): Long?
    external fun endutent()
}

public actual fun utmpname(file: String?): CInt =
    UtmpRawLibc.utmpname(file)

public actual fun setutent() {
    UtmpRawLibc.setutent()
}

public actual fun getutent(): Utmp? =
    UtmpRawLibc.getutent()

public actual fun endutent() {
    UtmpRawLibc.endutent()
}
