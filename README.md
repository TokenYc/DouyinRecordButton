# DouyinRecordButton
模仿抖音录制按钮，支持单击录制和长按录制。

#### 使用方法

xml中
```
 <net.archeryc.douyinrecordbutton.RecordButton
        android:id="@+id/recordButton"
        android:layout_width="150dp"
        android:layout_height="150dp"
        />
```

java代码
```
recordButton.setOnRecordStateChangedListener(new RecordButton.OnRecordStateChangedListener() {
            @Override
            public void onRecordStart() {
                
            }

            @Override
            public void onRecordStop() {
                
            }

            @Override
            public void onZoom(float percentage) {

            }
        });
```
