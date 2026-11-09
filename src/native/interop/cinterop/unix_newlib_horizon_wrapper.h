#ifndef LIBC_UNIX_NEWLIB_HORIZON_UNIX_NEWLIB_HORIZON_WRAPPER_H
#define LIBC_UNIX_NEWLIB_HORIZON_UNIX_NEWLIB_HORIZON_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_unix_newlib_horizon_pthreadCreate(void* native, void* attr, void* f, void* value);
int32_t libc_unix_newlib_horizon_pthreadAttrGetschedparam(void* attr, void* param);
int32_t libc_unix_newlib_horizon_pthreadAttrSetschedparam(void* attr, void* param);
int32_t libc_unix_newlib_horizon_pthreadAttrGetprocessoridNp(void* attr, void* processor_id);
int32_t libc_unix_newlib_horizon_pthreadAttrSetprocessoridNp(void* attr, int32_t processor_id);
int32_t libc_unix_newlib_horizon_pthreadGetschedparam(void* native, void* policy, void* param);
int32_t libc_unix_newlib_horizon_pthreadSetschedparam(void* native, int32_t policy, void* param);
int32_t libc_unix_newlib_horizon_pthreadCondattrGetclock(void* attr, void* clock_id);
int32_t libc_unix_newlib_horizon_pthreadCondattrSetclock(void* attr, uint64_t clock_id);
int32_t libc_unix_newlib_horizon_pthreadGetprocessoridNp(void);
int64_t libc_unix_newlib_horizon_getrandom(void* buf, uint64_t buflen, uint32_t flags);
int64_t libc_unix_newlib_horizon_gethostid(void);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_NEWLIB_HORIZON_UNIX_NEWLIB_HORIZON_WRAPPER_H */
