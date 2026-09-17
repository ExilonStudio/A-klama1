<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:background="#111111"
    android:padding="20dp">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="EXILON TRACKER"
        android:textColor="#D32F2F"
        android:textSize="24sp"
        android:textStyle="bold" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Exilon Studio Mobile Core"
        android:textColor="#888888"
        android:textSize="12sp"
        android:layout_marginBottom="20dp" />

    <TextView
        android:id="@+id/txtStatus"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Durum: Motor Aktif"
        android:textColor="#FFFFFF"
        android:textSize="16sp"
        android:layout_marginBottom="10dp" />

    <Button
        android:id="@+id/btnOpenWeb"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Exilon Studio Web Portal"
        android:backgroundTint="#D32F2F"
        android:textColor="#FFFFFF" />
</LinearLayout>
