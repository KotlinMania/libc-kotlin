#ifndef LIBC_NEW_COMMON_POSIX_PTHREAD_NEW_COMMON_POSIX_PTHREAD_WRAPPER_H
#define LIBC_NEW_COMMON_POSIX_PTHREAD_NEW_COMMON_POSIX_PTHREAD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcNewCommonPosixPthreadPthreadAtfork(void* prepare, void* parent, void* child);
int32_t libcNewCommonPosixPthreadPthreadAttrGetguardsize(void* attr, void* guardsize);
int32_t libcNewCommonPosixPthreadPthreadAttrGetinheritsched(void* attr, void* inheritsched);
int32_t libcNewCommonPosixPthreadPthreadAttrGetschedparam(void* attr, void* param);
int32_t libcNewCommonPosixPthreadPthreadAttrGetschedpolicy(void* attr, void* policy);
int32_t libcNewCommonPosixPthreadPthreadAttrGetstack(void* attr, void* stackaddr, void* stacksize);
int32_t libcNewCommonPosixPthreadPthreadAttrSetguardsize(void* attr, uint64_t guardsize);
int32_t libcNewCommonPosixPthreadPthreadAttrSetinheritsched(void* attr, int32_t inheritsched);
int32_t libcNewCommonPosixPthreadPthreadAttrSetschedparam(void* attr, void* param);
int32_t libcNewCommonPosixPthreadPthreadAttrSetschedpolicy(void* attr, int32_t policy);
int32_t libcNewCommonPosixPthreadPthreadAttrSetstack(void* attr, void* stackaddr, uint64_t stacksize);
int32_t libcNewCommonPosixPthreadPthreadBarrierDestroy(void* barrier);
int32_t libcNewCommonPosixPthreadPthreadBarrierInit(void* barrier, void* attr, uint32_t count);
int32_t libcNewCommonPosixPthreadPthreadBarrierWait(void* barrier);
int32_t libcNewCommonPosixPthreadPthreadBarrierattrDestroy(void* attr);
int32_t libcNewCommonPosixPthreadPthreadBarrierattrGetpshared(void* attr, void* shared);
int32_t libcNewCommonPosixPthreadPthreadBarrierattrInit(void* attr);
int32_t libcNewCommonPosixPthreadPthreadBarrierattrSetpshared(void* attr, int32_t shared);
int32_t libcNewCommonPosixPthreadPthreadCancel(void* thread);
int32_t libcNewCommonPosixPthreadPthreadCondattrGetclock(void* attr, void* clockId);
int32_t libcNewCommonPosixPthreadPthreadCondattrGetpshared(void* attr, void* pshared);
int32_t libcNewCommonPosixPthreadPthreadCondattrSetclock(void* attr, int32_t clockId);
int32_t libcNewCommonPosixPthreadPthreadCondattrSetpshared(void* attr, int32_t pshared);
int32_t libcNewCommonPosixPthreadPthreadCreate(void* native, void* attr, void* f, void* value);
int32_t libcNewCommonPosixPthreadPthreadGetcpuclockid(void* thread, void* clkId);
int32_t libcNewCommonPosixPthreadPthreadGetschedparam(void* native, void* policy, void* param);
int32_t libcNewCommonPosixPthreadPthreadKill(void* thread, int32_t sig);
int32_t libcNewCommonPosixPthreadPthreadMutexConsistent(void* mutex);
int32_t libcNewCommonPosixPthreadPthreadMutexTimedlock(void* lock, void* abstime);
int32_t libcNewCommonPosixPthreadPthreadMutexattrGetprotocol(void* attr, void* protocol);
int32_t libcNewCommonPosixPthreadPthreadMutexattrGetpshared(void* attr, void* pshared);
int32_t libcNewCommonPosixPthreadPthreadMutexattrGetrobust(void* attr, void* robustness);
int32_t libcNewCommonPosixPthreadPthreadMutexattrSetprotocol(void* attr, int32_t protocol);
int32_t libcNewCommonPosixPthreadPthreadMutexattrSetpshared(void* attr, int32_t pshared);
int32_t libcNewCommonPosixPthreadPthreadMutexattrSetrobust(void* attr, int32_t robustness);
int32_t libcNewCommonPosixPthreadPthreadRwlockattrGetpshared(void* attr, void* val);
int32_t libcNewCommonPosixPthreadPthreadRwlockattrSetpshared(void* attr, int32_t val);
int32_t libcNewCommonPosixPthreadPthreadOnce(void* control, void* routine);
int32_t libcNewCommonPosixPthreadPthreadSetschedparam(void* native, int32_t policy, void* param);
int32_t libcNewCommonPosixPthreadPthreadSetschedprio(void* native, int32_t priority);
int32_t libcNewCommonPosixPthreadPthreadSigmask(int32_t how, void* set, void* oldset);
int32_t libcNewCommonPosixPthreadPthreadSpinDestroy(void* lock);
int32_t libcNewCommonPosixPthreadPthreadSpinInit(void* lock, int32_t pshared);
int32_t libcNewCommonPosixPthreadPthreadSpinLock(void* lock);
int32_t libcNewCommonPosixPthreadPthreadSpinTrylock(void* lock);
int32_t libcNewCommonPosixPthreadPthreadSpinUnlock(void* lock);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_COMMON_POSIX_PTHREAD_NEW_COMMON_POSIX_PTHREAD_WRAPPER_H */
