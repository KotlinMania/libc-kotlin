package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.COpaquePointer

public actual fun schedYield(): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedYield()") as CInt

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetPriorityMax(policy)") as CInt

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetPriorityMin(policy)") as CInt
