// port-lint: source unix/haiku/b64.rs
package io.github.kotlinmania.libc.unix.haiku.b64

import io.github.kotlinmania.libc.unix.haiku.Elf64Addr
import io.github.kotlinmania.libc.unix.haiku.Elf64Half
import io.github.kotlinmania.libc.unix.haiku.Elf64Off
import io.github.kotlinmania.libc.unix.haiku.Elf64Word
import io.github.kotlinmania.libc.unix.haiku.Elf64Xword

public typealias TimeT = Long

public typealias ElfAddr = Elf64Addr

public typealias ElfHalf = Elf64Half

public typealias ElfPhdr = Elf64Phdr

public data class Elf64Phdr(
    public var pType: Elf64Word = 0u,
    public var pFlags: Elf64Word = 0u,
    public var pOffset: Elf64Off = 0uL,
    public var pVaddr: Elf64Addr = 0uL,
    public var pPaddr: Elf64Addr = 0uL,
    public var pFilesz: Elf64Xword = 0uL,
    public var pMemsz: Elf64Xword = 0uL,
    public var pAlign: Elf64Xword = 0uL,
)
