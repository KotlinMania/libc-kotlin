// port-lint: source new/nto/net/bpf.rs
package io.github.kotlinmania.libc.new.nto.net.bpf

import io.github.kotlinmania.libc.unix.nto.BpfInsn

public val BPF_LD: UShort = 0x00u

public val BPF_LDX: UShort = 0x01u

public val BPF_ST: UShort = 0x02u

public val BPF_STX: UShort = 0x03u

public val BPF_ALU: UShort = 0x04u

public val BPF_JMP: UShort = 0x05u

public val BPF_RET: UShort = 0x06u

public val BPF_MISC: UShort = 0x07u

public val BPF_W: UShort = 0x00u

public val BPF_H: UShort = 0x08u

public val BPF_B: UShort = 0x10u

public val BPF_IMM: UShort = 0x00u

public val BPF_ABS: UShort = 0x20u

public val BPF_IND: UShort = 0x40u

public val BPF_MEM: UShort = 0x60u

public val BPF_LEN: UShort = 0x80u

public val BPF_MSH: UShort = 0xa0u

public val BPF_ADD: UShort = 0x00u

public val BPF_SUB: UShort = 0x10u

public val BPF_MUL: UShort = 0x20u

public val BPF_DIV: UShort = 0x30u

public val BPF_OR: UShort = 0x40u

public val BPF_AND: UShort = 0x50u

public val BPF_LSH: UShort = 0x60u

public val BPF_RSH: UShort = 0x70u

public val BPF_NEG: UShort = 0x80u

public val BPF_MOD: UShort = 0x90u

public val BPF_XOR: UShort = 0xa0u

public val BPF_JA: UShort = 0x00u

public val BPF_JEQ: UShort = 0x10u

public val BPF_JGT: UShort = 0x20u

public val BPF_JGE: UShort = 0x30u

public val BPF_JSET: UShort = 0x40u

public val BPF_K: UShort = 0x00u

public val BPF_X: UShort = 0x08u

public val BPF_A: UShort = 0x10u

public val BPF_TAX: UShort = 0x00u

public val BPF_TXA: UShort = 0x80u

public fun bpfClass(code: UInt): UInt {
    return code and 0x07u
}

public fun bpfSize(code: UInt): UInt {
    return code and 0x18u
}

public fun bpfMode(code: UInt): UInt {
    return code and 0xe0u
}

public fun bpfOp(code: UInt): UInt {
    return code and 0xf0u
}

public fun bpfSrc(code: UInt): UInt {
    return code and 0x08u
}

public fun bpfRval(code: UInt): UInt {
    return code and 0x18u
}

public fun bpfMiscop(code: UInt): UInt {
    return code and 0xf8u
}

public fun bpfStmt(code: UShort, k: UInt): BpfInsn {
    return BpfInsn(code = code, jt = 0u, jf = 0u, k = k)
}

public fun bpfJump(code: UShort, k: UInt, jt: UByte, jf: UByte): BpfInsn {
    return BpfInsn(code = code, jt = jt, jf = jf, k = k)
}
