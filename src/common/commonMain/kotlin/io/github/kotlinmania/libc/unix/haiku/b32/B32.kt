// port-lint: source unix/haiku/b32.rs
package io.github.kotlinmania.libc.unix.haiku.b32

import io.github.kotlinmania.libc.unix.haiku.Elf32Addr
import io.github.kotlinmania.libc.unix.haiku.Elf32Half
import io.github.kotlinmania.libc.unix.haiku.Elf32Off
import io.github.kotlinmania.libc.unix.haiku.Elf32Word

public typealias TimeT = Int

public typealias ElfAddr = Elf32Addr

public typealias ElfHalf = Elf32Half

public typealias ElfPhdr = Elf32Phdr

public data class Elf32Phdr(
    public var pType: Elf32Word = 0u,
    public var pOffset: Elf32Off = 0u,
    public var pVaddr: Elf32Addr = 0u,
    public var pPaddr: Elf32Addr = 0u,
    public var pFilesz: Elf32Word = 0u,
    public var pMemsz: Elf32Word = 0u,
    public var pFlags: Elf32Word = 0u,
    public var pAlign: Elf32Word = 0u,
)
