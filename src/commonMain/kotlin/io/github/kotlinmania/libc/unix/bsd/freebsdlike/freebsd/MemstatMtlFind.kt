package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun memstatMtlFind(list: MemoryTypeList?, allocator: Int, name: String?): MemoryType?
