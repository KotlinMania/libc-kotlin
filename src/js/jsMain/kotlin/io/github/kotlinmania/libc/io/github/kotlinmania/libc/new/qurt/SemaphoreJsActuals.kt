package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').semInit(sem?.toLong() ?: 0L, pshared, value)") as CInt

public actual fun semDestroy(sem: SemT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semDestroy(sem?.toLong() ?: 0L)") as CInt

public actual fun semWait(sem: SemT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semWait(sem?.toLong() ?: 0L)") as CInt

public actual fun semTrywait(sem: SemT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semTrywait(sem?.toLong() ?: 0L)") as CInt

public actual fun semPost(sem: SemT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semPost(sem?.toLong() ?: 0L)") as CInt

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semGetvalue(sem?.toLong() ?: 0L, sval?.toLong() ?: 0L)") as CInt
