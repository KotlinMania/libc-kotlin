// port-lint: source unix/haiku/b32.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.Elf32Addr
import io.github.kotlinmania.libc.Elf32Half
import io.github.kotlinmania.libc.Elf32Off
import io.github.kotlinmania.libc.Elf32Word

public typealias TimeT = Int

public typealias ElfAddr = Elf32Addr

public typealias ElfHalf = Elf32Half

public typealias ElfPhdr = io.github.kotlinmania.libc.Elf32Phdr

public open class Elf32Phdr(
    public var pType: Elf32Word,
    public var pOffset: Elf32Off,
    public var pVaddr: Elf32Addr,
    public var pPaddr: Elf32Addr,
    public var pFilesz: Elf32Word,
    public var pMemsz: Elf32Word,
    public var pFlags: Elf32Word,
    public var pAlign: Elf32Word,
)
