@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.sys.stat

import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.Stat
import io.github.kotlinmania.libc.new.qurt.sys.stat.cinterop.libcNewQurtSysStatFstat
import io.github.kotlinmania.libc.new.qurt.sys.stat.cinterop.libcNewQurtSysStatStat
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun stat(pathname: ConstPtr<CChar>, statbuf: MutPtr<Stat>): CInt =
    libcNewQurtSysStatStat(pathname.rawAddress.toCPointer<ByteVar>(), statbuf.rawAddress.toCPointer<ByteVar>())

public actual fun fstat(fd: CInt, statbuf: MutPtr<Stat>): CInt =
    libcNewQurtSysStatFstat(fd, statbuf.rawAddress.toCPointer<ByteVar>())
