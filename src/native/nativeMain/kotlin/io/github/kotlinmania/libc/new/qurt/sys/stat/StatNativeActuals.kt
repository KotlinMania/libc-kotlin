@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.sys.stat

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun stat(pathname: String?, statbuf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.sys.stat.cinterop.libc_new_qurt_sys_stat_stat(pathname, statbuf?.value?.toCPointer<ByteVar>())

public actual fun fstat(fd: CInt, statbuf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.sys.stat.cinterop.libc_new_qurt_sys_stat_fstat(fd, statbuf?.value?.toCPointer<ByteVar>())
