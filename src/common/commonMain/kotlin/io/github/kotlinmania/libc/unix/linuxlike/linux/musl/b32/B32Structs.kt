package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUlong

public open class PthreadAttrT(public var size: List<UInt>)

public open class SigsetT(public var value: List<CUlong>)

public open class SemT(public var value: List<CInt>)
