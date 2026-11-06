package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.COpaquePointer

public actual fun getsystemcfg(label: CInt): CUlong =
    js("require('@kotlinmania/libc-native-bindings').getsystemcfg(label)") as CUlong
