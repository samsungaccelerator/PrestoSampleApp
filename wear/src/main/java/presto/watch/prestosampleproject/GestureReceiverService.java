package presto.watch.prestosampleproject;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import watch.nudge.gesturelibrary.AppControllerReceiverService;

public class GestureReceiverService extends AppControllerReceiverService {
    @Override
    protected Class getWatchActivityClass() {
        return MainWatchActivity.class;
    }
}
