package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun newlocale(mask: Int, locale: String?, base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer?
