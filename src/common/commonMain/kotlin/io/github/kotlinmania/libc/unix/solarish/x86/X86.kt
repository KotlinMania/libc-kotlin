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

public open class CAnonymousElf32Phdr(
    public var pType: Elf32Word,
    public var pOffset: Elf32Off,
    public var pVaddr: Elf32Addr,
    public var pPaddr: Elf32Addr,
    public var pFilesz: Elf32Word,
    public var pMemsz: Elf32Word,
    public var pFlags: Elf32Word,
    public var pAlign: Elf32Word,
)

public open class DlPhdrInfo(
    public var dlpiAddr: Elf32Addr,
    public var dlpiName: COpaquePointer?,
    public var dlpiPhdr: CAnonymousElf32Phdr?,
    public var dlpiPhnum: Elf32Half,
    public var dlpiAdds: CUlonglong,
    public var dlpiSubs: CUlonglong,
)
