package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CpulevelT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CpuwhichT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: MutPtr, arg1: ConstPtr, arg2: ConstPtr): CInt
}

public fun makedev(major: CUint, minor: CUint): DevT {
    val major1 = major.toULong()
    val minor1 = minor.toULong()
    var dev = 0uL
    dev = dev or (((major1 and 0xffffff00uL)) shl 32)
    dev = dev or (((major1 and 0x000000ffuL)) shl 8)
    dev = dev or (((minor1 and 0x0000ff00uL)) shl 24)
    dev = dev or (((minor1 and 0xffff00ffuL)) shl 0)
    return dev
}

public fun major(dev: DevT): CInt = (((dev shr 32) and 0xffffff00uL) or ((dev shr 8) and 0xffuL)).toInt()

public fun minor(dev: DevT): CInt = (((dev shr 24) and 0xff00uL) or (dev and 0xffff00ffuL)).toInt()

public expect fun setgrent()

public expect fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt

public expect fun freelocale(loc: LocaleT)

public expect fun msgrcv(msqid: CInt, msgp: MutPtr, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT

public expect fun cpusetGetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: MutPtr, policy: MutPtr): CInt

public expect fun cpusetSetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: ConstPtr, policy: CInt): CInt

public expect fun dirname(path: MutPtr): MutPtr

public expect fun basename(path: MutPtr): MutPtr

public expect fun qsortR(base: MutPtr, num: SizeT, size: SizeT, arg: MutPtr, compar: QsortRComparCallback?)

public expect fun kvmKerndisp(kd: MutPtr): KssizeT
