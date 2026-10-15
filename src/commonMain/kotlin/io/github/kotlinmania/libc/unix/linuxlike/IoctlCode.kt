package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

internal inline fun <reified T> ioctlCode(ty: UInt, nr: UInt): Int {
    val size =
        when (T::class) {
            Int::class, Int::class -> 4
            UInt::class, UInt::class -> 4
            Long::class, Long::class -> 8
            ULong::class, ULong::class -> 8
            Short::class, Short::class -> 2
            UShort::class, UShort::class -> 2
            Byte::class, Byte::class -> 1
            UByte::class, UByte::class -> 1
            else -> 4
        }
    return (
        (_IOC_WRITE.toInt() shl _IOC_DIRSHIFT) or
            (ty.toInt() shl _IOC_TYPESHIFT) or
            (nr.toInt() shl _IOC_NRSHIFT) or
            (size shl _IOC_SIZESHIFT)
    )
}
