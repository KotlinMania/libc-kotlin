#ifndef LIBC_WRAPPER_H
#define LIBC_WRAPPER_H

#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_is_host_available(void);
int64_t libc_invoke(const char* symbol, int32_t fixed_argc, int32_t argc, const int64_t* argv, int32_t* status_out);
double libc_invoke_fp(const char* symbol, int32_t fp_mask, int32_t ret_f32, int32_t argc, const int64_t* argv, int32_t* status_out);
int64_t libc_resolve_symbol_address(const char* symbol);
int32_t libc_last_error_number(void);
int32_t libc_strlen_at(int64_t addr);
int64_t libc_alloc_zeroed(int32_t size);
void libc_free_mem(int64_t addr);
void libc_read_bytes(int64_t addr, int32_t len, uint8_t* dst);
void libc_write_bytes(int64_t addr, int32_t len, const uint8_t* src);

#ifdef __cplusplus
}
#endif

#endif
