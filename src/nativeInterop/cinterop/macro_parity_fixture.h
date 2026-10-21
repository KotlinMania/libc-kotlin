#ifndef LIBC_MACRO_PARITY_FIXTURE_H
#define LIBC_MACRO_PARITY_FIXTURE_H
#include <stddef.h>
#include <stdint.h>

#if !defined(__GNUC__) && !defined(__clang__)
#error "The aligned zero-size macro parity fixture needs compiler support; do not substitute a nonzero empty struct"
#endif

#if defined(_MSC_VER)
typedef unsigned char libc_macro_off2[0] __attribute__((aligned(128)));
#define LIBC_MACRO_OFF2_TYPE libc_macro_off2
#else
struct __attribute__((aligned(128))) libc_macro_off2 { unsigned char bytes[0]; };
#define LIBC_MACRO_OFF2_TYPE struct libc_macro_off2
#endif
struct libc_macro_off1 {
    uint8_t a;
    uint32_t b;
    LIBC_MACRO_OFF2_TYPE c;
    uint64_t d;
};

// Fixed-width transport preserves actual pointer values on both 32- and 64-bit targets.
static inline uint64_t libc_macro_layout_value(int index) {
    static struct libc_macro_off1 value;
    switch (index) {
        case 0: return (uintptr_t)&value;
        case 1: return (uintptr_t)&value.a;
        case 2: return (uintptr_t)&value.b;
        case 3: return (uintptr_t)&value.c;
        case 4: return (uintptr_t)&value.d;
        case 5: return sizeof(value);
        case 6: return offsetof(struct libc_macro_off1, a);
        case 7: return offsetof(struct libc_macro_off1, b);
        case 8: return offsetof(struct libc_macro_off1, c);
        case 9: return offsetof(struct libc_macro_off1, d);
        case 10: return sizeof(LIBC_MACRO_OFF2_TYPE);
        case 11: return __alignof__(LIBC_MACRO_OFF2_TYPE);
        default: return UINTPTR_MAX;
    }
}
#undef LIBC_MACRO_OFF2_TYPE
#endif
