// port-lint: source unix/solarish/x86.rs
package io.github.kotlinmania.libc.unix.solarish.x86

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort

public typealias Elf32Addr = CUlong

public typealias Elf32Half = CUshort

public typealias Elf32Off = CUlong

public typealias Elf32Sword = CLong

public typealias Elf32Word = CUlong

public typealias Elf32Lword = CUlonglong

public typealias Elf32Phdr = CAnonymousElf32Phdr

public data class CAnonymousElf32Phdr(
    public var pType: Elf32Word = 0uL,
    public var pOffset: Elf32Off = 0uL,
    public var pVaddr: Elf32Addr = 0uL,
    public var pPaddr: Elf32Addr = 0uL,
    public var pFilesz: Elf32Word = 0uL,
    public var pMemsz: Elf32Word = 0uL,
    public var pFlags: Elf32Word = 0uL,
    public var pAlign: Elf32Word = 0uL,
)

public data class DlPhdrInfo(
    public var dlpiAddr: Elf32Addr = 0uL,
    public var dlpiName: COpaquePointer? = null,
    public var dlpiPhdr: CAnonymousElf32Phdr? = null,
    public var dlpiPhnum: Elf32Half = 0u,
    public var dlpiAdds: CUlonglong = 0uL,
    public var dlpiSubs: CUlonglong = 0uL,
)
