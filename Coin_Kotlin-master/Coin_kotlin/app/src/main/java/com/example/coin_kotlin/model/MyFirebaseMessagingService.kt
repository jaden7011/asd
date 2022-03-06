package com.example.coin_kotlin.model

import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.NotificationManager.IMPORTANCE_HIGH
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.media.RingtoneManager
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import com.example.coin_kotlin.R
import com.example.coin_kotlin.activity.Login
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.*

class MyFirebaseMessagingService : FirebaseMessagingService() {

    private val TAG = "MyFirebaseMsgService"

    @RequiresApi(Build.VERSION_CODES.S)
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)

        // notifiation은 background
        // data는 bacground,forground 따라서 data로 보내줘야겠는데, 방식이 어떤지 알아봐야겠다. , 그리고 테스트기기를 사용해서 테스트해봐야겠음.
        val title = remoteMessage.data["title"]
        val body = remoteMessage.data["body"]
//        val title = remoteMessage.notification?.title
//        val body = remoteMessage.notification?.body
        Log.e(TAG,"title: $title  body: $body")
        if (!title.isNullOrEmpty() && !body.isNullOrEmpty())
            sendNotification(title,body)
    }

    override fun onNewToken(newtToken: String) {
        Log.e(TAG,newtToken)
        val id = PreferenceManager.getString(this,"id")

        CoroutineScope(Dispatchers.IO).launch {
            try {
                if(id != null)
                    Repository.updateToken(id,newtToken)
                saveToken(newtToken)
            }catch (e:Exception){
                Log.e(TAG,e.message+"")
            }
        }
    }

    fun saveToken(newToken: String) {
        val originToken = PreferenceManager.getString(this, "fcmToken")

        if (originToken != newToken)
            PreferenceManager.setString(this, "fcmToken", newToken)
    }

    @RequiresApi(Build.VERSION_CODES.S)
    @SuppressLint("UnspecifiedImmutableFlag")
    fun sendNotification(title: String, body: String) {
        val intent = Intent(this, Login::class.java).run {
            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        }
        val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_MUTABLE)
        val channel = getString(R.string.default_notification_channel_id)
        val defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
        val notificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        //채널생성
        NotificationChannel(
            resources.getString(R.string.default_notification_channel_id), //채널 ID
            "COIN", //채널명
            IMPORTANCE_HIGH //알림음이 울리며 헤드업 알림 표시
        ).apply {
            enableLights(true)
            lightColor= Color.RED
            enableVibration(true)
            description = "notification"
            notificationManager.createNotificationChannel(this)
        }

        val notificationBuilder = NotificationCompat.Builder(this, channel)
            .setSmallIcon(R.drawable.ic__goodupcomment_post)
            .setContentTitle(title)
            .setContentText(body)
            .setAutoCancel(true)
            .setSound(defaultSoundUri)
            .setContentIntent(pendingIntent)

        notificationManager.notify(
            Calendar.getInstance().timeInMillis.toInt(), notificationBuilder.build()
        )
    }
}