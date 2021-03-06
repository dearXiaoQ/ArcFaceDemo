package com.arcsoft.facedetection;

import android.graphics.Rect;

/**
 * Created by xiaoQ on 2017/10/19.
 */

public class AFD_FSDKFace {
    Rect mRect;
    int mDegree;

    public AFD_FSDKFace(AFD_FSDKFace self) {
        this.mRect = new Rect(self.getRect());
        this.mDegree = self.getDegree();
    }

    public AFD_FSDKFace() {
        this.mRect = new Rect();
        this.mDegree = 0;
    }

    public Rect getRect() {
        return this.mRect;
    }

    public int getDegree() {
        return this.mDegree;
    }

    public String toString() {
        return this.mRect.toString() + "," + this.mDegree;
    }

    public AFD_FSDKFace clone() {
        return new AFD_FSDKFace(this);
    }
}
