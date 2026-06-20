// port-lint: source new/nto/net/bpf.rs
package io.github.kotlinmania.libc.new.nto.net

import io.github.kotlinmania.libc.*

public const val BPF_LD: UShort = 0x00u
public const val BPF_LDX: UShort = 0x01u
public const val BPF_ST: UShort = 0x02u
public const val BPF_STX: UShort = 0x03u
public const val BPF_ALU: UShort = 0x04u
public const val BPF_JMP: UShort = 0x05u
public const val BPF_RET: UShort = 0x06u
public const val BPF_MISC: UShort = 0x07u
public const val BPF_W: UShort = 0x00u
public const val BPF_H: UShort = 0x08u
public const val BPF_B: UShort = 0x10u
public const val BPF_IMM: UShort = 0x00u
public const val BPF_ABS: UShort = 0x20u
public const val BPF_IND: UShort = 0x40u
public const val BPF_MEM: UShort = 0x60u
public const val BPF_LEN: UShort = 0x80u
public const val BPF_MSH: UShort = 0xa0u
public const val BPF_ADD: UShort = 0x00u
public const val BPF_SUB: UShort = 0x10u
public const val BPF_MUL: UShort = 0x20u
public const val BPF_DIV: UShort = 0x30u
public const val BPF_OR: UShort = 0x40u
public const val BPF_AND: UShort = 0x50u
public const val BPF_LSH: UShort = 0x60u
public const val BPF_RSH: UShort = 0x70u
public const val BPF_NEG: UShort = 0x80u
public const val BPF_MOD: UShort = 0x90u
public const val BPF_XOR: UShort = 0xa0u
public const val BPF_JA: UShort = 0x00u
public const val BPF_JEQ: UShort = 0x10u
public const val BPF_JGT: UShort = 0x20u
public const val BPF_JGE: UShort = 0x30u
public const val BPF_JSET: UShort = 0x40u
public const val BPF_K: UShort = 0x00u
public const val BPF_X: UShort = 0x08u
public const val BPF_A: UShort = 0x10u
public const val BPF_TAX: UShort = 0x00u
public const val BPF_TXA: UShort = 0x80u

public fun bpfClass(code: UInt): UInt = code and 0x07u

public fun bpfSize(code: UInt): UInt = code and 0x18u

public fun bpfMode(code: UInt): UInt = code and 0xe0u

public fun bpfOp(code: UInt): UInt = code and 0xf0u

public fun bpfSrc(code: UInt): UInt = code and 0x08u

public fun bpfRval(code: UInt): UInt = code and 0x18u

public fun bpfMiscop(code: UInt): UInt = code and 0xf8u

public fun bpfStmt(code: UShort, k: UInt): BpfInsn =
    BpfInsn(code = code, jt = 0u, jf = 0u, k = k)

public fun bpfJump(code: UShort, k: UInt, jt: UByte, jf: UByte): BpfInsn =
    BpfInsn(code = code, jt = jt, jf = jf, k = k)
