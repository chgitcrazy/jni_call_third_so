LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := test
LOCAL_SRC_FILES := test.c
LOCAL_LDLIBS := -llog
LOCAL_SHARED_LIBRARIES := hich
include $(BUILD_SHARED_LIBRARY)

include $(LOCAL_PATH)/prebuilt/Android.mk