@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.netbsd.sys.timex

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ntpGettime(buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.netbsd.sys.timex.cinterop.libc_new_netbsd_sys_timex_ntpGettime(buf?.value?.toCPointer<ByteVar>())

public actual fun ntpAdjtime(buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.netbsd.sys.timex.cinterop.libc_new_netbsd_sys_timex_ntpAdjtime(buf?.value?.toCPointer<ByteVar>())
