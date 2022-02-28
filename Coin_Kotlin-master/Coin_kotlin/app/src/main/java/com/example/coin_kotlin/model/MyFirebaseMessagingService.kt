package com.example.coin_kotlin.model

import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import android.os.Build
import android.util.Log
import androidx.core.app.NotificationCompat
import com.example.coin_kotlin.R
import com.example.coin_kotlin.activity.Login
import com.example.coin_kotlin.info.User
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*

class MyFirebaseMessagingService : FirebaseMessagingService() {

    private val TAG = "MyFirebaseMsgService"

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)
        val title = remoteMessage.notification?.title
        val body = remoteMessage.notification?.body
        if (!title.isNullOrEmpty() && !body.isNullOrEmpty())
            sendNotification(title,body)
    }

    override fun onNewToken(newtToken: String) {
        Log.e(TAG,newtToken)
        val id = PreferenceManager.getString(this,"id")
        if(id != null && newtToken.isEmpty()){
            saveToken(newtToken)
            Repository.updateToken(id,newtToken).enqueue(object : Callback<User>{
                override fun onResponse(call: Call<User>, response: Response<User>) {
                }
                override fun onFailure(call: Call<User>, t: Throwable) {
                }
            })
        }
    }

    fun saveToken(newToken: String) {
        val originToken = PreferenceManager.getString(this, "fcmToken")

        if (originToken != newToken)
            PreferenceManager.setString(this, "fcmToken", newToken)
    }

    @SuppressLint("UnspecifiedImmutableFlag")
    fun sendNotification(title: String, messagebody: String) {
        val intent = Intent(this, Login::class.java).run {
            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        }
        val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT)
        val channel = getString(R.string.default_notification_channel_id)
        val defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)

        val notificationBuilder = NotificationCompat.Builder(this, channel)
            .setSmallIcon(R.drawable.ic__goodupcomment_post)
            .setContentTitle(title)
            .setContentText(messagebody)
            .setAutoCancel(true)
            .setSound(defaultSoundUri)
            .setContentIntent(pendingIntent)

        val notificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        notificationManager.notify(
            Calendar.getInstance().timeInMillis.toInt(), notificationBuilder.build()
        )
    }
}