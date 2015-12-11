package com.flexvdi.androidlauncher;

public class flexJNI {
    native static void setJava();

    native static void setConnectionData(String jniHost, String jniPort, String jniWsport, String jniPassword, int enableSound);
    native static void connect();
    native static void disconnect();
    native static int isConnected();

    native static void initBuffer(int width, int height);
    native static void initScreen(double scale);
    native static int getGuestWidth();
    native static int getGuestHeight();
    native static int draw(int width, int height);
    native static int drawDisconnected(int width, int height);
    native static void requestResolution(int width, int height);
    native static void setZoomFactor(float zoom);
    native static void setZoomOffset(float offsetX, float offsetY);

    native static void sendMouseClick(int x, int y, int button, int numClicks);
    native static void sendMouseEventBegan(int x, int y, int button);
    native static void sendMouseEventMoved(int x, int y, int button);
    native static void sendMouseEventEnded(int x, int y, int button);
    native static void sendKeyEvent(int charCode, int event);

    static {
        System.loadLibrary("flexdp-jni");
    }
}