package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer

public actual fun creat(pathname: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').creat(pathname, mode)") as CInt
