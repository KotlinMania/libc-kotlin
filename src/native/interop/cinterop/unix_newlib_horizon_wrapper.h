#ifndef LIBC_UNIX_NEWLIB_HORIZON_UNIX_NEWLIB_HORIZON_WRAPPER_H
#define LIBC_UNIX_NEWLIB_HORIZON_UNIX_NEWLIB_HORIZON_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcUnixNewlibHorizonPthreadCreate(void* native, void* attr, void* f, void* value);
int32_t libcUnixNewlibHorizonPthreadAttrGetschedparam(void* attr, void* param);
int32_t libcUnixNewlibHorizonPthreadAttrSetschedparam(void* attr, void* param);
int32_t libcUnixNewlibHorizonPthreadAttrGetprocessoridNp(void* attr, void* processorId);
int32_t libcUnixNewlibHorizonPthreadAttrSetprocessoridNp(void* attr, int32_t processorId);
int32_t libcUnixNewlibHorizonPthreadGetschedparam(void* native, void* policy, void* param);
int32_t libcUnixNewlibHorizonPthreadSetschedparam(void* native, int32_t policy, void* param);
int32_t libcUnixNewlibHorizonPthreadCondattrGetclock(void* attr, void* clockId);
int32_t libcUnixNewlibHorizonPthreadCondattrSetclock(void* attr, uint64_t clockId);
int32_t libcUnixNewlibHorizonPthreadGetprocessoridNp(void);
int64_t libcUnixNewlibHorizonGetrandom(void* buf, uint64_t buflen, uint32_t flags);
int64_t libcUnixNewlibHorizonGethostid(void);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_NEWLIB_HORIZON_UNIX_NEWLIB_HORIZON_WRAPPER_H */
