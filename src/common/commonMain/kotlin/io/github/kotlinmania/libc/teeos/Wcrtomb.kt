package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun wcrtomb(s: String?, wc: UInt, st: MbstateT?): ULong
