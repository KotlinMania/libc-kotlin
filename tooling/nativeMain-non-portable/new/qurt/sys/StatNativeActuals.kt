@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt.sys

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import io.github.kotlinmania.libc.*
import kotlinx.cinterop.*

public actual fun stat(pathname: String?, statbuf: Stat?): CInt =
    libc.cinterop.libc_stat_stat(pathname, statbuf?.value?.toCPointer<ByteVar>())

public actual fun fstat(fd: CInt, statbuf: Stat?): CInt =
    libc.cinterop.libc_stat_fstat(fd, statbuf?.value?.toCPointer<ByteVar>())
