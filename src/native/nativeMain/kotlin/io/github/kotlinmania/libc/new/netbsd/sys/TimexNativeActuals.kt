@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.netbsd.sys

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import io.github.kotlinmania.libc.*
import kotlinx.cinterop.*

public actual fun ntpGettime(buf: Ntptimeval?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_timex_ntp_gettime(buf?.value?.toCPointer<ByteVar>())

public actual fun ntpAdjtime(buf: Timex?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_timex_ntp_adjtime(buf?.value?.toCPointer<ByteVar>())
