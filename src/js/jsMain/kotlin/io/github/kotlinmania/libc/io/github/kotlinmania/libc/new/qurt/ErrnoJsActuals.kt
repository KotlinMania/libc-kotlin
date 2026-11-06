package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer

public actual fun errnoLocation(): CInt? =
    js("require('@kotlinmania/libc-native-bindings').errnoLocation()") as CInt?
