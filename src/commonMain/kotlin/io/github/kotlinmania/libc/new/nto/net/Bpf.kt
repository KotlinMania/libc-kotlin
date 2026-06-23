// port-lint: source new/nto/net/bpf.rs
package io.github.kotlinmania.libc.new.nto.net

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public val BPF_LD: UShort = (0x00).toUShort()
public val BPF_LDX: UShort = (0x01).toUShort()
public val BPF_ST: UShort = (0x02).toUShort()
public val BPF_STX: UShort = (0x03).toUShort()
public val BPF_ALU: UShort = (0x04).toUShort()
public val BPF_JMP: UShort = (0x05).toUShort()
public val BPF_RET: UShort = (0x06).toUShort()
public val BPF_MISC: UShort = (0x07).toUShort()
public val BPF_W: UShort = (0x00).toUShort()
public val BPF_H: UShort = (0x08).toUShort()
public val BPF_B: UShort = (0x10).toUShort()
public val BPF_IMM: UShort = (0x00).toUShort()
public val BPF_ABS: UShort = (0x20).toUShort()
public val BPF_IND: UShort = (0x40).toUShort()
public val BPF_MEM: UShort = (0x60).toUShort()
public val BPF_LEN: UShort = (0x80).toUShort()
public val BPF_MSH: UShort = (0xa0).toUShort()
public val BPF_ADD: UShort = (0x00).toUShort()
public val BPF_SUB: UShort = (0x10).toUShort()
public val BPF_MUL: UShort = (0x20).toUShort()
public val BPF_DIV: UShort = (0x30).toUShort()
public val BPF_OR: UShort = (0x40).toUShort()
public val BPF_AND: UShort = (0x50).toUShort()
public val BPF_LSH: UShort = (0x60).toUShort()
public val BPF_RSH: UShort = (0x70).toUShort()
public val BPF_NEG: UShort = (0x80).toUShort()
public val BPF_MOD: UShort = (0x90).toUShort()
public val BPF_XOR: UShort = (0xa0).toUShort()
public val BPF_JA: UShort = (0x00).toUShort()
public val BPF_JEQ: UShort = (0x10).toUShort()
public val BPF_JGT: UShort = (0x20).toUShort()
public val BPF_JGE: UShort = (0x30).toUShort()
public val BPF_JSET: UShort = (0x40).toUShort()
public val BPF_K: UShort = (0x00).toUShort()
public val BPF_X: UShort = (0x08).toUShort()
public val BPF_A: UShort = (0x10).toUShort()
public val BPF_TAX: UShort = (0x00).toUShort()
public val BPF_TXA: UShort = (0x80).toUShort()

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun bPFCLASS(code: UInt): UInt
public expect fun bPFSIZE(code: UInt): UInt
public expect fun bPFMODE(code: UInt): UInt
public expect fun bPFOP(code: UInt): UInt
public expect fun bPFSRC(code: UInt): UInt
public expect fun bPFRVAL(code: UInt): UInt
public expect fun bPFMISCOP(code: UInt): UInt
public expect fun bPFSTMT(code: UShort, k: UInt): BpfInsn
public expect fun bPFJUMP(code: UShort, k: UInt, jt: UByte, jf: UByte): BpfInsn
