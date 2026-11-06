// port-lint: source unix/haiku/b64.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.Elf64Addr
import io.github.kotlinmania.libc.Elf64Half
import io.github.kotlinmania.libc.Elf64Off
import io.github.kotlinmania.libc.Elf64Word
import io.github.kotlinmania.libc.Elf64Xword

public typealias TimeT = Long

public typealias ElfAddr = Elf64Addr

public typealias ElfHalf = Elf64Half

public typealias ElfPhdr = io.github.kotlinmania.libc.Elf64Phdr

public open class Elf64Phdr(
    public var pType: Elf64Word,
    public var pFlags: Elf64Word,
    public var pOffset: Elf64Off,
    public var pVaddr: Elf64Addr,
    public var pPaddr: Elf64Addr,
    public var pFilesz: Elf64Xword,
    public var pMemsz: Elf64Xword,
    public var pAlign: Elf64Xword,
)
