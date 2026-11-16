@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.common.linuxlike.pthread

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.common.linuxlike.pthread.cinterop.libcNewCommonLinuxlikePthreadPthreadGetaffinityNp
import io.github.kotlinmania.libc.new.common.linuxlike.pthread.cinterop.libcNewCommonLinuxlikePthreadPthreadGetattrNp
import io.github.kotlinmania.libc.new.common.linuxlike.pthread.cinterop.libcNewCommonLinuxlikePthreadPthreadGetnameNp
import io.github.kotlinmania.libc.new.common.linuxlike.pthread.cinterop.libcNewCommonLinuxlikePthreadPthreadSetaffinityNp
import io.github.kotlinmania.libc.new.common.linuxlike.pthread.cinterop.libcNewCommonLinuxlikePthreadPthreadSetnameNp
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: MutPtr): CInt =
    libcNewCommonLinuxlikePthreadPthreadGetaffinityNp(thread.toLong().toCPointer<ByteVar>(), cpusetsize, cpuset.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetattrNp(native: PthreadT, attr: MutPtr): CInt =
    libcNewCommonLinuxlikePthreadPthreadGetattrNp(native.toLong().toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr, len: SizeT): CInt =
    libcNewCommonLinuxlikePthreadPthreadGetnameNp(thread.toLong().toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: ConstPtr): CInt =
    libcNewCommonLinuxlikePthreadPthreadSetaffinityNp(thread.toLong().toCPointer<ByteVar>(), cpusetsize, cpuset.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr): CInt =
    libcNewCommonLinuxlikePthreadPthreadSetnameNp(thread.toLong().toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())
