package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias ShmattT = CUlong

public typealias RegoffT = CInt

public typealias RlimT = CUlong

public typealias RlimitResourceT = CInt

public typealias PriorityWhichT = CUint

public typealias PthreadDescr = MutPtr<CVoid>

public typealias PthreadCondAlignT = CLong

public typealias Ioctl = CUlong
