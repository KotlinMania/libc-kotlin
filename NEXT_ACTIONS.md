# Immediate Actions - High-Value Files

Based on AST analysis, here are the concrete next steps.

## Summary

- **Files Present:** 5/340 (1.5%)
- **Function parity:** 0/113 matched — 0.0%
- **Class/type parity:** 17/368 matched (target 22) — 4.6%
- **Combined symbol parity:** 17/481 matched (target 22) — 3.5%
- **Average inline-code cosine:** 1.00 (function body across 2 matched files)
- **Average documentation cosine:** 0.38 (doc text across 2 matched files)
- **Cheat-zeroed Files:** 2
- **Critical Issues:** 3 files with <0.60 function similarity

## Priority 1: Fix Incomplete High-Dependency Files

No incomplete high-dependency files detected.

## Priority 2: Port Missing High-Value Files

Critical missing files (>10 dependencies):

No missing high-value files detected.

## Detailed Work Items

Every matched file is listed below with function and type symbol parity.

### 1. musl.pthread

- **Target:** `musl.Pthread [STUB] [PROVENANCE-FALLBACK]`
- **Similarity:** 0.00
- **Dependents:** 1
- **Priority Score:** 1000010.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched
- **Missing types:** _none_
- **Provenance warning:** port-lint provenance header matched only after fallback normalization: `new/musl/pthread.rs` vs expected `new/musl/pthread.rs`
- **Proposed provenance header:** `// port-lint: source new/musl/pthread.rs` (current: `// port-lint: source new/musl/pthread.rs`)
- **Lint issues:** 1

### 2. primitives

- **Target:** `libc.Primitives [PROVENANCE-FALLBACK]`
- **Similarity:** 1.00
- **Dependents:** 0
- **Priority Score:** 1600.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 16/16 matched (target 21)
- **Missing types:** _none_
- **Provenance warning:** port-lint provenance header matched only after fallback normalization: `primitives.rs` vs expected `primitives.rs`
- **Proposed provenance header:** `// port-lint: source primitives.rs` (current: `// port-lint: source primitives.rs`)
- **Lint issues:** 1

### 3. solid.aarch64

- **Target:** `solid.Aarch64 [PROVENANCE-FALLBACK]`
- **Similarity:** 1.00
- **Dependents:** 0
- **Priority Score:** 100.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 1/1 matched
- **Missing types:** _none_
- **Provenance warning:** port-lint provenance header matched only after fallback normalization: `solid/aarch64.rs` vs expected `solid/aarch64.rs`
- **Proposed provenance header:** `// port-lint: source solid/aarch64.rs` (current: `// port-lint: source solid/aarch64.rs`)
- **Lint issues:** 1

### 4. sgx.mod

- **Target:** `sgx.Mod [STUB] [PROVENANCE-FALLBACK]`
- **Similarity:** 0.00
- **Dependents:** 0
- **Priority Score:** 10.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched
- **Missing types:** _none_
- **Provenance warning:** port-lint provenance header matched only after fallback normalization: `new/sgx/mod.rs` vs expected `new/sgx/mod.rs`
- **Proposed provenance header:** `// port-lint: source new/sgx/mod.rs` (current: `// port-lint: source new/sgx/mod.rs`)
- **Lint issues:** 1

### 5. common.bsd

- **Target:** `common.Bsd [STUB] [PROVENANCE-FALLBACK]`
- **Similarity:** 1.00
- **Dependents:** 0
- **Priority Score:** 0.0
- **Functions:** 0/0 matched
- **Missing functions:** _none_
- **Types:** 0/0 matched
- **Missing types:** _none_
- **Provenance warning:** port-lint provenance header matched only after fallback normalization: `new/common/bsd.rs` vs expected `new/common/bsd.rs`
- **Proposed provenance header:** `// port-lint: source new/common/bsd.rs` (current: `// port-lint: source new/common/bsd.rs`)
- **Lint issues:** 1

## Success Criteria

For each file to be considered "complete":
- **Similarity ≥ 0.85** (Excellent threshold)
- All public APIs ported
- All tests ported
- Documentation ported
- port-lint header present

## Reexport / Wiring Modules

These files match `reexport_modules` patterns in `.ast_distance_config.json`. They are filtered out of
normal priority and missing-file ladders because they are wiring
modules, not direct logic ports. Consult them for call-site routing;
do not treat them as the next implementation target by default.

### Missing

| Source | Expected target | Deps | Source path | Expected path |
|--------|-----------------|------|-------------|---------------|
| `bsd.mod` | `unix.bsd.Mod` | 0 | `src/unix/bsd/mod.rs` | `unix/bsd/Mod.kt` |
| `lib` | `Lib` | 0 | `src/lib.rs` | `Lib.kt` |
| `aix.mod` | `new.aix.Mod` | 0 | `src/new/aix/mod.rs` | `new/aix/Mod.kt` |
| `libpthread.mod` | `new.apple.libpthread.Mod` | 0 | `src/new/apple/libpthread/mod.rs` | `new/apple/libpthread/Mod.kt` |
| `new.apple.libpthread.sys.mod` | `new.apple.libpthread.sys.Mod` | 0 | `src/new/apple/libpthread/sys/mod.rs` | `new/apple/libpthread/sys/Mod.kt` |
| `apple.mod` | `new.apple.Mod` | 0 | `src/new/apple/mod.rs` | `new/apple/Mod.kt` |
| `mach.mod` | `new.apple.xnu.mach.Mod` | 0 | `src/new/apple/xnu/mach/mod.rs` | `new/apple/xnu/mach/Mod.kt` |
| `xnu.mod` | `new.apple.xnu.Mod` | 0 | `src/new/apple/xnu/mod.rs` | `new/apple/xnu/Mod.kt` |
| `new.apple.xnu.sys.mod` | `new.apple.xnu.sys.Mod` | 0 | `src/new/apple/xnu/sys/mod.rs` | `new/apple/xnu/sys/Mod.kt` |
| `bionic_libc.mod` | `new.bioniclibc.Mod` | 0 | `src/new/bionic_libc/mod.rs` | `new/bioniclibc/Mod.kt` |
| `new.bionic_libc.sys.mod` | `new.bioniclibc.sys.Mod` | 0 | `src/new/bionic_libc/sys/mod.rs` | `new/bioniclibc/sys/Mod.kt` |
| `new.common.linux_like.mod` | `new.common.linuxlike.Mod` | 0 | `src/new/common/linux_like/mod.rs` | `new/common/linuxlike/Mod.kt` |
| `common.mod` | `new.common.Mod` | 0 | `src/new/common/mod.rs` | `new/common/Mod.kt` |
| `posix.mod` | `new.common.posix.Mod` | 0 | `src/new/common/posix/mod.rs` | `new/common/posix/Mod.kt` |
| `cygwin.mod` | `new.cygwin.Mod` | 0 | `src/new/cygwin/mod.rs` | `new/cygwin/Mod.kt` |
| `dragonfly.mod` | `new.dragonfly.Mod` | 0 | `src/new/dragonfly/mod.rs` | `new/dragonfly/Mod.kt` |
| `emscripten.mod` | `new.emscripten.Mod` | 0 | `src/new/emscripten/mod.rs` | `new/emscripten/Mod.kt` |
| `espidf.mod` | `new.espidf.Mod` | 0 | `src/new/espidf/mod.rs` | `new/espidf/Mod.kt` |
| `freebsd.mod` | `new.freebsd.Mod` | 0 | `src/new/freebsd/mod.rs` | `new/freebsd/Mod.kt` |
| `new.fuchsia.mod` | `new.fuchsia.Mod` | 0 | `src/new/fuchsia/mod.rs` | `new/fuchsia/Mod.kt` |
| `glibc.mod` | `new.glibc.Mod` | 0 | `src/new/glibc/mod.rs` | `new/glibc/Mod.kt` |
| `nptl.mod` | `new.glibc.sysdeps.nptl.Mod` | 0 | `src/new/glibc/sysdeps/nptl/mod.rs` | `new/glibc/sysdeps/nptl/Mod.kt` |
| `new.glibc.sysdeps.unix.linux.mod` | `new.glibc.sysdeps.unix.linux.Mod` | 0 | `src/new/glibc/sysdeps/unix/linux/mod.rs` | `new/glibc/sysdeps/unix/linux/Mod.kt` |
| `new.glibc.sysdeps.unix.mod` | `new.glibc.sysdeps.unix.Mod` | 0 | `src/new/glibc/sysdeps/unix/mod.rs` | `new/glibc/sysdeps/unix/Mod.kt` |
| `haiku.mod` | `new.haiku.Mod` | 0 | `src/new/haiku/mod.rs` | `new/haiku/Mod.kt` |
| `hermit_abi.mod` | `new.hermitabi.Mod` | 0 | `src/new/hermit_abi/mod.rs` | `new/hermitabi/Mod.kt` |
| `horizon.mod` | `new.horizon.Mod` | 0 | `src/new/horizon/mod.rs` | `new/horizon/Mod.kt` |
| `hurd.mod` | `new.hurd.Mod` | 0 | `src/new/hurd/mod.rs` | `new/hurd/Mod.kt` |
| `illumos.mod` | `new.illumos.Mod` | 0 | `src/new/illumos/mod.rs` | `new/illumos/Mod.kt` |
| `l4re.mod` | `new.l4re.Mod` | 0 | `src/new/l4re/mod.rs` | `new/l4re/Mod.kt` |
| `linux.mod` | `new.linuxuapi.linux.Mod` | 0 | `src/new/linux_uapi/linux/mod.rs` | `new/linuxuapi/linux/Mod.kt` |
| `linux_uapi.mod` | `new.linuxuapi.Mod` | 0 | `src/new/linux_uapi/mod.rs` | `new/linuxuapi/Mod.kt` |
| `new.mod` | `new.Mod` | 0 | `src/new/mod.rs` | `new/Mod.kt` |
| `generic.mod` | `new.musl.arch.generic.Mod` | 0 | `src/new/musl/arch/generic/mod.rs` | `new/musl/arch/generic/Mod.kt` |
| `mips.mod` | `new.musl.arch.mips.Mod` | 0 | `src/new/musl/arch/mips/mod.rs` | `new/musl/arch/mips/Mod.kt` |
| `mips64.mod` | `new.musl.arch.mips64.Mod` | 0 | `src/new/musl/arch/mips64/mod.rs` | `new/musl/arch/mips64/Mod.kt` |
| `arch.mod` | `new.musl.arch.Mod` | 0 | `src/new/musl/arch/mod.rs` | `new/musl/arch/Mod.kt` |
| `musl.mod` | `new.musl.Mod` | 0 | `src/new/musl/mod.rs` | `new/musl/Mod.kt` |
| `netbsd.mod` | `new.netbsd.Mod` | 0 | `src/new/netbsd/mod.rs` | `new/netbsd/Mod.kt` |
| `new.netbsd.sys.mod` | `new.netbsd.sys.Mod` | 0 | `src/new/netbsd/sys/mod.rs` | `new/netbsd/sys/Mod.kt` |
| `newlib.mod` | `new.newlib.Mod` | 0 | `src/new/newlib/mod.rs` | `new/newlib/Mod.kt` |
| `nto.mod` | `new.nto.Mod` | 0 | `src/new/nto/mod.rs` | `new/nto/Mod.kt` |
| `nuttx.mod` | `new.nuttx.Mod` | 0 | `src/new/nuttx/mod.rs` | `new/nuttx/Mod.kt` |
| `openbsd.mod` | `new.openbsd.Mod` | 0 | `src/new/openbsd/mod.rs` | `new/openbsd/Mod.kt` |
| `new.openbsd.sys.mod` | `new.openbsd.sys.Mod` | 0 | `src/new/openbsd/sys/mod.rs` | `new/openbsd/sys/Mod.kt` |
| `new.qurt.mod` | `new.qurt.Mod` | 0 | `src/new/qurt/mod.rs` | `new/qurt/Mod.kt` |
| `sys.mod` | `new.qurt.sys.Mod` | 0 | `src/new/qurt/sys/mod.rs` | `new/qurt/sys/Mod.kt` |
| `redox.mod` | `new.redox.Mod` | 0 | `src/new/redox/mod.rs` | `new/redox/Mod.kt` |
| `relibc.mod` | `new.relibc.Mod` | 0 | `src/new/relibc/mod.rs` | `new/relibc/Mod.kt` |
| `rtems.mod` | `new.rtems.Mod` | 0 | `src/new/rtems/mod.rs` | `new/rtems/Mod.kt` |
| `solaris.mod` | `new.solaris.Mod` | 0 | `src/new/solaris/mod.rs` | `new/solaris/Mod.kt` |
| `new.solid.mod` | `new.solid.Mod` | 0 | `src/new/solid/mod.rs` | `new/solid/Mod.kt` |
| `new.teeos.mod` | `new.teeos.Mod` | 0 | `src/new/teeos/mod.rs` | `new/teeos/Mod.kt` |
| `trusty.mod` | `new.trusty.Mod` | 0 | `src/new/trusty/mod.rs` | `new/trusty/Mod.kt` |
| `uclibc.mod` | `new.uclibc.Mod` | 0 | `src/new/uclibc/mod.rs` | `new/uclibc/Mod.kt` |
| `ucrt.mod` | `new.ucrt.Mod` | 0 | `src/new/ucrt/mod.rs` | `new/ucrt/Mod.kt` |
| `vita.mod` | `new.vita.Mod` | 0 | `src/new/vita/mod.rs` | `new/vita/Mod.kt` |
| `new.vxworks.mod` | `new.vxworks.Mod` | 0 | `src/new/vxworks/mod.rs` | `new/vxworks/Mod.kt` |
| `new.wasi.mod` | `new.wasi.Mod` | 0 | `src/new/wasi/mod.rs` | `new/wasi/Mod.kt` |
| `xous.mod` | `new.xous.Mod` | 0 | `src/new/xous/mod.rs` | `new/xous/Mod.kt` |
| `qurt.mod` | `qurt.Mod` | 0 | `src/qurt/mod.rs` | `qurt/Mod.kt` |
| `solid.mod` | `solid.Mod` | 0 | `src/solid/mod.rs` | `solid/Mod.kt` |
| `teeos.mod` | `teeos.Mod` | 0 | `src/teeos/mod.rs` | `teeos/Mod.kt` |
| `unix.aix.mod` | `unix.aix.Mod` | 0 | `src/unix/aix/mod.rs` | `unix/aix/Mod.kt` |
| `b32.mod` | `unix.bsd.apple.b32.Mod` | 0 | `src/unix/bsd/apple/b32/mod.rs` | `unix/bsd/apple/b32/Mod.kt` |
| `unix.bsd.apple.b64.aarch64.mod` | `unix.bsd.apple.b64.aarch64.Mod` | 0 | `src/unix/bsd/apple/b64/aarch64/mod.rs` | `unix/bsd/apple/b64/aarch64/Mod.kt` |
| `b64.mod` | `unix.bsd.apple.b64.Mod` | 0 | `src/unix/bsd/apple/b64/mod.rs` | `unix/bsd/apple/b64/Mod.kt` |
| `x86_64.mod` | `unix.bsd.apple.b64.x8664.Mod` | 0 | `src/unix/bsd/apple/b64/x86_64/mod.rs` | `unix/bsd/apple/b64/x8664/Mod.kt` |
| `unix.bsd.apple.mod` | `unix.bsd.apple.Mod` | 0 | `src/unix/bsd/apple/mod.rs` | `unix/bsd/apple/Mod.kt` |
| `unix.bsd.freebsdlike.dragonfly.mod` | `unix.bsd.freebsdlike.dragonfly.Mod` | 0 | `src/unix/bsd/freebsdlike/dragonfly/mod.rs` | `unix/bsd/freebsdlike/dragonfly/Mod.kt` |
| `freebsd11.mod` | `unix.bsd.freebsdlike.freebsd.freebsd11.Mod` | 0 | `src/unix/bsd/freebsdlike/freebsd/freebsd11/mod.rs` | `unix/bsd/freebsdlike/freebsd/freebsd11/Mod.kt` |
| `freebsd12.mod` | `unix.bsd.freebsdlike.freebsd.freebsd12.Mod` | 0 | `src/unix/bsd/freebsdlike/freebsd/freebsd12/mod.rs` | `unix/bsd/freebsdlike/freebsd/freebsd12/Mod.kt` |
| `freebsd13.mod` | `unix.bsd.freebsdlike.freebsd.freebsd13.Mod` | 0 | `src/unix/bsd/freebsdlike/freebsd/freebsd13/mod.rs` | `unix/bsd/freebsdlike/freebsd/freebsd13/Mod.kt` |
| `freebsd14.mod` | `unix.bsd.freebsdlike.freebsd.freebsd14.Mod` | 0 | `src/unix/bsd/freebsdlike/freebsd/freebsd14/mod.rs` | `unix/bsd/freebsdlike/freebsd/freebsd14/Mod.kt` |
| `freebsd15.mod` | `unix.bsd.freebsdlike.freebsd.freebsd15.Mod` | 0 | `src/unix/bsd/freebsdlike/freebsd/freebsd15/mod.rs` | `unix/bsd/freebsdlike/freebsd/freebsd15/Mod.kt` |
| `unix.bsd.freebsdlike.freebsd.mod` | `unix.bsd.freebsdlike.freebsd.Mod` | 0 | `src/unix/bsd/freebsdlike/freebsd/mod.rs` | `unix/bsd/freebsdlike/freebsd/Mod.kt` |
| `unix.bsd.freebsdlike.freebsd.x86_64.mod` | `unix.bsd.freebsdlike.freebsd.x8664.Mod` | 0 | `src/unix/bsd/freebsdlike/freebsd/x86_64/mod.rs` | `unix/bsd/freebsdlike/freebsd/x8664/Mod.kt` |
| `freebsdlike.mod` | `unix.bsd.freebsdlike.Mod` | 0 | `src/unix/bsd/freebsdlike/mod.rs` | `unix/bsd/freebsdlike/Mod.kt` |
| `fuchsia.mod` | `fuchsia.Mod` | 0 | `src/fuchsia/mod.rs` | `fuchsia/Mod.kt` |
| `netbsdlike.mod` | `unix.bsd.netbsdlike.Mod` | 0 | `src/unix/bsd/netbsdlike/mod.rs` | `unix/bsd/netbsdlike/Mod.kt` |
| `unix.bsd.netbsdlike.netbsd.mod` | `unix.bsd.netbsdlike.netbsd.Mod` | 0 | `src/unix/bsd/netbsdlike/netbsd/mod.rs` | `unix/bsd/netbsdlike/netbsd/Mod.kt` |
| `unix.bsd.netbsdlike.openbsd.mod` | `unix.bsd.netbsdlike.openbsd.Mod` | 0 | `src/unix/bsd/netbsdlike/openbsd/mod.rs` | `unix/bsd/netbsdlike/openbsd/Mod.kt` |
| `unix.cygwin.mod` | `unix.cygwin.Mod` | 0 | `src/unix/cygwin/mod.rs` | `unix/cygwin/Mod.kt` |
| `unix.haiku.mod` | `unix.haiku.Mod` | 0 | `src/unix/haiku/mod.rs` | `unix/haiku/Mod.kt` |
| `unix.hurd.mod` | `unix.hurd.Mod` | 0 | `src/unix/hurd/mod.rs` | `unix/hurd/Mod.kt` |
| `unix.linux_like.android.b32.mod` | `unix.linuxlike.android.b32.Mod` | 0 | `src/unix/linux_like/android/b32/mod.rs` | `unix/linuxlike/android/b32/Mod.kt` |
| `x86.mod` | `unix.linuxlike.android.b32.x86.Mod` | 0 | `src/unix/linux_like/android/b32/x86/mod.rs` | `unix/linuxlike/android/b32/x86/Mod.kt` |
| `unix.linux_like.android.b64.aarch64.mod` | `unix.linuxlike.android.b64.aarch64.Mod` | 0 | `src/unix/linux_like/android/b64/aarch64/mod.rs` | `unix/linuxlike/android/b64/aarch64/Mod.kt` |
| `unix.linux_like.android.b64.mod` | `unix.linuxlike.android.b64.Mod` | 0 | `src/unix/linux_like/android/b64/mod.rs` | `unix/linuxlike/android/b64/Mod.kt` |
| `riscv64.mod` | `unix.linuxlike.android.b64.riscv64.Mod` | 0 | `src/unix/linux_like/android/b64/riscv64/mod.rs` | `unix/linuxlike/android/b64/riscv64/Mod.kt` |
| `unix.linux_like.android.b64.x86_64.mod` | `unix.linuxlike.android.b64.x8664.Mod` | 0 | `src/unix/linux_like/android/b64/x86_64/mod.rs` | `unix/linuxlike/android/b64/x8664/Mod.kt` |
| `android.mod` | `unix.linuxlike.android.Mod` | 0 | `src/unix/linux_like/android/mod.rs` | `unix/linuxlike/android/Mod.kt` |
| `unix.linux_like.emscripten.mod` | `unix.linuxlike.emscripten.Mod` | 0 | `src/unix/linux_like/emscripten/mod.rs` | `unix/linuxlike/emscripten/Mod.kt` |
| `unix.linux_like.l4re.mod` | `unix.linuxlike.l4re.Mod` | 0 | `src/unix/linux_like/l4re/mod.rs` | `unix/linuxlike/l4re/Mod.kt` |
| `unix.linux_like.l4re.uclibc.aarch64.mod` | `unix.linuxlike.l4re.uclibc.aarch64.Mod` | 0 | `src/unix/linux_like/l4re/uclibc/aarch64/mod.rs` | `unix/linuxlike/l4re/uclibc/aarch64/Mod.kt` |
| `unix.linux_like.l4re.uclibc.mod` | `unix.linuxlike.l4re.uclibc.Mod` | 0 | `src/unix/linux_like/l4re/uclibc/mod.rs` | `unix/linuxlike/l4re/uclibc/Mod.kt` |
| `unix.linux_like.l4re.uclibc.x86_64.mod` | `unix.linuxlike.l4re.uclibc.x8664.Mod` | 0 | `src/unix/linux_like/l4re/uclibc/x86_64/mod.rs` | `unix/linuxlike/l4re/uclibc/x8664/Mod.kt` |
| `unix.linux_like.linux.arch.generic.mod` | `unix.linuxlike.linux.arch.generic.Mod` | 0 | `src/unix/linux_like/linux/arch/generic/mod.rs` | `unix/linuxlike/linux/arch/generic/Mod.kt` |
| `unix.linux_like.linux.arch.mips.mod` | `unix.linuxlike.linux.arch.mips.Mod` | 0 | `src/unix/linux_like/linux/arch/mips/mod.rs` | `unix/linuxlike/linux/arch/mips/Mod.kt` |
| `unix.linux_like.linux.arch.mod` | `unix.linuxlike.linux.arch.Mod` | 0 | `src/unix/linux_like/linux/arch/mod.rs` | `unix/linuxlike/linux/arch/Mod.kt` |
| `unix.linux_like.linux.arch.powerpc.mod` | `unix.linuxlike.linux.arch.powerpc.Mod` | 0 | `src/unix/linux_like/linux/arch/powerpc/mod.rs` | `unix/linuxlike/linux/arch/powerpc/Mod.kt` |
| `sparc.mod` | `unix.linuxlike.linux.arch.sparc.Mod` | 0 | `src/unix/linux_like/linux/arch/sparc/mod.rs` | `unix/linuxlike/linux/arch/sparc/Mod.kt` |
| `unix.linux_like.linux.gnu.b32.arm.mod` | `unix.linuxlike.linux.gnu.b32.arm.Mod` | 0 | `src/unix/linux_like/linux/gnu/b32/arm/mod.rs` | `unix/linuxlike/linux/gnu/b32/arm/Mod.kt` |
| `csky.mod` | `unix.linuxlike.linux.gnu.b32.csky.Mod` | 0 | `src/unix/linux_like/linux/gnu/b32/csky/mod.rs` | `unix/linuxlike/linux/gnu/b32/csky/Mod.kt` |
| `m68k.mod` | `unix.linuxlike.linux.gnu.b32.m68k.Mod` | 0 | `src/unix/linux_like/linux/gnu/b32/m68k/mod.rs` | `unix/linuxlike/linux/gnu/b32/m68k/Mod.kt` |
| `unix.linux_like.linux.gnu.b32.mips.mod` | `unix.linuxlike.linux.gnu.b32.mips.Mod` | 0 | `src/unix/linux_like/linux/gnu/b32/mips/mod.rs` | `unix/linuxlike/linux/gnu/b32/mips/Mod.kt` |
| `unix.linux_like.linux.gnu.b32.mod` | `unix.linuxlike.linux.gnu.b32.Mod` | 0 | `src/unix/linux_like/linux/gnu/b32/mod.rs` | `unix/linuxlike/linux/gnu/b32/Mod.kt` |
| `riscv32.mod` | `unix.linuxlike.linux.gnu.b32.riscv32.Mod` | 0 | `src/unix/linux_like/linux/gnu/b32/riscv32/mod.rs` | `unix/linuxlike/linux/gnu/b32/riscv32/Mod.kt` |
| `unix.linux_like.linux.gnu.b32.sparc.mod` | `unix.linuxlike.linux.gnu.b32.sparc.Mod` | 0 | `src/unix/linux_like/linux/gnu/b32/sparc/mod.rs` | `unix/linuxlike/linux/gnu/b32/sparc/Mod.kt` |
| `unix.linux_like.linux.gnu.b32.x86.mod` | `unix.linuxlike.linux.gnu.b32.x86.Mod` | 0 | `src/unix/linux_like/linux/gnu/b32/x86/mod.rs` | `unix/linuxlike/linux/gnu/b32/x86/Mod.kt` |
| `unix.linux_like.linux.gnu.b64.aarch64.mod` | `unix.linuxlike.linux.gnu.b64.aarch64.Mod` | 0 | `src/unix/linux_like/linux/gnu/b64/aarch64/mod.rs` | `unix/linuxlike/linux/gnu/b64/aarch64/Mod.kt` |
| `loongarch64.mod` | `unix.linuxlike.linux.gnu.b64.loongarch64.Mod` | 0 | `src/unix/linux_like/linux/gnu/b64/loongarch64/mod.rs` | `unix/linuxlike/linux/gnu/b64/loongarch64/Mod.kt` |
| `unix.linux_like.linux.gnu.b64.mips64.mod` | `unix.linuxlike.linux.gnu.b64.mips64.Mod` | 0 | `src/unix/linux_like/linux/gnu/b64/mips64/mod.rs` | `unix/linuxlike/linux/gnu/b64/mips64/Mod.kt` |
| `unix.linux_like.linux.gnu.b64.mod` | `unix.linuxlike.linux.gnu.b64.Mod` | 0 | `src/unix/linux_like/linux/gnu/b64/mod.rs` | `unix/linuxlike/linux/gnu/b64/Mod.kt` |
| `powerpc64.mod` | `unix.linuxlike.linux.gnu.b64.powerpc64.Mod` | 0 | `src/unix/linux_like/linux/gnu/b64/powerpc64/mod.rs` | `unix/linuxlike/linux/gnu/b64/powerpc64/Mod.kt` |
| `unix.linux_like.linux.gnu.b64.riscv64.mod` | `unix.linuxlike.linux.gnu.b64.riscv64.Mod` | 0 | `src/unix/linux_like/linux/gnu/b64/riscv64/mod.rs` | `unix/linuxlike/linux/gnu/b64/riscv64/Mod.kt` |
| `sparc64.mod` | `unix.linuxlike.linux.gnu.b64.sparc64.Mod` | 0 | `src/unix/linux_like/linux/gnu/b64/sparc64/mod.rs` | `unix/linuxlike/linux/gnu/b64/sparc64/Mod.kt` |
| `unix.linux_like.linux.gnu.b64.x86_64.mod` | `unix.linuxlike.linux.gnu.b64.x8664.Mod` | 0 | `src/unix/linux_like/linux/gnu/b64/x86_64/mod.rs` | `unix/linuxlike/linux/gnu/b64/x8664/Mod.kt` |
| `unix.linux_like.linux.gnu.mod` | `unix.linuxlike.linux.gnu.Mod` | 0 | `src/unix/linux_like/linux/gnu/mod.rs` | `unix/linuxlike/linux/gnu/Mod.kt` |
| `unix.linux_like.linux.mod` | `unix.linuxlike.linux.Mod` | 0 | `src/unix/linux_like/linux/mod.rs` | `unix/linuxlike/linux/Mod.kt` |
| `unix.linux_like.linux.musl.b32.arm.mod` | `unix.linuxlike.linux.musl.b32.arm.Mod` | 0 | `src/unix/linux_like/linux/musl/b32/arm/mod.rs` | `unix/linuxlike/linux/musl/b32/arm/Mod.kt` |
| `unix.linux_like.linux.musl.b32.mips.mod` | `unix.linuxlike.linux.musl.b32.mips.Mod` | 0 | `src/unix/linux_like/linux/musl/b32/mips/mod.rs` | `unix/linuxlike/linux/musl/b32/mips/Mod.kt` |
| `unix.linux_like.linux.musl.b32.mod` | `unix.linuxlike.linux.musl.b32.Mod` | 0 | `src/unix/linux_like/linux/musl/b32/mod.rs` | `unix/linuxlike/linux/musl/b32/Mod.kt` |
| `unix.linux_like.linux.musl.b32.riscv32.mod` | `unix.linuxlike.linux.musl.b32.riscv32.Mod` | 0 | `src/unix/linux_like/linux/musl/b32/riscv32/mod.rs` | `unix/linuxlike/linux/musl/b32/riscv32/Mod.kt` |
| `unix.linux_like.linux.musl.b32.x86.mod` | `unix.linuxlike.linux.musl.b32.x86.Mod` | 0 | `src/unix/linux_like/linux/musl/b32/x86/mod.rs` | `unix/linuxlike/linux/musl/b32/x86/Mod.kt` |
| `unix.linux_like.linux.musl.b64.aarch64.mod` | `unix.linuxlike.linux.musl.b64.aarch64.Mod` | 0 | `src/unix/linux_like/linux/musl/b64/aarch64/mod.rs` | `unix/linuxlike/linux/musl/b64/aarch64/Mod.kt` |
| `unix.linux_like.linux.musl.b64.loongarch64.mod` | `unix.linuxlike.linux.musl.b64.loongarch64.Mod` | 0 | `src/unix/linux_like/linux/musl/b64/loongarch64/mod.rs` | `unix/linuxlike/linux/musl/b64/loongarch64/Mod.kt` |
| `unix.linux_like.linux.musl.b64.mod` | `unix.linuxlike.linux.musl.b64.Mod` | 0 | `src/unix/linux_like/linux/musl/b64/mod.rs` | `unix/linuxlike/linux/musl/b64/Mod.kt` |
| `unix.linux_like.linux.musl.b64.riscv64.mod` | `unix.linuxlike.linux.musl.b64.riscv64.Mod` | 0 | `src/unix/linux_like/linux/musl/b64/riscv64/mod.rs` | `unix/linuxlike/linux/musl/b64/riscv64/Mod.kt` |
| `wasm32.mod` | `unix.linuxlike.linux.musl.b64.wasm32.Mod` | 0 | `src/unix/linux_like/linux/musl/b64/wasm32/mod.rs` | `unix/linuxlike/linux/musl/b64/wasm32/Mod.kt` |
| `unix.linux_like.linux.musl.b64.x86_64.mod` | `unix.linuxlike.linux.musl.b64.x8664.Mod` | 0 | `src/unix/linux_like/linux/musl/b64/x86_64/mod.rs` | `unix/linuxlike/linux/musl/b64/x8664/Mod.kt` |
| `unix.linux_like.linux.musl.mod` | `unix.linuxlike.linux.musl.Mod` | 0 | `src/unix/linux_like/linux/musl/mod.rs` | `unix/linuxlike/linux/musl/Mod.kt` |
| `unix.linux_like.linux.uclibc.arm.mod` | `unix.linuxlike.linux.uclibc.arm.Mod` | 0 | `src/unix/linux_like/linux/uclibc/arm/mod.rs` | `unix/linuxlike/linux/uclibc/arm/Mod.kt` |
| `mips32.mod` | `unix.linuxlike.linux.uclibc.mips.mips32.Mod` | 0 | `src/unix/linux_like/linux/uclibc/mips/mips32/mod.rs` | `unix/linuxlike/linux/uclibc/mips/mips32/Mod.kt` |
| `unix.linux_like.linux.uclibc.mips.mips64.mod` | `unix.linuxlike.linux.uclibc.mips.mips64.Mod` | 0 | `src/unix/linux_like/linux/uclibc/mips/mips64/mod.rs` | `unix/linuxlike/linux/uclibc/mips/mips64/Mod.kt` |
| `unix.linux_like.linux.uclibc.mips.mod` | `unix.linuxlike.linux.uclibc.mips.Mod` | 0 | `src/unix/linux_like/linux/uclibc/mips/mod.rs` | `unix/linuxlike/linux/uclibc/mips/Mod.kt` |
| `unix.linux_like.linux.uclibc.mod` | `unix.linuxlike.linux.uclibc.Mod` | 0 | `src/unix/linux_like/linux/uclibc/mod.rs` | `unix/linuxlike/linux/uclibc/Mod.kt` |
| `unix.linux_like.linux.uclibc.x86_64.mod` | `unix.linuxlike.linux.uclibc.x8664.Mod` | 0 | `src/unix/linux_like/linux/uclibc/x86_64/mod.rs` | `unix/linuxlike/linux/uclibc/x8664/Mod.kt` |
| `linux_like.mod` | `unix.linuxlike.Mod` | 0 | `src/unix/linux_like/mod.rs` | `unix/linuxlike/Mod.kt` |
| `unix.mod` | `unix.Mod` | 0 | `src/unix/mod.rs` | `unix/Mod.kt` |
| `aarch64.mod` | `unix.newlib.aarch64.Mod` | 0 | `src/unix/newlib/aarch64/mod.rs` | `unix/newlib/aarch64/Mod.kt` |
| `arm.mod` | `unix.newlib.arm.Mod` | 0 | `src/unix/newlib/arm/mod.rs` | `unix/newlib/arm/Mod.kt` |
| `unix.newlib.espidf.mod` | `unix.newlib.espidf.Mod` | 0 | `src/unix/newlib/espidf/mod.rs` | `unix/newlib/espidf/Mod.kt` |
| `unix.newlib.horizon.mod` | `unix.newlib.horizon.Mod` | 0 | `src/unix/newlib/horizon/mod.rs` | `unix/newlib/horizon/Mod.kt` |
| `unix.newlib.mod` | `unix.newlib.Mod` | 0 | `src/unix/newlib/mod.rs` | `unix/newlib/Mod.kt` |
| `powerpc.mod` | `unix.newlib.powerpc.Mod` | 0 | `src/unix/newlib/powerpc/mod.rs` | `unix/newlib/powerpc/Mod.kt` |
| `unix.newlib.rtems.mod` | `unix.newlib.rtems.Mod` | 0 | `src/unix/newlib/rtems/mod.rs` | `unix/newlib/rtems/Mod.kt` |
| `unix.newlib.vita.mod` | `unix.newlib.vita.Mod` | 0 | `src/unix/newlib/vita/mod.rs` | `unix/newlib/vita/Mod.kt` |
| `unix.nto.mod` | `unix.nto.Mod` | 0 | `src/unix/nto/mod.rs` | `unix/nto/Mod.kt` |
| `unix.nuttx.mod` | `unix.nuttx.Mod` | 0 | `src/unix/nuttx/mod.rs` | `unix/nuttx/Mod.kt` |
| `unix.redox.mod` | `unix.redox.Mod` | 0 | `src/unix/redox/mod.rs` | `unix/redox/Mod.kt` |
| `solarish.mod` | `unix.solarish.Mod` | 0 | `src/unix/solarish/mod.rs` | `unix/solarish/Mod.kt` |
| `vxworks.mod` | `vxworks.Mod` | 0 | `src/vxworks/mod.rs` | `vxworks/Mod.kt` |
| `wasi.mod` | `wasi.Mod` | 0 | `src/wasi/mod.rs` | `wasi/Mod.kt` |
| `gnu.mod` | `windows.gnu.Mod` | 0 | `src/windows/gnu/mod.rs` | `windows/gnu/Mod.kt` |
| `windows.mod` | `windows.Mod` | 0 | `src/windows/mod.rs` | `windows/Mod.kt` |
| `msvc.mod` | `windows.msvc.Mod` | 0 | `src/windows/msvc/mod.rs` | `windows/msvc/Mod.kt` |

