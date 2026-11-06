package io.github.kotlinmania.libc.new.netbsd.sys

import io.github.kotlinmania.libc.COpaquePointer

public actual fun ntpGettime(buf: Ntptimeval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ntpGettime(buf?.toLong() ?: 0L)") as CInt

public actual fun ntpAdjtime(buf: Timex?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ntpAdjtime(buf?.toLong() ?: 0L)") as CInt
