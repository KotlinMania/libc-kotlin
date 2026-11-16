#ifndef LIBC_UNIX_HAIKU_NATIVE_UNIX_HAIKU_NATIVE_WRAPPER_H
#define LIBC_UNIX_HAIKU_NATIVE_UNIX_HAIKU_NATIVE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcUnixHaikuNativeCreateArea(const char* name, void* startAddress, uint32_t addressSpec, uint64_t size, uint32_t lock, uint32_t protection);
int32_t libcUnixHaikuNativeCloneArea(const char* name, void* destAddress, uint32_t addressSpec, uint32_t protection, int32_t source);
int32_t libcUnixHaikuNativeFindArea(const char* name);
int32_t libcUnixHaikuNativeAreaFor(void* address);
int32_t libcUnixHaikuNativeDeleteArea(int32_t id);
int32_t libcUnixHaikuNativeResizeArea(int32_t id, uint64_t newSize);
int32_t libcUnixHaikuNativeSetAreaProtection(int32_t id, uint32_t newProtection);
int32_t libcUnixHaikuNativeGetAreaInfo(int32_t id, void* areaInfo, uint64_t size);
int32_t libcUnixHaikuNativeGetNextAreaInfo(int32_t team, void* cookie, void* areaInfo, uint64_t size);
int32_t libcUnixHaikuNativeCreatePort(int32_t capacity, const char* name);
int32_t libcUnixHaikuNativeFindPort(const char* name);
int64_t libcUnixHaikuNativeReadPort(int32_t port, void* code, void* buffer, uint64_t bufferSize);
int64_t libcUnixHaikuNativeReadPortEtc(int32_t port, void* code, void* buffer, uint64_t bufferSize, uint32_t flags, int64_t timeout);
int32_t libcUnixHaikuNativeWritePort(int32_t port, int32_t code, void* buffer, uint64_t bufferSize);
int32_t libcUnixHaikuNativeWritePortEtc(int32_t port, int32_t code, void* buffer, uint64_t bufferSize, uint32_t flags, int64_t timeout);
int32_t libcUnixHaikuNativeClosePort(int32_t port);
int32_t libcUnixHaikuNativeDeletePort(int32_t port);
int64_t libcUnixHaikuNativePortBufferSize(int32_t port);
int64_t libcUnixHaikuNativePortBufferSizeEtc(int32_t port, uint32_t flags, int64_t timeout);
int64_t libcUnixHaikuNativePortCount(int32_t port);
int32_t libcUnixHaikuNativeSetPortOwner(int32_t port, int32_t team);
int32_t libcUnixHaikuNativeGetPortInfo(int32_t port, void* buf, uint64_t portInfoSize);
int32_t libcUnixHaikuNativeGetNextPortInfo(int32_t port, void* cookie, void* portInfo, uint64_t portInfoSize);
int32_t libcUnixHaikuNativeGetPortMessageInfoEtc(int32_t port, void* info, uint64_t infoSize, uint32_t flags, int64_t timeout);
int32_t libcUnixHaikuNativeCreateSem(int32_t count, const char* name);
int32_t libcUnixHaikuNativeDeleteSem(int32_t id);
int32_t libcUnixHaikuNativeAcquireSem(int32_t id);
int32_t libcUnixHaikuNativeAcquireSemEtc(int32_t id, int32_t count, uint32_t flags, int64_t timeout);
int32_t libcUnixHaikuNativeReleaseSem(int32_t id);
int32_t libcUnixHaikuNativeReleaseSemEtc(int32_t id, int32_t count, uint32_t flags);
int32_t libcUnixHaikuNativeSwitchSem(int32_t semToBeReleased, int32_t id);
int32_t libcUnixHaikuNativeSwitchSemEtc(int32_t semToBeReleased, int32_t id, int32_t count, uint32_t flags, int64_t timeout);
int32_t libcUnixHaikuNativeGetSemCount(int32_t id, void* threadCount);
int32_t libcUnixHaikuNativeSetSemOwner(int32_t id, int32_t team);
int32_t libcUnixHaikuNativeGetSemInfo(int32_t id, void* info, uint64_t infoSize);
int32_t libcUnixHaikuNativeGetNextSemInfo(int32_t team, void* cookie, void* info, uint64_t infoSize);
int32_t libcUnixHaikuNativeKillTeam(int32_t team);
int32_t libcUnixHaikuNativeGetTeamInfo(int32_t team, void* info, uint64_t size);
int32_t libcUnixHaikuNativeGetNextTeamInfo(void* cookie, void* info, uint64_t size);
int32_t libcUnixHaikuNativeSpawnThread(void* func, const char* name, int32_t priority, void* data);
int32_t libcUnixHaikuNativeKillThread(int32_t thread);
int32_t libcUnixHaikuNativeResumeThread(int32_t thread);
int32_t libcUnixHaikuNativeSuspendThread(int32_t thread);
int32_t libcUnixHaikuNativeRenameThread(int32_t thread, const char* newName);
int32_t libcUnixHaikuNativeSetThreadPriority(int32_t thread, int32_t newPriority);
int32_t libcUnixHaikuNativeSuggestThreadPriority(uint32_t what, int32_t period, int64_t jitter, int64_t length);
int64_t libcUnixHaikuNativeEstimateMaxSchedulingLatency(int32_t th);
void libcUnixHaikuNativeExitThread(int32_t status);
int32_t libcUnixHaikuNativeWaitForThread(int32_t thread, void* returnValue);
int32_t libcUnixHaikuNativeOnExitThread(void* callback, void* data);
int32_t libcUnixHaikuNativeFindThread(const char* name);
int32_t libcUnixHaikuNativeGetSchedulerMode(void);
int32_t libcUnixHaikuNativeSetSchedulerMode(int32_t mode);
int32_t libcUnixHaikuNativeSendData(int32_t thread, int32_t code, void* buffer, uint64_t bufferSize);
int32_t libcUnixHaikuNativeReceiveData(void* sender, void* buffer, uint64_t bufferSize);
bool libcUnixHaikuNativeHasData(int32_t thread);
int32_t libcUnixHaikuNativeSnooze(int64_t amount);
int32_t libcUnixHaikuNativeSnoozeEtc(int64_t amount, int32_t timeBase, uint32_t flags);
int32_t libcUnixHaikuNativeSnoozeUntil(int64_t arg0Time, int32_t timeBase);
int32_t libcUnixHaikuNativeGetThreadInfo(int32_t id, void* info, uint64_t size);
int32_t libcUnixHaikuNativeGetNextThreadInfo(int32_t team, void* cookie, void* info, uint64_t size);
int32_t libcUnixHaikuNativeGetPthreadThreadId(void* thread);
int32_t libcUnixHaikuNativeGetTeamUsageInfo(int32_t team, int32_t who, void* info, uint64_t size);
uint64_t libcUnixHaikuNativeRealTimeClock(void);
void libcUnixHaikuNativeSetRealTimeClock(uint64_t secsSinceJan1st1970);
int64_t libcUnixHaikuNativeRealTimeClockUsecs(void);
int64_t libcUnixHaikuNativeSystemTime(void);
int64_t libcUnixHaikuNativeSystemTimeNsecs(void);
int64_t libcUnixHaikuNativeSetAlarm(int64_t when, uint32_t flags);
void libcUnixHaikuNativeDebugger(const char* message);
int32_t libcUnixHaikuNativeDisableDebugger(int32_t state);
int32_t libcUnixHaikuNativeGetSystemInfo(void* info);
int32_t libcUnixHaikuNativeGetCpuInfoEtc(uint32_t firstCPU, uint32_t cpuCount, void* info, uint64_t size);
int32_t libcUnixHaikuNativeGetCpuTopologyInfo(void* topologyInfos, void* topologyInfoCount);
int32_t libcUnixHaikuNativeIsComputerOn(void);
double libcUnixHaikuNativeIsComputerOnFire(void);
int32_t libcUnixHaikuNativeSendSignal(int32_t threadID, uint32_t signal);
void libcUnixHaikuNativeSetSignalStack(void* base, uint64_t size);
int64_t libcUnixHaikuNativeWaitForObjects(void* infos, int32_t numInfos);
int64_t libcUnixHaikuNativeWaitForObjectsEtc(void* infos, int32_t numInfos, uint32_t flags, int64_t timeout);
int64_t libcUnixHaikuNativeFsReadAttr(int32_t fd, const char* attribute, uint32_t type, int64_t pos, void* buffer, uint64_t readBytes);
int64_t libcUnixHaikuNativeFsWriteAttr(int32_t fd, const char* attribute, uint32_t type, int64_t pos, void* buffer, uint64_t writeBytes);
int32_t libcUnixHaikuNativeFsRemoveAttr(int32_t fd, const char* attribute);
int32_t libcUnixHaikuNativeFsStatAttr(int32_t fd, const char* attribute, void* attrInfo);
int32_t libcUnixHaikuNativeFsOpenAttr(const char* path, const char* attribute, uint32_t type, int32_t openMode);
int32_t libcUnixHaikuNativeFsFopenAttr(int32_t fd, const char* attribute, uint32_t type, int32_t openMode);
int32_t libcUnixHaikuNativeFsCloseAttr(int32_t fd);
void* libcUnixHaikuNativeFsOpenAttrDir(const char* path);
void* libcUnixHaikuNativeFsLopenAttrDir(const char* path);
void* libcUnixHaikuNativeFsFopenAttrDir(int32_t fd);
int32_t libcUnixHaikuNativeFsCloseAttrDir(void* dir);
void* libcUnixHaikuNativeFsReadAttrDir(void* dir);
void libcUnixHaikuNativeFsRewindAttrDir(void* dir);
int32_t libcUnixHaikuNativeFsCreateIndex(int32_t device, const char* name, uint32_t type, uint32_t flags);
int32_t libcUnixHaikuNativeFsRemoveIndex(int32_t device, const char* name);
int32_t libcUnixHaikuNativeFsStatIndex(int32_t device, const char* name, void* indexInfo);
void* libcUnixHaikuNativeFsOpenIndexDir(int32_t device);
int32_t libcUnixHaikuNativeFsCloseIndexDir(void* indexDirectory);
void* libcUnixHaikuNativeFsReadIndexDir(void* indexDirectory);
void libcUnixHaikuNativeFsRewindIndexDir(void* indexDirectory);
int32_t libcUnixHaikuNativeDevForPath(const char* path);
int32_t libcUnixHaikuNativeNextDev(void* pos);
int32_t libcUnixHaikuNativeFsStatDev(int32_t dev, void* info);
void* libcUnixHaikuNativeFsOpenQuery(int32_t device, const char* query, uint32_t flags);
void* libcUnixHaikuNativeFsOpenLiveQuery(int32_t device, const char* query, uint32_t flags, int32_t port, int32_t token);
int32_t libcUnixHaikuNativeFsCloseQuery(void* d);
void* libcUnixHaikuNativeFsReadQuery(void* d);
int32_t libcUnixHaikuNativeGetPathForDirent(void* dent, char* buf, uint64_t len);
int32_t libcUnixHaikuNativeFsMountVolume(const char* where, const char* device, const char* filesystem, uint32_t flags, const char* parameters);
int32_t libcUnixHaikuNativeFsUnmountVolume(const char* path, uint32_t flags);
int32_t libcUnixHaikuNativeLoadImage(int32_t argc, void* argv, void* arg2Environ);
int32_t libcUnixHaikuNativeLoadAddOn(const char* path);
int32_t libcUnixHaikuNativeUnloadAddOn(int32_t image);
int32_t libcUnixHaikuNativeGetImageSymbol(int32_t image, const char* name, int32_t symbolType, void* symbolLocation);
int32_t libcUnixHaikuNativeGetNthImageSymbol(int32_t image, int32_t n, char* nameBuffer, void* nameLength, void* symbolType, void* symbolLocation);
void libcUnixHaikuNativeClearCaches(void* address, uint64_t length, uint32_t flags);
int32_t libcUnixHaikuNativeGetImageInfo(int32_t image, void* info, uint64_t size);
int32_t libcUnixHaikuNativeGetNextImageInfo(int32_t team, void* cookie, void* info, uint64_t size);
int32_t libcUnixHaikuNativeFindPath(void* codePointer, int32_t baseDirectory, const char* subPath, char* pathBuffer, uint64_t bufferSize);
int32_t libcUnixHaikuNativeFindPathEtc(void* codePointer, const char* dependency, const char* architecture, int32_t baseDirectory, const char* subPath, uint32_t flags, char* pathBuffer, uint64_t bufferSize);
int32_t libcUnixHaikuNativeFindPathForPath(const char* path, int32_t baseDirectory, const char* subPath, char* pathBuffer, uint64_t bufferSize);
int32_t libcUnixHaikuNativeFindPathForPathEtc(const char* path, const char* dependency, const char* architecture, int32_t baseDirectory, const char* subPath, uint32_t flags, char* pathBuffer, uint64_t bufferSize);
int32_t libcUnixHaikuNativeFindPaths(int32_t baseDirectory, const char* subPath, void* paths, void* pathCount);
int32_t libcUnixHaikuNativeFindPathsEtc(const char* architecture, int32_t baseDirectory, const char* subPath, uint32_t flags, void* paths, void* pathCount);
int32_t libcUnixHaikuNativeFindDirectory(int32_t which, int32_t volume, bool createIt, char* pathString, int32_t length);
int32_t libcUnixHaikuNativeGetCpuid(void* info, uint32_t eaxRegister, uint32_t cpuNum);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_HAIKU_NATIVE_UNIX_HAIKU_NATIVE_WRAPPER_H */
