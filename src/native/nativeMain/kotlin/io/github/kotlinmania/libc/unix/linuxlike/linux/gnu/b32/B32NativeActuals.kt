@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.cinterop.libcUnixLinuxlikeLinuxGnuB32Sysctl
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun sysctl(name: MutPtr<CInt>, namelen: CInt, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt =
    libcUnixLinuxlikeLinuxGnuB32Sysctl(name.rawAddress.toCPointer<ByteVar>(), namelen, oldp.rawAddress.toCPointer<ByteVar>(), oldlenp.rawAddress.toCPointer<ByteVar>(), newp.rawAddress.toCPointer<ByteVar>(), newlen)
