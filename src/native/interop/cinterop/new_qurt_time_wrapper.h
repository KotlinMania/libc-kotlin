#ifndef LIBC_NEW_QURT_TIME_NEW_QURT_TIME_WRAPPER_H
#define LIBC_NEW_QURT_TIME_NEW_QURT_TIME_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int64_t libcNewQurtTimeTime(void* tloc);
int64_t libcNewQurtTimeClock(void);
double libcNewQurtTimeDifftime(int64_t time1, int64_t time0);
int64_t libcNewQurtTimeMktime(void* tm);
void* libcNewQurtTimeGmtime(void* timep);
void* libcNewQurtTimeGmtimeR(void* timep, void* result);
void* libcNewQurtTimeLocaltime(void* timep);
void* libcNewQurtTimeLocaltimeR(void* timep, void* result);
char* libcNewQurtTimeAsctime(void* tm);
char* libcNewQurtTimeAsctimeR(void* tm, char* buf);
char* libcNewQurtTimeCtime(void* timep);
char* libcNewQurtTimeCtimeR(void* timep, char* buf);
uint64_t libcNewQurtTimeStrftime(char* s, uint64_t maxsize, const char* format, void* timeptr);
char* libcNewQurtTimeStrptime(const char* s, const char* format, void* tm);
int32_t libcNewQurtTimeClockGettime(int32_t clkId, void* tp);
int32_t libcNewQurtTimeNanosleep(void* req, void* rem);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_QURT_TIME_NEW_QURT_TIME_WRAPPER_H */
