@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.netbsd.sys.timex

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.netbsd.sys.timex.cinterop.libcNewNetbsdSysTimexNtpAdjtime
import io.github.kotlinmania.libc.new.netbsd.sys.timex.cinterop.libcNewNetbsdSysTimexNtpGettime
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ntpGettime(buf: MutPtr): CInt =
    libcNewNetbsdSysTimexNtpGettime(buf.rawAddress.toCPointer<ByteVar>())

public actual fun ntpAdjtime(buf: MutPtr): CInt =
    libcNewNetbsdSysTimexNtpAdjtime(buf.rawAddress.toCPointer<ByteVar>())
