// port-lint: source unix/solarish/x86_common.rs
package io.github.kotlinmania.libc.unix.solarish

// AT_SUN_HWCAP
public val AV_386_FPU: UInt = 0x00001u

public val AV_386_TSC: UInt = 0x00002u

public val AV_386_CX8: UInt = 0x00004u

public val AV_386_SEP: UInt = 0x00008u

public val AV_386_AMD_SYSC: UInt = 0x00010u

public val AV_386_CMOV: UInt = 0x00020u

public val AV_386_MMX: UInt = 0x00040u

public val AV_386_AMD_MMX: UInt = 0x00080u

public val AV_386_AMD_3D_NOW: UInt = 0x00100u

public val AV_386_AMD_3D_NOWX: UInt = 0x00200u

public val AV_386_FXSR: UInt = 0x00400u

public val AV_386_SSE: UInt = 0x00800u

public val AV_386_SSE2: UInt = 0x01000u

public val AV_386_CX16: UInt = 0x10000u

public val AV_386_AHF: UInt = 0x20000u

public val AV_386_TSCP: UInt = 0x40000u

public val AV_386_AMD_SSE4A: UInt = 0x80000u

public val AV_386_POPCNT: UInt = 0x100000u

public val AV_386_AMD_LZCNT: UInt = 0x200000u

public val AV_386_SSSE3: UInt = 0x400000u

public val AV_386_SSE4_1: UInt = 0x800000u

public val AV_386_SSE4_2: UInt = 0x1000000u

public val AV_386_MOVBE: UInt = 0x2000000u

public val AV_386_AES: UInt = 0x4000000u

public val AV_386_PCLMULQDQ: UInt = 0x8000000u

public val AV_386_XSAVE: UInt = 0x10000000u

public val AV_386_AVX: UInt = 0x20000000u

public val AV_386_VMX: UInt = 0x40000000u

public val AV_386_AMD_SVM: UInt = 0x80000000u

// AT_SUN_HWCAP2
public val AV_386_2_F16C: UInt = 0x00000001u

public val AV_386_2_RDRAND: UInt = 0x00000002u

public val AV_386_2_BMI1: UInt = 0x00000004u

public val AV_386_2_BMI2: UInt = 0x00000008u

public val AV_386_2_FMA: UInt = 0x00000010u

public val AV_386_2_AVX2: UInt = 0x00000020u

public val AV_386_2_ADX: UInt = 0x00000040u

public val AV_386_2_RDSEED: UInt = 0x00000080u

public val AV_386_2_AVX512F: UInt = 0x00000100u

public val AV_386_2_AVX512DQ: UInt = 0x00000200u

public val AV_386_2_AVX512IFMA: UInt = 0x00000400u

public val AV_386_2_AVX512PF: UInt = 0x00000800u

public val AV_386_2_AVX512ER: UInt = 0x00001000u

public val AV_386_2_AVX512CD: UInt = 0x00002000u

public val AV_386_2_AVX512BW: UInt = 0x00004000u

public val AV_386_2_AVX512VL: UInt = 0x00008000u

public val AV_386_2_AVX512VBMI: UInt = 0x00010000u

public val AV_386_2_AVX512VPOPCDQ: UInt = 0x00020000u

public val AV_386_2_AVX512_4NNIW: UInt = 0x00040000u

public val AV_386_2_AVX512_4FMAPS: UInt = 0x00080000u

public val AV_386_2_SHA: UInt = 0x00100000u

public val AV_386_2_FSGSBASE: UInt = 0x00200000u

public val AV_386_2_CLFLUSHOPT: UInt = 0x00400000u

public val AV_386_2_CLWB: UInt = 0x00800000u

public val AV_386_2_MONITORX: UInt = 0x01000000u

public val AV_386_2_CLZERO: UInt = 0x02000000u

public val AV_386_2_AVX512_VNNI: UInt = 0x04000000u

public val AV_386_2_VPCLMULQDQ: UInt = 0x08000000u

public val AV_386_2_VAES: UInt = 0x10000000u

// AT_SUN_FPTYPE
public val AT_386_FPINFO_NONE: UInt = 0u

public val AT_386_FPINFO_FXSAVE: UInt = 1u

public val AT_386_FPINFO_XSAVE: UInt = 2u

public val AT_386_FPINFO_XSAVE_AMD: UInt = 3u
