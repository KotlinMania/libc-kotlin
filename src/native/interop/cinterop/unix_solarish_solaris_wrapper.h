#ifndef LIBC_UNIX_SOLARISH_SOLARIS_UNIX_SOLARISH_SOLARIS_WRAPPER_H
#define LIBC_UNIX_SOLARISH_SOLARIS_UNIX_SOLARISH_SOLARIS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcUnixSolarishSolarisFexecve(int32_t fd, void* argv, void* envp);
int32_t libcUnixSolarishSolarisMincore(void* addr, uint64_t len, char* vec);
int32_t libcUnixSolarishSolarisDoorCall(int32_t d, void* params);
int32_t libcUnixSolarishSolarisDoorReturn(char* dataPtr, uint64_t dataSize, void* descPtr, uint32_t numDesc);
int32_t libcUnixSolarishSolarisDoorCreate(void* serverProcedure, void* cookie, uint32_t attributes);
int32_t libcUnixSolarishSolarisFattach(int32_t fildes, const char* path);
int32_t libcUnixSolarishSolarisPthreadGetattrNp(void* thread, void* attr);
int32_t libcUnixSolarishSolarisEuidaccess(const char* path, int32_t amode);
int32_t libcUnixSolarishSolarisOpenpty(void* amain, void* asubord, char* name, void* termp, void* winp);
int32_t libcUnixSolarishSolarisForkpty(void* amain, char* name, void* termp, void* winp);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_SOLARISH_SOLARIS_UNIX_SOLARISH_SOLARIS_WRAPPER_H */
